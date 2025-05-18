package com.ecohive.app.data

val mockRestaurant1 = Restaurant(
    id = 1,
    name = "Pasta & Pizza Hub",
    type = RestaurantType.Restaurant,
    rating = 4.5,
    deliveryCharge = 2.99,
    eta = "30-40 min",
    discountPercentage = 50,
    imageUrl = "https://images.unsplash.com/photo-1655656856175-1d55c60727bb?q=80&w=3540&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
    menu = mapOf(
        // Most Popular Items
        "Most Popular" to listOf(
            FoodItem(
                id = "1",
                imageUrl = "https://images.unsplash.com/photo-1564936281291-294551497d81?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8cGl6emElMjBtYXJnaGVyaXRhfGVufDB8fDB8fHww",
                name = "Margherita Pizza",
                price = 12.99,
                ingredients = listOf("Tomato Sauce", "Mozzarella", "Basil"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "2",
                imageUrl = "https://images.unsplash.com/photo-1572802419224-296b0aeee0d9?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2hlZXNlYnVyZ2VyfGVufDB8fDB8fHww",
                name = "Cheeseburger",
                price = 9.99,
                ingredients = listOf("Beef Patty", "Cheddar Cheese", "Lettuce", "Tomato", "Pickles"),
                spiceLevel = SpiceLevel.MILD
            )
        ),

        // Pizza
        "Pizza" to listOf(
            FoodItem(
                id = "3",
                imageUrl = "https://images.unsplash.com/photo-1628840042765-356cda07504e?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cGVwcGVyb25pJTIwcGl6emF8ZW58MHx8MHx8fDA%3D",
                name = "Pepperoni Pizza",
                price = 14.99,
                ingredients = listOf("Tomato Sauce", "Mozzarella", "Pepperoni"),
                spiceLevel = SpiceLevel.MEDIUM
            ),
            FoodItem(
                id = "4",
                imageUrl = "https://images.unsplash.com/photo-1734769484424-36b99dd84818?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8YmJxJTIwY2hpY2tlbiUyMHBpenphfGVufDB8fDB8fHww",
                name = "BBQ Chicken Pizza",
                price = 15.49,
                ingredients = listOf("BBQ Sauce", "Grilled Chicken", "Red Onion", "Mozzarella"),
                spiceLevel = SpiceLevel.HOT
            )
        ),

        // Pasta
        "Pasta" to listOf(
            FoodItem(
                id = "5",
                imageUrl = "https://images.unsplash.com/photo-1588013273468-315fd88ea34c?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8Y2FyYm9uYXJhfGVufDB8fDB8fHww",
                name = "Carbonara",
                price = 13.49,
                ingredients = listOf("Pasta", "Egg", "Bacon", "Parmesan"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "6",
                imageUrl = "https://plus.unsplash.com/premium_photo-1674511582428-58ce834ce172?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8c3BhZ2hldHRpJTIwYm9sb2duZXplfGVufDB8fDB8fHww",
                name = "Spaghetti Bolognese",
                price = 11.99,
                ingredients = listOf("Spaghetti", "Beef", "Tomato Sauce", "Garlic"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Salads
        "Salads" to listOf(
            FoodItem(
                id = "7",
                imageUrl = "https://images.unsplash.com/photo-1512852939750-1305098529bf?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2Flc2FyJTIwc2FsYWR8ZW58MHx8MHx8fDA%3D",
                name = "Caesar Salad",
                price = 8.99,
                ingredients = listOf("Romaine Lettuce", "Croutons", "Parmesan", "Caesar Dressing"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "8",
                imageUrl = "https://images.unsplash.com/photo-1549745708-fa4a8423a0b4?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGdyZWVrJTIwc2FsYWR8ZW58MHx8MHx8fDA%3D",
                name = "Greek Salad",
                price = 9.49,
                ingredients = listOf("Tomato", "Cucumber", "Feta Cheese", "Olives", "Onion"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant2 = Restaurant(
    id = 2,
    name = "The Gourmet Bakery",
    type = RestaurantType.Bakery,
    rating = 4.7,
    deliveryCharge = 1.99,
    eta = "25-35 min",
    discountPercentage = 20,
    imageUrl = "https://images.unsplash.com/photo-1483695028939-5bb13f8648b0?q=80&w=3540&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
    menu = mapOf(
        // Breads
        "Breads" to listOf(
            FoodItem(
                id = "9",
                imageUrl = "https://plus.unsplash.com/premium_photo-1661673920262-1dd7abc2faa7?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTN8fHNvdXJkb3VnaCUyMGJyZWFkfGVufDB8fDB8fHww",
                name = "Sourdough Bread",
                price = 5.99,
                ingredients = listOf("Flour", "Water", "Salt", "Yeast"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "10",
                imageUrl = "https://images.unsplash.com/photo-1549931319-a545dcf3bc73?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8d2hvbGUlMjB3aGVhdCUyMGJyZWFkfGVufDB8fDB8fHww",
                name = "Whole Wheat Bread",
                price = 4.99,
                ingredients = listOf("Whole Wheat Flour", "Water", "Salt", "Yeast"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Pastries
        "Pastries" to listOf(
            FoodItem(
                id = "11",
                imageUrl = "https://images.unsplash.com/photo-1599940778173-e276d4acb2bb?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8Y3JvaXNzYW50fGVufDB8fDB8fHww",
                name = "Croissant",
                price = 3.49,
                ingredients = listOf("Butter", "Flour", "Yeast", "Milk"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "12",
                imageUrl = "https://images.unsplash.com/photo-1613994747257-20e333b5f76e?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fGNob2NvbGF0ZSUyMGRhbmlzaHxlbnwwfHwwfHx8MA%3D%3D",
                name = "Chocolate Danish",
                price = 4.29,
                ingredients = listOf("Pastry Dough", "Chocolate", "Butter"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Cakes
        "Cakes" to listOf(
            FoodItem(
                id = "13",
                imageUrl = "https://images.unsplash.com/photo-1586788680434-30d324b2d46f?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cmVkJTIwdmVsdmV0JTIwY2FrZXxlbnwwfHwwfHx8MA%3D%3D",
                name = "Red Velvet Cake",
                price = 15.99,
                ingredients = listOf("Cocoa", "Cream Cheese Frosting", "Sugar", "Flour"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "14",
                imageUrl = "https://images.unsplash.com/photo-1631206753348-db44968fd440?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fHRpcmFtaXN1fGVufDB8fDB8fHww",
                name = "Tiramisu",
                price = 14.49,
                ingredients = listOf("Mascarpone", "Coffee", "Ladyfingers", "Cocoa Powder"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant3 = Restaurant(
    id = 3,
    name = "Spicy Indian Kitchen",
    type = RestaurantType.Restaurant,
    rating = 4.8,
    deliveryCharge = 3.49,
    eta = "40-50 min",
    discountPercentage = 30,
    imageUrl = "https://images.unsplash.com/photo-1720777636417-bc75f5203e38?q=80&w=2526&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
    menu = mapOf(
        // Starters
        "Starters" to listOf(
            FoodItem(
                id = "15",
                imageUrl = "https://images.unsplash.com/photo-1601050690597-df0568f70950?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8c2Ftb3NhfGVufDB8fDB8fHww",
                name = "Samosa",
                price = 6.99,
                ingredients = listOf("Potatoes", "Peas", "Spices", "Flour"),
                spiceLevel = SpiceLevel.MEDIUM
            ),
            FoodItem(
                id = "16",
                imageUrl = "https://images.unsplash.com/photo-1567188040759-fb8a883dc6d8?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cGFuZWVyJTIwdGlra2F8ZW58MHx8MHx8fDA%3D",
                name = "Paneer Tikka",
                price = 8.99,
                ingredients = listOf("Paneer", "Yogurt", "Spices", "Bell Peppers"),
                spiceLevel = SpiceLevel.HOT
            )
        ),

        // Main Course
        "Main Course" to listOf(
            FoodItem(
                id = "17",
                imageUrl = "https://images.unsplash.com/photo-1610057099443-fde8c4d50f91?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8YnV0dGVyJTIwY2hpY2tlbnxlbnwwfHwwfHx8MA%3D%3D",
                name = "Butter Chicken",
                price = 16.99,
                ingredients = listOf("Chicken", "Tomato Gravy", "Butter", "Cream"),
                spiceLevel = SpiceLevel.MEDIUM
            ),
            FoodItem(
                id = "18",
                imageUrl = "https://images.unsplash.com/photo-1589647363585-f4a7d3877b10?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cGFsYWslMjBwYW5lZXJ8ZW58MHx8MHx8fDA%3D",
                name = "Palak Paneer",
                price = 14.49,
                ingredients = listOf("Spinach", "Paneer", "Garlic", "Spices"),
                spiceLevel = SpiceLevel.MILD
            )
        ),
    )
)

private val restaurantList = listOf(mockRestaurant1, mockRestaurant2, mockRestaurant3)

val clujRestaurantList = listOf(
    mockRestaurant1,
    mockRestaurant2,
    mockRestaurant3,
)

//todo add more test data so that it looks better

val restaurantLocationList = mapOf<AvailableLocation, List<Restaurant>>(
    AvailableLocation.CLUJ to restaurantList,
    AvailableLocation.BRASOV to emptyList(),
    AvailableLocation.SIBIU to restaurantList.subList(0,1),
    AvailableLocation.TIMISOARA to restaurantList,
    AvailableLocation.ORADEA to restaurantList,
    AvailableLocation.BUCURESTI to restaurantList
)

