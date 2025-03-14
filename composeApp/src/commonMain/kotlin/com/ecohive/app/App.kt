package com.ecohive.app

import androidx.compose.runtime.Composable
import com.ecohive.app.ui.navigation.EcoHiveApp
import com.example.compose.EcoHiveAppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    EcoHiveAppTheme {
        EcoHiveApp()
    }
}