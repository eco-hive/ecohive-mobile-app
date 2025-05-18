package com.ecohive.app.ui.navigation

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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
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
import com.ecohive.app.data.AvailableLocation
import com.ecohive.app.data.Restaurant
import com.ecohive.app.data.restaurantLocationList
import com.ecohive.app.ui.pages.RestaurantPage
import com.ecohive.app.ui.screens.LandingScreen
import com.ecohive.app.ui.screens.RestaurantsScreen
import kotlinx.serialization.Serializable

//enum class EcoHiveScreens() {
//    Landing,
//    Restaurants,
//    FoodItem,
//    Search,
//    Profile,
//    Order,
//    Payment,
//    Status,
//    History
//}

//declaration of screens (objects for navigation => typesafe)
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

data class BottomNavDestinations<T : Any>(
    val destination: T,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val label: String
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
    navHostController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {

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
        var locationSelected by remember { mutableStateOf(AvailableLocation.CLUJ) }
        var restaurantList: List<Restaurant> = restaurantLocationList[locationSelected] ?: emptyList()
        LaunchedEffect(locationSelected) {
            restaurantList = restaurantLocationList[locationSelected] ?: emptyList()
        }
        NavHost(
            navController = navHostController,
            startDestination = Landing,
            modifier = Modifier.fillMaxSize().padding(innerPadding)
        ) {
            composable<Landing> {
                //add screen here
                LandingScreen(
                    restaurantList = restaurantList,
                    locationSelected = locationSelected,
                    onLocationSelected = { location ->
                        // Handle location selection
                        locationSelected = location
                    },
                    goToRestaurantPage = { restaurantId ->
                        navHostController.navigate(RestaurantDetails(restaurantId))
                    }
                )
            }
            composable<Restaurants> {
                //add screen here
                RestaurantsScreen(
                    restaurantList = restaurantList,
                    onClick = { navHostController.navigate(RestaurantDetails(it)) }
                )
            }
            composable<ShoppingCart> {
                Text("shopping cart")
            }
            composable<Settings> {
                Text("Settings")
            }
            composable<Account> {
                Text("account")
            }
            composable<RestaurantDetails> { backStackEntry ->
                val restaurantDetails: RestaurantDetails = backStackEntry.toRoute()
                val restaurant = restaurantList.find { it.id == restaurantDetails.id }
                if (restaurant != null) {
                    RestaurantPage(restaurant)
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