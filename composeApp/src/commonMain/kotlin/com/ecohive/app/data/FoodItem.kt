package com.ecohive.app.data

data class FoodItem(
    val imageUrl: String,
    val name: String,
    val price: Double,
    val ingredients: List<String>,
    val spiceLevel: SpiceLevel,
    var quantity: Int = 1 // Default to 1
)

enum class SpiceLevel {
    NONE, MILD, MEDIUM, HOT, EXTRA_HOT
}

val mockFoodItems = listOf(
    // Most Popular
    FoodItem(
        imageUrl = "",
        name = "Margherita Pizza",
        price = 12.99,
        ingredients = listOf("Tomato Sauce", "Mozzarella", "Basil"),
        spiceLevel = SpiceLevel.NONE
    ),
    FoodItem(
        imageUrl = "",
        name = "Cheeseburger",
        price = 9.99,
        ingredients = listOf("Beef Patty", "Cheddar Cheese", "Lettuce", "Tomato", "Pickles"),
        spiceLevel = SpiceLevel.MILD
    ),

    // Pasta
    FoodItem(
        imageUrl = "",
        name = "Carbonara",
        price = 13.49,
        ingredients = listOf("Pasta", "Egg", "Bacon", "Parmesan"),
        spiceLevel = SpiceLevel.NONE
    ),
    FoodItem(
        imageUrl = "",
        name = "Spaghetti Bolognese",
        price = 11.99,
        ingredients = listOf("Spaghetti", "Beef", "Tomato Sauce", "Garlic"),
        spiceLevel = SpiceLevel.NONE
    ),

    // Pizza
    FoodItem(
        imageUrl = "",
        name = "Pepperoni Pizza",
        price = 14.99,
        ingredients = listOf("Tomato Sauce", "Mozzarella", "Pepperoni"),
        spiceLevel = SpiceLevel.MEDIUM
    ),
    FoodItem(
        imageUrl = "",
        name = "BBQ Chicken Pizza",
        price = 15.49,
        ingredients = listOf("BBQ Sauce", "Grilled Chicken", "Red Onion", "Mozzarella"),
        spiceLevel = SpiceLevel.HOT
    ),

    // Salads
    FoodItem(
        imageUrl = "",
        name = "Caesar Salad",
        price = 8.99,
        ingredients = listOf("Romaine Lettuce", "Croutons", "Parmesan", "Caesar Dressing"),
        spiceLevel = SpiceLevel.NONE
    ),
    FoodItem(
        imageUrl = "",
        name = "Greek Salad",
        price = 9.49,
        ingredients = listOf("Tomato", "Cucumber", "Feta Cheese", "Olives", "Onion"),
        spiceLevel = SpiceLevel.NONE
    ),

    // Spicy Options
    FoodItem(
        imageUrl = "",
        name = "Spicy Chicken Wings",
        price = 10.99,
        ingredients = listOf("Chicken Wings", "Buffalo Sauce", "Ranch Dressing"),
        spiceLevel = SpiceLevel.EXTRA_HOT
    ),
    FoodItem(
        imageUrl = "",
        name = "Spicy Beef Taco",
        price = 7.99,
        ingredients = listOf("Tortilla", "Ground Beef", "Jalapeños", "Cheese", "Salsa"),
        spiceLevel = SpiceLevel.HOT
    )
)
