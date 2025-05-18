package com.ecohive.app.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ecohive.app.data.mockUserItem
import com.ecohive.app.ui.pages.AccountPage

@Composable
fun AccountScreen(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        AccountPage(mockUserItem, modifier)
    }
}

