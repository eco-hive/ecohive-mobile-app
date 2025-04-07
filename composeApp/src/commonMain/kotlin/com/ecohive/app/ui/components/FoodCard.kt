package com.ecohive.app.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.ecohive.app.data.FoodItem
import com.ecohive.app.data.SpiceLevel

@Composable
fun SimpleFoodCard(
    foodItem: FoodItem,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Left: Food info
        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            Text(
                text = foodItem.name,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = foodItem.ingredients.joinToString(", "),
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onBackground
            )

            Text(
                text = "€${foodItem.price}",
                style = MaterialTheme.typography.bodyLarge
            )
        }

        // Right: Image
        AsyncImage(
            model = foodItem.imageUrl,
            contentDescription = "Food Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(8.dp))
        )
    }
}

// Preview is only available in the android module, not in common, this will be moved eventually
@Composable
fun PreviewSimpleFoodCard() {
    SimpleFoodCard(
        foodItem = FoodItem(
            imageUrl = "", // No image yet
            name = "Margherita Pizza",
            price = 12.99,
            ingredients = listOf("Tomato Sauce", "Mozzarella", "Basil"),
            spiceLevel = SpiceLevel.NONE
        )
    )
}
