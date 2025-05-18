package com.ecohive.app.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.ecohive.app.data.Restaurant
import com.ecohive.app.ui.components.SimpleFoodCard
import com.ecohive.app.ui.screens.FoodItemElement
import ecohive.composeapp.generated.resources.Res
import ecohive.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource


@Composable
fun RestaurantPage(restaurant: Restaurant, modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Column {
            // Persistent Header (Always Visible)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.background)
                    .padding(vertical = 8.dp, horizontal = 16.dp)
            ) {
                Text(
                    text = restaurant.name,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(8.dp)
                )
            }

            // Scrollable Content
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                item {
                    // Restaurant Banner
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .background(MaterialTheme.colorScheme.tertiary),
                        contentAlignment = Alignment.Center
                    ) {
                        AsyncImage(
                            model = restaurant.imageUrl,
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop,
                            error = painterResource(Res.drawable.compose_multiplatform),
                            placeholder = painterResource(Res.drawable.compose_multiplatform)
                        )
                    }

                    // Restaurant Details
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = "Rating: ${restaurant.rating} ⭐", style = MaterialTheme.typography.bodyLarge)
                        Text(text = "Delivery Charge: €${restaurant.deliveryCharge}", style = MaterialTheme.typography.bodyLarge)
                        Text(text = "ETA: ${restaurant.eta}", style = MaterialTheme.typography.bodyLarge)
                    }
                }

                // Food Categories and Items
                restaurant.menu.forEach { (category, foodItems) ->
                    item {
                        Text(
                            text = category,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                        )
                        LazyRow {
                            items(foodItems){
                                FoodItemElement(
                                    foodItem = it
                                )
                            }
                        }
                    }

                }
            }
        }
    }
}
