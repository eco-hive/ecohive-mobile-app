package com.ecohive.app.ui.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.ecohive.app.data.FoodItem
import com.ecohive.app.data.SpiceLevel
import com.example.compose.errorLight
import com.example.compose.tertiaryContainerDarkMediumContrast
import com.example.compose.tertiaryContainerLight
import com.example.compose.tertiaryLight
import kotlin.math.round

@Composable
fun FoodItemPage(foodItemId: String, discount: Int, modifier: Modifier = Modifier, onClose: () -> Unit = {}) {
    // Mock data for now -- this will need to be either a lookup/have the foodItem given as parameter
    // from the restaurant
    val foodItem = FoodItem(
        id = "1",
        imageUrl = "https://www.grandecheese.com/wp-content/uploads/2021/01/Margherita-Pizza-deck-oven.jpg",
        name = "Margherita Pizza",
        price = 12.99,
        ingredients = listOf("Tomato Sauce", "Mozzarella", "Basil"),
        spiceLevel = SpiceLevel.NONE
    )

    Column(modifier = modifier.fillMaxSize()) {
        // Image Banner Component
        Box(modifier = modifier.height(250.dp)) {
            AsyncImage(
                model = foodItem.imageUrl,
                contentDescription = foodItem.name,
                contentScale = ContentScale.Crop,
                modifier = modifier.fillMaxWidth().height(200.dp)
            )
            IconButton(
                onClick = onClose,
                modifier = modifier
                    .align(Alignment.TopStart)
                    .padding(12.dp)
                    .background(Color.Black.copy(alpha = 0.4f), shape = RoundedCornerShape(50))
            ) {
                Icon(imageVector = Icons.Default.Close, contentDescription = "Close", tint = Color.White)
            }
        }

        // Food Item Name and discount
        Column(modifier = modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = foodItem.name,
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = modifier.weight(1f)
                )
                Box(
                    modifier = modifier
                        .background(MaterialTheme.colorScheme.error, shape = RoundedCornerShape(4.dp))
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text("${discount}%", color = Color.White, fontSize = 12.sp)
                }
            }

            Spacer(modifier.height(4.dp))

            // Food Item Price (with discount applied)
            Row {
                Text(
                    text = "RON ${foodItem.price}",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        textDecoration = TextDecoration.LineThrough,
                        color = Color.Gray
                    )
                )
                Spacer(modifier.width(8.dp))
                val discountedPrice = (foodItem.price * (100 - discount)) / 100.0
                val roundedPrice = (discountedPrice * 100).toInt() / 100.0
                Text(
                    text = "RON ${roundedPrice}",
                    style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.error)
                )
            }

            Spacer(modifier.height(12.dp))

            // Food Item Ingredients
            Text(
                text = "Ingredients:",
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
            )

            Text(
                text = foodItem.ingredients.joinToString(),
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier.height(24.dp))

            // Select Quantity and Add Button
            Row(verticalAlignment = Alignment.CenterVertically) {
                // Quantity selector
                Box(
                    modifier = modifier
                        .border(
                            width = 1.dp,
                            color = MaterialTheme.colorScheme.tertiaryContainer, // or Color.Gray, Color(0xFF...)
                            shape = RoundedCornerShape(8.dp) // optional, makes corners rounded
                        )
                        .background(Color(0xFFEFEFEF), shape = RoundedCornerShape(8.dp))
                        .padding(horizontal = 12.dp, vertical = 8.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("-", modifier.padding(end = 8.dp), color = MaterialTheme.colorScheme.onBackground,)
                        Text("1", modifier.padding(horizontal = 4.dp), color = MaterialTheme.colorScheme.onBackground,)
                        Text("+", modifier.padding(start = 8.dp), color = MaterialTheme.colorScheme.onBackground,)
                    }
                }

                Spacer(modifier.width(16.dp))

                // Add Button
                Button(
                    onClick = { /* Add to cart */ },
                    colors = ButtonDefaults.buttonColors().copy(
                        containerColor = MaterialTheme.colorScheme.tertiary,
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(8.dp),
                    modifier = modifier.height(48.dp)
                ) {
                    Text("ADD", color = Color.White)
                }
            }
        }
    }
}