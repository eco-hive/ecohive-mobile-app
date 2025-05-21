package com.ecohive.app.data

data class PaymentItem(
    val paymentMethod: String,
    val cardNumber: String? = null
)

val mockPaymentItem = PaymentItem(
    paymentMethod = "Apple Pay",
    cardNumber = "1234 5678 9012 3456",
)

val cashPaymentItem = PaymentItem(
    paymentMethod = "CASH"
)