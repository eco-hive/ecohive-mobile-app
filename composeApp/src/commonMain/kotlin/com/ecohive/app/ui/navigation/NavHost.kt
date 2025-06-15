package com.ecohive.app.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Restaurant
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.ecohive.app.data.restaurantLocationList
import com.ecohive.app.ui.pages.FoodItemPage
import com.ecohive.app.ui.pages.RestaurantPage
import com.ecohive.app.ui.screens.LandingScreen
import com.ecohive.app.ui.screens.AccountScreen
import com.ecohive.app.ui.screens.RestaurantsScreen
import com.ecohive.app.ui.screens.ShoppingCartScreen
import kotlinx.coroutines.flow.filter
import kotlinx.serialization.Serializable

@Serializable
object Landing

@Serializable
object Restaurants

@Serializable
object ShoppingCart

@Serializable
object Settings

@Serializable
object Account

@Serializable
data class RestaurantDetails(val id: Int)

@Serializable
data class FoodItemDetails(val restaurantId: Int, val foodItemId: Int)

data class BottomNavDestinations<T : Any>(
    val destination: T,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val label: String,
)

@Composable
fun topLevelDestinations() = listOf(
    BottomNavDestinations(
        Landing,
        Icons.Default.Home,
        Icons.Outlined.Home,
        "Home"
    ),
    BottomNavDestinations(
        Restaurants,
        Icons.Default.Restaurant,
        Icons.Outlined.Restaurant,
        "Restaurants"
    ),
    BottomNavDestinations(
        Settings,
        Icons.Default.Settings,
        Icons.Outlined.Settings,
        "Settings"
    ),
    BottomNavDestinations(
        Account,
        Icons.Default.AccountCircle,
        Icons.Outlined.AccountCircle,
        "Account"
    )
)


