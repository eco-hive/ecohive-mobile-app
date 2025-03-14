package com.ecohive.app.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
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
        }
    }

}