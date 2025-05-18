package com.ecohive.app.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.ecohive.app.data.FoodItem
import com.ecohive.app.data.toItemPrice

@Composable
fun FoodItemPage(
    foodItem: FoodItem,
    discount: Double,
    modifier: Modifier = Modifier,
    onClose: () -> Unit = {}
) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(modifier = Modifier.height(250.dp)) {
            AsyncImage(
                model = foodItem.imageUrl,
                contentDescription = foodItem.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth().height(200.dp)
            )
            IconButton(
                onClick = onClose,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(12.dp)
                    .background(Color.Black.copy(alpha = 0.4f), shape = RoundedCornerShape(50))
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Close",
                    tint = Color.White
                )
            }
        }

        // Food Item Name and discount
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = foodItem.name,
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.weight(1f)
                )
                Box(
                    modifier = Modifier
                        .background(
                            MaterialTheme.colorScheme.error,
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text("${discount * 100}%", color = Color.White, fontSize = 12.sp)
                }
            }

            Spacer(Modifier.height(4.dp))

            // Food Item Price (with discount applied)
            Row {
                Text(
                    text = "RON ${foodItem.price}",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        textDecoration = TextDecoration.LineThrough,
                        color = Color.Gray
                    )
                )
                Spacer(Modifier.width(8.dp))
                val discountedPrice = (foodItem.price * (1 - discount)).coerceAtLeast(0.0)
                val roundedPrice = (discountedPrice) // Round to nearest integer
                Text(
                    text = roundedPrice.toItemPrice(),
                    style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.error)
                )
            }

            Spacer(Modifier.height(12.dp))

            // Food Item Ingredients
            Text(
                text = "Ingredients:",
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold)
            )

            Text(
                text = foodItem.ingredients.joinToString(),
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(Modifier.height(24.dp))

            // Select Quantity and Add Button
            Row(verticalAlignment = Alignment.CenterVertically) {
                // Quantity selector
                Box(
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = MaterialTheme.colorScheme.tertiaryContainer,
                            shape = RoundedCornerShape(8.dp)
                        )
                        .background(Color(0xFFEFEFEF), shape = RoundedCornerShape(8.dp))
                        .padding(horizontal = 12.dp, vertical = 8.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            "-",
                            Modifier.padding(end = 8.dp),
                            color = MaterialTheme.colorScheme.onBackground,
                        )
                        Text(
                            "1",
                            Modifier.padding(horizontal = 4.dp),
                            color = MaterialTheme.colorScheme.onBackground,
                        )
                        Text(
                            "+",
                            Modifier.padding(start = 8.dp),
                            color = MaterialTheme.colorScheme.onBackground,
                        )
                    }
                }

                Spacer(Modifier.width(16.dp))

                // Add Button
                Button(
                    onClick = { /* Add to cart */ },
                    colors = ButtonDefaults.buttonColors().copy(
                        containerColor = MaterialTheme.colorScheme.tertiary,
                        contentColor = MaterialTheme.colorScheme.onTertiary
                    ),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.height(48.dp)
                ) {
                    Text("Add", color = Color.White)
                }
            }
        }
    }
}