package com.ecohive.app.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ecohive.app.data.OrderItem
import coil3.compose.AsyncImage
import androidx.compose.ui.layout.ContentScale

@Composable
fun OrderCard(orderItem: OrderItem, modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        AsyncImage(
            model = orderItem.restaurant.imageUrl,
            contentDescription = orderItem.restaurant.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
            Text(orderItem.restaurant.name, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
            Text("${orderItem.price} RON", style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.secondary)
            Text("Delivered on ${orderItem.date} at ${orderItem.time}", style = MaterialTheme.typography.bodySmall, color = Color.Gray)
        }
    }
}