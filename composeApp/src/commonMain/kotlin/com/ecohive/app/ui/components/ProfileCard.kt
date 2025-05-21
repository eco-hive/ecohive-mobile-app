package com.ecohive.app.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ecohive.app.data.User

@Composable
fun ProfileCard(user: User, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(vertical = 8.dp)
    ) {
        // Name
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 4.dp)
        ) {
            Icon(Icons.Filled.AccountBox, contentDescription = "Full Name", modifier = Modifier.size(24.dp), tint = Color.Gray)
            Spacer(modifier = Modifier.width(8.dp))
            Text(user.name, style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.onBackground)
        }

        // Phone Number
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 4.dp)
        ) {
            Icon(Icons.Filled.Phone, contentDescription = "Phone Number", modifier = Modifier.size(24.dp), tint = Color.Gray)
            Spacer(modifier = Modifier.width(8.dp))
            Text(user.phone, style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.onBackground)
        }

        // Email
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 4.dp)
        ) {
            Icon(Icons.Filled.Email, contentDescription = "Email", modifier = Modifier.size(24.dp), tint = Color.Gray)
            Spacer(modifier = Modifier.width(8.dp))
            Text(user.email, style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.onBackground)
        }
    }
}