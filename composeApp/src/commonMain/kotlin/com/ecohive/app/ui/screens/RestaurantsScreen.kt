package com.ecohive.app.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ecohive.app.data.Restaurant
import com.ecohive.app.ui.pages.RestaurantListPage

@Composable
fun RestaurantsScreen(
    restaurantList: List<Restaurant>,
    onClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
        RestaurantListPage(
            restaurants = restaurantList,
            onRestaurantClick = onClick,
            modifier = modifier.fillMaxSize()
        )

        // NOTE: Just for testing a restaurant page, can be removed
        // RestaurantPage(restaurant = mockRestaurant1, modifier = Modifier.fillMaxWidth())
}

