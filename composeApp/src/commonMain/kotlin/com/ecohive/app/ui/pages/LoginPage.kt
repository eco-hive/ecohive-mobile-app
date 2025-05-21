package com.ecohive.app.ui.pages

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ecohive.composeapp.generated.resources.Res
import ecohive.composeapp.generated.resources.app_icon
import org.jetbrains.compose.resources.painterResource

@Composable
fun LoginPage(
    onNextClick: (String, String) -> Unit = { _, _ -> }, // Callback for the "Next" button with email and password
    onRegisterNowClick: () -> Unit = {}, // Callback for the "Register now" link
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top)
    ) {
        // Logo
        Icon(
            painter = painterResource(resource = Res.drawable.app_icon),
            contentDescription = "Eco Hive Logo",
            modifier = Modifier.size(80.dp),
            tint = Color.Unspecified
        )

        // App Name
        Text(
            text = "ECO HIVE",
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.tertiary,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(14.dp))

        // Welcome Back Text
        Text(
            text = "WELCOME BACK",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.tertiary
        )

        // Sign-in Description
        Text(
            text = "sign in to access your account",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(80.dp))

        // Email Input
        var email by remember { mutableStateOf("") }
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Enter your email") },
            leadingIcon = { Icon(Icons.Filled.Email, contentDescription = "Email") },
            modifier = Modifier.fillMaxWidth()
        )

        // Password Input
        var password by remember { mutableStateOf("") }
        var passwordVisible by remember { mutableStateOf(false) }
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            leadingIcon = { Icon(Icons.Filled.Lock, contentDescription = "Password") },
            trailingIcon = {
                val icon = if (passwordVisible)
                    Icons.Filled.Visibility
                else Icons.Filled.VisibilityOff

                val description = if (passwordVisible) "Hide password" else "Show password"

                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(imageVector = icon, description)
                }
            },
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        // Forgot Password
        TextButton(
            onClick = { /* TODO: Handle Forgot Password */ },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("Forget password ?", color = MaterialTheme.colorScheme.primary)
        }

        Spacer(modifier = Modifier.height(120.dp))

        // Next Button
        Button(
            onClick = { onNextClick(email, password) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiary)
        ) {
            Text("NEXT", color = Color.White, fontSize = 18.sp)
        }

        // Register Now
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically // Add this line
        ) {
            Text("New member?", color = Color.Gray)
            Spacer(modifier = Modifier.width(4.dp))
            TextButton(onClick = onRegisterNowClick) {
                Text("Register now", color = MaterialTheme.colorScheme.primary)
            }
        }
    }
}
