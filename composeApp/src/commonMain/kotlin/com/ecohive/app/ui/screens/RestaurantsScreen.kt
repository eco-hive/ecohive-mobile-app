package com.ecohive.app.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ecohive.app.data.mockRestaurant1
import com.ecohive.app.ui.pages.RestaurantPage

@Composable
fun RestaurantsScreen(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
//        TextButton(
//            onClick = onClick,
//            modifier = Modifier.fillMaxWidth(0.5f).wrapContentHeight().align(Alignment.Center),
//        ) {
//            Text("Restaurants Screen")
//        }

        // NOTE: Just for testing a restaurant page, can be removed
         RestaurantPage(restaurant = mockRestaurant1, modifier = Modifier.fillMaxWidth())
    }
}

