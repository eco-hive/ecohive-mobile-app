package com.ecohive.app.data

data class PaymentItem(
    val paymentMethod: String,
    val cardNumber: String,
)

val mockPaymentItem = PaymentItem(
    paymentMethod = "Apple Pay",
    cardNumber = "1234 5678 9012 3456",
)