package com.ecohive.app.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.ecohive.app.data.Order

@Composable
fun OrderCard(order: Order, modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.padding(vertical = 8.dp)
    ) {
        AsyncImage(
            model = order.restaurant.imageUrl,
            contentDescription = order.restaurant.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
            Text(order.restaurant.name, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
            Text("${order.calculateTotalPrice()} RON", style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.secondary)
            Text("Delivered on ${order.date} at ${order.time}", style = MaterialTheme.typography.bodySmall, color = Color.Gray)
        }
    }
}