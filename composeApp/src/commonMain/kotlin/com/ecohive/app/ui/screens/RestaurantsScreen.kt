package com.ecohive.app.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun RestaurantsScreen(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        TextButton(
            onClick = onClick,
            modifier = Modifier.fillMaxWidth(0.5f).wrapContentHeight().align(Alignment.Center),
            colors = ButtonDefaults.textButtonColors(backgroundColor = Color.LightGray)
        ) {
            Text("Restaurants Screen")
        }
    }
}