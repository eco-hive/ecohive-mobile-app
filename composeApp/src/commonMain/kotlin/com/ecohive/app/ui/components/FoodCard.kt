package com.ecohive.app.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ecohive.app.data.FoodItem
import com.ecohive.app.data.SpiceLevel

@Composable
fun SimpleFoodCard(foodItem: FoodItem) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Food Name
        Text(
            text = foodItem.name,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        // Food Price
        Text(
            text = "€${foodItem.price}",
            fontSize = 16.sp
        )

        // Food Ingredients
        Text(
            text = "Ingredients: ${foodItem.ingredients.joinToString(", ")}",
            fontSize = 14.sp,
            color = Color.Gray
        )

        // Spice Level
        Text(
            text = "Spice Level: ${foodItem.spiceLevel}",
            fontSize = 14.sp
        )
    }
}

// Preview is only available in the android module, not in common, this will be moved eventually
@Composable
fun PreviewSimpleFoodCard() {
    SimpleFoodCard(
        foodItem = FoodItem(
            picture = 0, // No image yet
            name = "Margherita Pizza",
            price = 12.99,
            ingredients = listOf("Tomato Sauce", "Mozzarella", "Basil"),
            spiceLevel = SpiceLevel.NONE
        )
    )
}
