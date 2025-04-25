package com.ecohive.app.ui.pages

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ContactPhone
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ecohive.composeapp.generated.resources.Res
import ecohive.composeapp.generated.resources.app_icon
import org.jetbrains.compose.resources.painterResource
import androidx.compose.foundation.text.ClickableText
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.text.style.TextAlign
import com.ecohive.app.utils.openLink

@Composable
fun SignupPage(
    onNextClick: (String, String) -> Unit = { _, _ -> }, // Callback for the "Next" button with email and password
    onRegisterNowClick: () -> Unit = {}, // Callback for the "Register now" link
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
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

        // Get Started Text
        Text(
            text = "GET STARTED",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.tertiary
        )

        // Sign-up Description
        Text(
            text = "by creating a free account",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(60.dp))

        // Name Input
        var name by remember { mutableStateOf("") }
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Full name") },
            leadingIcon = { Icon(Icons.Filled.AccountBox, contentDescription = "Full Name") },
            modifier = Modifier.fillMaxWidth()
        )

        // Email Input
        var email by remember { mutableStateOf("") }
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            leadingIcon = { Icon(Icons.Filled.Email, contentDescription = "Email") },
            modifier = Modifier.fillMaxWidth()
        )

        // Phone Number Input
        var phoneNumber by remember { mutableStateOf("") }
        OutlinedTextField(
            value = phoneNumber,
            onValueChange = { phoneNumber = it },
            label = { Text("Phone number") },
            leadingIcon = { Icon(Icons.Filled.Phone, contentDescription = "Phone Number") },
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

        // Terms and Conditions Checkbox
        var isChecked by remember { mutableStateOf(false) }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = isChecked,
                onCheckedChange = { isChecked = it }
            )

            val annotatedString = buildAnnotatedString {
                pushStyle(
                    style = SpanStyle(
                        color = MaterialTheme.colorScheme.onBackground,
                    )
                )
                append("By checking the box you agree to our ")

                pushStringAnnotation(tag = "Terms", annotation = "https://example.com/terms")
                withStyle(
                    style = SpanStyle(
                        color = MaterialTheme.colorScheme.primary,
                        textDecoration = TextDecoration.Underline
                    )
                ) {
                    append("Terms and Conditions")
                }
                pop()
            }

            ClickableText(
                text = annotatedString,
                onClick = { offset ->
                    annotatedString.getStringAnnotations(
                        tag = "Terms", // match this with pushStringAnnotation
                        start = offset,
                        end = offset
                    ).firstOrNull()?.let {
                        openLink(it.item)
                    }
                },
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

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
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Already a member?", color = Color.Gray)
            Spacer(modifier = Modifier.width(4.dp))
            TextButton(onClick = onRegisterNowClick) {
                Text("Log In", color = MaterialTheme.colorScheme.primary)
            }
        }
    }
}
