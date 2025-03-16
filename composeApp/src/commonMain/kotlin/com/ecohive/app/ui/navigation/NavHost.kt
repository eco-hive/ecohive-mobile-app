package com.ecohive.app.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ecohive.app.ui.screens.LandingScreen
import com.ecohive.app.ui.screens.RestaurantsScreen
import ecohive.composeapp.generated.resources.Res
import ecohive.composeapp.generated.resources.app_name
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.stringResource

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
object Notifications

@Serializable
object Account

data class BottomNavDestinations<T : Any>(
    val destination: T,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val label: String
)

val topLevelRoutes = listOf(
    BottomNavDestinations(
        Landing,
        Icons.Default.Home,
        Icons.Outlined.Home,
        "Home"
    ),
    BottomNavDestinations(
        ShoppingCart,
        Icons.Default.ShoppingCart,
        Icons.Outlined.ShoppingCart,
        "Shopping Cart"
    ),
    BottomNavDestinations(
        Notifications,
        Icons.Default.Notifications,
        Icons.Outlined.Notifications,
        "Notifications"
    ),
    BottomNavDestinations(
        Account,
        Icons.Default.Person,
        Icons.Outlined.Person,
        "Account"
    )
)


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EcoHiveApp(
    navHostController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(Res.string.app_name),
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }
            )
        },
        bottomBar = {
            BottomNavigationBar(navHostController)
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
                LandingScreen(onClick = { navHostController.navigate(Restaurants) })
            }
            composable<Restaurants> {
                //add screen here
                RestaurantsScreen(onClick = { navHostController.navigate(Landing) })
            }
            composable<ShoppingCart> {
                Text("shopping cart")
            }
            composable<Notifications> {
                Text("Notifications")
            }
            composable<Account> {
                Text("account")
            }
        }
    }

}

@Composable
private fun BottomNavigationBar(navController: NavController, modifier: Modifier = Modifier) {

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.tertiary,
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
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