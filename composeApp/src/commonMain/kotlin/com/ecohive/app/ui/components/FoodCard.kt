package com.ecohive.app.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ecohive.app.data.FoodItem
import com.ecohive.app.data.SpiceLevel

@Composable
fun SimpleFoodCard(
    foodItem: FoodItem,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp) // FIXME: This padding will be changed to a padding size from theme
    ) {
        // Food Name
        Text(
            text = foodItem.name,
            style = MaterialTheme.typography.titleMedium,
        )

        // Food Price
        Text(
            text = "€${foodItem.price}",
            style = MaterialTheme.typography.bodyLarge,
        )

        // Food Ingredients
        Text(
            text = "Ingredients: ${foodItem.ingredients.joinToString(", ")}",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onBackground,
        )

        // Spice Level
        Text(
            text = "Spice Level: ${foodItem.spiceLevel}",
            style = MaterialTheme.typography.bodyMedium,
        )
    }
}

// Preview is only available in the android module, not in common, this will be moved eventually
@Composable
fun PreviewSimpleFoodCard() {
    SimpleFoodCard(
        foodItem = FoodItem(
            id = 1,
            imageUrl = "", // No image yet
            name = "Margherita Pizza",
            price = 12.99,
            ingredients = listOf("Tomato Sauce", "Mozzarella", "Basil"),
            spiceLevel = SpiceLevel.NONE
        )
    )
}
