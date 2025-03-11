package com.ecohive.app

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.ecohive.app.ui.navigation.EcoHiveApp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        EcoHiveApp()
    }
}