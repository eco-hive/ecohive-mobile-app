package com.ecohive.app.data

data class OrderItem(
    val orderID: Int,
    val foodItem: FoodItem,
    val quantity: Int,
    val restaurant: Restaurant
) {
    val totalPrice: Double
        get() = foodItem.price * quantity * restaurant.discountPercentage
    val totalDiscount: Double
        get() = foodItem.price * quantity * (1 - restaurant.discountPercentage)
    val subTotal: Double
        get() = foodItem.price * quantity
}

data class Order(
    val orderID: Int,
    val restaurant: Restaurant,
    val items: List<OrderItem>,
    val date: String,
    val time: String
) {
    fun calculateTotalPrice(): Double {
        return items.sumOf { it.totalPrice }
    }

    fun calculateTotalDiscount(): Double {
        return items.sumOf { it.totalDiscount }
    }

    fun calculateSubTotal(): Double {
        return items.sumOf { it.subTotal }
    }
}

fun Double.toItemPrice(): String = "${this.roundToTwoDecimals()} RON"