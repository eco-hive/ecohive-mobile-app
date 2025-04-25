package com.ecohive.app.data

data class UserItem(
    val name: String,
    val email: String,
    val phone: String,
    val payment: PaymentItem,
    val orders: List<OrderItem>
)

val mockUserItem = UserItem(
    name = "Jamila Cuisine",
    email = "jamila_cuisine@gmail.com",
    phone = "+078901234567",
    payment = mockPaymentItem,
    orders = listOf(mockOrderItem1, mockOrderItem2, mockOrderItem3)
)