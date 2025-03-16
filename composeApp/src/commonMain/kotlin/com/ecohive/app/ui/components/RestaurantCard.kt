package com.ecohive.app.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import com.ecohive.app.data.Restaurant

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun RestaurantItem(
    restaurant: Restaurant,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        // TODO: Add image later

        // Restaurant Name
        Text(
            text = restaurant.name,
            style = MaterialTheme.typography.titleMedium
        )

        // Restaurant Type & Rating
        Text(
            text = "${restaurant.type.name} • ⭐ ${restaurant.rating}",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primary
        )

        // ETA & Delivery Charge
        Text(
            text = "ETA: ${restaurant.eta} • ${if (restaurant.deliveryCharge == 0.0) "Free Delivery" else "€${restaurant.deliveryCharge}"}",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}
