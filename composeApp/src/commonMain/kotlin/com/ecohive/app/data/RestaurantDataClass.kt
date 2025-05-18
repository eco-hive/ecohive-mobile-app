package com.ecohive.app.data

// FIXME: This name is subject to change bc in the app there will be groceries, restaurants, bakeries
// which will all be represented by this data class. We do not want confusion between the Restaurant
// data class and the "restaurant" type of place where the client can order.
data class Restaurant(
    val id: Int,
    val name: String,
    val type: RestaurantType, // e.g. restaurant, grocery
    val rating: Double,
    val deliveryCharge: Double,
    val discountPercentage: Int,
    val eta: String,
    val imageUrl: String, // URL for the restaurant's image
    val menu: Map<String, List<FoodItem>> // Categories like "Most Popular", "Pizza", etc.
)

enum class RestaurantType {
    Restaurant, Bakery, Grocery, FastFood, Cafe
}

