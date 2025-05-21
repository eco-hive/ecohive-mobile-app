package com.ecohive.app.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ecohive.app.data.Order
import com.ecohive.app.data.User
import com.ecohive.app.ui.pages.AccountPage

@Composable
fun AccountScreen(
    user: User,
    orders: List<Order>,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        AccountPage(user, orders)
    }
}

