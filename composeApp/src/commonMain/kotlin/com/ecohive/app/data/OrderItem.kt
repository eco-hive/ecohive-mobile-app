package com.ecohive.app.data

data class OrderItem(
    val restaurant: Restaurant,
    val price: Double,
    val date: String,
    val time: String,
)

val mockOrderItem1 = OrderItem(
    restaurant = mockRestaurant1,
    price = 20.00,
    date = "2025-01-01",
    time = "14:00",
)

val mockOrderItem2 = OrderItem(
    restaurant = mockRestaurant2,
    price = 24.99,
    date = "2025-02-14",
    time = "12:33",
)

val mockOrderItem3 = OrderItem(
    restaurant = mockRestaurant3,
    price = 19.80,
    date = "2025-03-25",
    time = "18:45",
)
