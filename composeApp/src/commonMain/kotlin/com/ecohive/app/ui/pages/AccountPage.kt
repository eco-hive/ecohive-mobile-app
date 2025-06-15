package com.ecohive.app.ui.pages

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ecohive.app.data.Order
import com.ecohive.app.data.User
import com.ecohive.app.ui.components.OrderCard
import com.ecohive.app.ui.components.ProfileCard

@Composable
fun AccountPage(user: User, orders: List<Order>, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Hello, Name
        Text(
            text = "Hello, ${user.name}",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        // Profile Section
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                "Profile",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
            IconButton(onClick = { /* TODO: Handle Edit Profile */ }) {
                Icon(Icons.Filled.Edit, contentDescription = "Edit Profile", tint = MaterialTheme.colorScheme.tertiary)
            }
        }
        ProfileCard(user = user)
        HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp))

        // Payment Section
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                "Payment",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
            IconButton(onClick = { /* TODO: Handle Edit Payment */ }) {
                Icon(Icons.Filled.Edit, contentDescription = "Edit Payment", tint = MaterialTheme.colorScheme.tertiary)
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 4.dp)
        ) {
            Icon(Icons.Filled.CreditCard, contentDescription = "Payment Method", modifier = Modifier.size(24.dp), tint = Color.Gray)
            Spacer(modifier = Modifier.width(8.dp))
            Text(user.payment.paymentMethod, style = MaterialTheme.typography.bodyLarge)
        }
        HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp))

        // Order History Section
        Text(
            "Order history",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        LazyColumn {
            items(orders) { order ->
                OrderCard(order = order)
                HorizontalDivider()
            }
        }
    }
}