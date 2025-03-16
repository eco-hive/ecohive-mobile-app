package com.ecohive.app.data

// FIXME: This name is subject to change bc in the app there will be groceries, restaurants, bakeries
// which will all be represented by this data class. We do not want confusion between the Restaurant
// data class and the "restaurant" type of place where the client can order.
data class Restaurant(
    val name: String,
    val type: RestaurantType, // e.g. restaurant, grocery
    val banner: Int, // Image resource ID
    val rating: Double,
    val deliveryCharge: Double,
    val eta: String,
    val menu: Map<String, List<FoodItem>> // Categories like "Most Popular", "Pizza", etc.
)

// TODO: Maybe add more
enum class RestaurantType {
    Restaurant, Bakery, Grocery, FastFood,
}

// NOTE: This is only one restaurant, for now
val mockRestaurant = Restaurant(
    name = "Pasta & Pizza Hub",
    type = RestaurantType.FastFood,
    banner = 1,
    rating = 4.5,
    deliveryCharge = 2.99,
    eta = "30-40 min",
    menu = mapOf(
        // Most Popular Items
        "Most Popular" to listOf(
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
            )
        ),

        // Pizza
        "Pizza" to listOf(
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
            )
        ),

        // Pasta
        "Pasta" to listOf(
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
            )
        ),

        // Salads
        "Salads" to listOf(
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
            )
        )
    )
)
