package com.ecohive.app.data

data class User(
    val name: String,
    val email: String,
    val phone: String,
    val payment: PaymentItem
)

val mockUserItem = User(
    name = "Jamila Cuisine",
    email = "jamila_cuisine@gmail.com",
    phone = "+078901234567",
    payment = cashPaymentItem
)