@Composable
fun EcoHiveApp(
    modifier: Modifier = Modifier,
    navHostController: NavHostController = rememberNavController(),
    appViewModel: AppViewModel = viewModel { AppViewModel() },
) {
    val selectedLocation by appViewModel.selectedLocation.collectAsStateWithLifecycle()
    val restaurantList by appViewModel.restaurantList.collectAsStateWithLifecycle(emptyList())
    val currentOrder by appViewModel.currentOrder.collectAsStateWithLifecycle()
    val currentUser by appViewModel.currentUser.collectAsStateWithLifecycle()
    val allOrders by appViewModel.allOrders.collectAsStateWithLifecycle()
    Scaffold(
        bottomBar = {
            val currentDestination =
                navHostController.currentBackStackEntryAsState().value?.destination
            if (topLevelDestinations().any { topLevel ->
                    currentDestination?.hierarchy?.any { it.hasRoute(topLevel.destination::class) } == true
                }) {
                BottomNavigationBar(navHostController)
            }
        },
        modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navHostController,
            startDestination = Landing,
            modifier = Modifier.fillMaxSize().padding(innerPadding)
        ) {
            composable<Landing> {
                //add screen here
                LandingScreen(
                    restaurantList = restaurantList,
                    locationSelected = selectedLocation,
                    onLocationSelected = appViewModel::selectNewLocation,
                    goToRestaurantPage = { restaurantId ->
                        navHostController.navigate(RestaurantDetails(restaurantId))
                    },
                    onCartClicked = {
                        navHostController.navigate(ShoppingCart)
                    },
                    goToFoodItemDetailsPage = { restaurantId, foodItemId ->
                        navHostController.navigate(FoodItemDetails(restaurantId, foodItemId))
                    },
                )
            }
            composable<Restaurants> {
                //add screen here
                RestaurantsScreen(
                    restaurantList = restaurantList,
                    onClick = { navHostController.navigate(RestaurantDetails(it)) }
                )
            }
            composable<Settings> {
                Text("Settings")
            }
            composable<Account> {

                AccountScreen(
                    user = currentUser,
                    orders = allOrders
                )
            }
            composable<RestaurantDetails> { backStackEntry ->
                val restaurantDetails: RestaurantDetails = backStackEntry.toRoute()
                val restaurant = restaurantList.find { it.id == restaurantDetails.id }
                if (restaurant != null) {
                    RestaurantPage(
                        restaurant = restaurant,
                        goToFoodItemDetails = { foodItemId ->
                            navHostController.navigate(FoodItemDetails(restaurant.id, foodItemId))
                        },
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
            composable<ShoppingCart> {
                if (currentOrder != null) {
                    ShoppingCartScreen(
                        currentOrder = currentOrder!!,
                        onItemClick = { orderItem ->
                            // Handle item click
                            navHostController.navigate(
                                FoodItemDetails(
                                    restaurantId = currentOrder!!.restaurant.id,
                                    foodItemId = orderItem.foodItem.id
                                )
                            )
                        },
                        onPlaceOrder = {
                            appViewModel.placeOrder()
                        },
                        onAddMoreClick = {
                            //goto restaurant page
                            navHostController.navigate(RestaurantDetails(currentOrder!!.restaurant.id))
                        },
                        onBackClick = {
                            navHostController.popBackStack()
                        },
                        onChangeOrderItem = { foodItem, quantity ->
                            appViewModel.addFoodItemToCart(
                                restaurantID = currentOrder!!.restaurant.id,
                                foodItem = foodItem,
                                newQuantity = quantity,
                            )

                        },
                        onGoToAccountScreen = {
                            navHostController.popBackStack()
                            navHostController.navigate(Account)
                        },
                        modifier = Modifier.fillMaxSize()
                    )
                } else {
                    Box(modifier.fillMaxSize()) {
                        Text(
                            text = "Your cart is empty!",
                            style = MaterialTheme.typography.headlineSmall,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
            }
            composable<FoodItemDetails> { backStackEntry ->
                val foodItemDetails: FoodItemDetails = backStackEntry.toRoute()
                val restaurant = restaurantList.find { it.id == foodItemDetails.restaurantId }
                val foodItem = restaurant?.menu?.values?.flatten()
                    ?.find { it.id == foodItemDetails.foodItemId }
                if (foodItem != null) {
                    // Show food item details
                    FoodItemPage(
                        foodItem = foodItem,
                        discount = restaurant.discountPercentage,
                        onClose = {
                            navHostController.popBackStack()
                        },
                        onAddItemToCart = { quantity ->
                            val currentOrderQuantity =
                                currentOrder?.items?.filter { it.foodItem == foodItem }
                                    ?.map { it.quantity }?.firstOrNull() ?: 0
                            appViewModel.addFoodItemToCart(
                                restaurant.id,
                                newQuantity = quantity + currentOrderQuantity,
                                foodItem = foodItem
                            )
                            navHostController.popBackStack()
                        },
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
private fun BottomNavigationBar(navController: NavController, modifier: Modifier = Modifier) {

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.tertiary,
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        val topLevelRoutes = topLevelDestinations()
        topLevelRoutes.forEach { topLevelRoute ->
            val selected =
                currentDestination?.hierarchy?.any { it.hasRoute(topLevelRoute.destination::class) } == true
            NavigationBarItem(
                icon = {
                    Icon(
                        if (selected) topLevelRoute.selectedIcon else topLevelRoute.unselectedIcon,
                        contentDescription = topLevelRoute.label
                    )
                },
                selected = selected,
                onClick = {
                    navController.navigate(topLevelRoute.destination) {
                        // Pop up to the start destination of the graph to
                        // avoid building up a large stack of destinations
                        // on the back stack as users select items
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        // Avoid multiple copies of the same destination when
                        // reselecting the same item
                        launchSingleTop = true
                        // Restore state when reselecting a previously selected item
                        restoreState = true
                    }
                },
                colors = NavigationBarItemDefaults.colors().copy(
                    selectedIconColor = MaterialTheme.colorScheme.background,
                    unselectedIconColor = MaterialTheme.colorScheme.background,
                    selectedIndicatorColor = MaterialTheme.colorScheme.background.copy(alpha = 0.3f)
                )
            )
        }
    }
}