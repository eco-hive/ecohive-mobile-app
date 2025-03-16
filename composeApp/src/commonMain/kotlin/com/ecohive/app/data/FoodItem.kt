package com.ecohive.app.data

data class FoodItem(
    val picture: Int, // Resource ID for the image
    val name: String,
    val price: Double,
    val ingredients: List<String>,
    val spiceLevel: SpiceLevel,
    var quantity: Int = 1 // Default to 1
)

enum class SpiceLevel {
    NONE, MILD, MEDIUM, HOT, EXTRA_HOT
}
