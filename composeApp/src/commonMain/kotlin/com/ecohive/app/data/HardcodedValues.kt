package com.ecohive.app.data

val mockRestaurant1 = Restaurant(
    id = 1,
    name = "Pasta & Pizza Hub",
    type = RestaurantType.Restaurant,
    rating = 4.5,
    deliveryCharge = 2.00,
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
                price = 12.00,
                ingredients = listOf("Tomato Sauce", "Mozzarella", "Basil"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "2",
                imageUrl = "https://images.unsplash.com/photo-1572802419224-296b0aeee0d9?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2hlZXNlYnVyZ2VyfGVufDB8fDB8fHww",
                name = "Cheeseburger",
                price = 9.00,
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
                price = 14.00,
                ingredients = listOf("Tomato Sauce", "Mozzarella", "Pepperoni"),
                spiceLevel = SpiceLevel.MEDIUM
            ),
            FoodItem(
                id = "4",
                imageUrl = "https://images.unsplash.com/photo-1734769484424-36b99dd84818?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8YmJxJTIwY2hpY2tlbiUyMHBpenphfGVufDB8fDB8fHww",
                name = "BBQ Chicken Pizza",
                price = 15.00,,
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
                price = 13.00,,
                ingredients = listOf("Pasta", "Egg", "Bacon", "Parmesan"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "6",
                imageUrl = "https://plus.unsplash.com/premium_photo-1674511582428-58ce834ce172?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8c3BhZ2hldHRpJTIwYm9sb2duZXplfGVufDB8fDB8fHww",
                name = "Spaghetti Bolognese",
                price = 11.00,
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
                price = 8.00,
                ingredients = listOf("Romaine Lettuce", "Croutons", "Parmesan", "Caesar Dressing"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "8",
                imageUrl = "https://images.unsplash.com/photo-1549745708-fa4a8423a0b4?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGdyZWVrJTIwc2FsYWR8ZW58MHx8MHx8fDA%3D",
                name = "Greek Salad",
                price = 9.00,,
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
    deliveryCharge = 1.00,
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
                price = 5.00,
                ingredients = listOf("Flour", "Water", "Salt", "Yeast"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "10",
                imageUrl = "https://images.unsplash.com/photo-1549931319-a545dcf3bc73?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8d2hvbGUlMjB3aGVhdCUyMGJyZWFkfGVufDB8fDB8fHww",
                name = "Whole Wheat Bread",
                price = 4.00,
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
                price = 3.00,,
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
                price = 15.00,
                ingredients = listOf("Cocoa", "Cream Cheese Frosting", "Sugar", "Flour"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "14",
                imageUrl = "https://images.unsplash.com/photo-1631206753348-db44968fd440?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fHRpcmFtaXN1fGVufDB8fDB8fHww",
                name = "Tiramisu",
                price = 14.00,,
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
    deliveryCharge = 3.00,,
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
                price = 6.00,
                ingredients = listOf("Potatoes", "Peas", "Spices", "Flour"),
                spiceLevel = SpiceLevel.MEDIUM
            ),
            FoodItem(
                id = "16",
                imageUrl = "https://images.unsplash.com/photo-1567188040759-fb8a883dc6d8?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cGFuZWVyJTIwdGlra2F8ZW58MHx8MHx8fDA%3D",
                name = "Paneer Tikka",
                price = 8.00,
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
                price = 16.00,
                ingredients = listOf("Chicken", "Tomato Gravy", "Butter", "Cream"),
                spiceLevel = SpiceLevel.MEDIUM
            ),
            FoodItem(
                id = "18",
                imageUrl = "https://images.unsplash.com/photo-1589647363585-f4a7d3877b10?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cGFsYWslMjBwYW5lZXJ8ZW58MHx8MHx8fDA%3D",
                name = "Palak Paneer",
                price = 14.00,,
                ingredients = listOf("Spinach", "Paneer", "Garlic", "Spices"),
                spiceLevel = SpiceLevel.MILD
            )
        ),
    )
)

val mockRestaurant4 = Restaurant(
    id = 4,
    name = "Burger Bonanza",
    type = RestaurantType.FastFood,
    rating = 4.2,
    deliveryCharge = 1.00,
    eta = "20-30 min",
    discountPercentage = 25,
    imageUrl = "https://images.unsplash.com/photo-1644447381290-85358ae625cb?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
    menu = mapOf(
        // Most Popular Items
        "Most Popular" to listOf(
            FoodItem(
                id = "19",
                imageUrl = "https://images.unsplash.com/photo-1572802419224-296b0aeee0d9?q=80&w=2015&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                name = "Classic Cheeseburger",
                price = 8.00,
                ingredients = listOf("Beef Patty", "Cheddar Cheese", "Ketchup", "Mustard", "Pickles"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "20",
                imageUrl = "https://images.unsplash.com/photo-1627662168223-7df99068099a?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                name = "Chicken Nuggets & Fries",
                price = 7.00,,
                ingredients = listOf("Chicken Nuggets", "French Fries", "Dipping Sauce"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Burgers
        "Burgers" to listOf(
            FoodItem(
                id = "21",
                imageUrl = "https://images.unsplash.com/photo-1692737349870-e3bfc704ebf9?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                name = "Spicy Chicken Burger",
                price = 9.00,
                ingredients = listOf("Spicy Chicken Patty", "Lettuce", "Tomato", "Mayonnaise"),
                spiceLevel = SpiceLevel.HOT
            ),
            FoodItem(
                id = "22",
                imageUrl = "https://images.unsplash.com/photo-1520072959219-c595dc870360?q=80&w=1890&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                name = "Veggie Burger",
                price = 8.00,,
                ingredients = listOf("Veggie Patty", "Avocado", "Lettuce", "Tomato", "Onion"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Sides
        "Sides" to listOf(
            FoodItem(
                id = "23",
                imageUrl = "https://images.unsplash.com/photo-1630384060421-cb20d0e0649d?q=80&w=1925&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                name = "French Fries",
                price = 3.00,
                ingredients = listOf("Potatoes", "Salt"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "24",
                imageUrl = "https://images.unsplash.com/photo-1637231854063-dcc3b5c4e8aa?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                name = "Onion Rings",
                price = 4.29,
                ingredients = listOf("Onions", "Batter"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Drinks
        "Drinks" to listOf(
            FoodItem(
                id = "25",
                imageUrl = "https://images.unsplash.com/photo-1622483767028-3f66f32aef97?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                name = "Coca-Cola",
                price = 2.00,
                ingredients = listOf("Carbonated Water", "High Fructose Corn Syrup", "Caramel Color"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "26",
                imageUrl = "https://images.unsplash.com/photo-1613478223719-2ab802602423?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                name = "Orange Juice",
                price = 2.00,
                ingredients = listOf("Orange Juice Concentrate", "Water"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant5 = Restaurant(
    id = 5,
    name = "The Daily Grind",
    type = RestaurantType.Cafe,
    rating = 4.7,
    deliveryCharge = 1.00,
    eta = "15-25 min",
    discountPercentage = 10,
    imageUrl = "https://images.unsplash.com/photo-1554118811-1e0d58224f24?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2FmZXxlbnwwfHwwfHx8Mg%3D%3D",
    menu = mapOf(
        // Most Popular Items
        "Most Popular" to listOf(
            FoodItem(
                id = "27",
                imageUrl = "https://images.unsplash.com/photo-1550948309-0d8983dbdcc3?q=80&w=2069&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                name = "Latte",
                price = 4.00,
                ingredients = listOf("Espresso", "Steamed Milk", "Milk Foam"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "28",
                imageUrl = "https://images.unsplash.com/photo-1681218079567-35aef7c8e7e4?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8YnV0dGVyJTIwY3JvaXNzYW50fGVufDB8fDB8fHwy",
                name = "Butter Croissant",
                price = 3.00,
                ingredients = listOf("Flour", "Butter", "Yeast", "Sugar"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Coffee
        "Coffee" to listOf(
            FoodItem(
                id = "29",
                imageUrl = "https://images.unsplash.com/photo-1632595508805-bd7b9ce74173?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                name = "Cappuccino",
                price = 4.75,
                ingredients = listOf("Espresso", "Steamed Milk", "Foamed Milk", "Cocoa Powder"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "30",
                imageUrl = "https://images.unsplash.com/photo-1587985782608-20062892559d?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8YW1lcmljYW5vfGVufDB8fDB8fHwy",
                name = "Americano",
                price = 3.00,
                ingredients = listOf("Espresso", "Hot Water"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Pastries
        "Pastries" to listOf(
            FoodItem(
                id = "31",
                imageUrl = "https://images.unsplash.com/photo-1519682214708-973477a2529a?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y29va2llfGVufDB8MHwwfHx8Mg%3D%3D",
                name = "Chocolate Chip Cookie",
                price = 2.00,
                ingredients = listOf("Flour", "Butter", "Sugar", "Chocolate Chips"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "32",
                imageUrl = "https://images.unsplash.com/photo-1611678849233-6715cbb56e4e?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Ymx1ZWJlcnJ5JTIwbXVmZmlufGVufDB8MHwwfHx8Mg%3D%3D",
                name = "Blueberry Muffin",
                price = 3.25,
                ingredients = listOf("Flour", "Sugar", "Blueberries", "Milk"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Sandwiches
        "Sandwiches" to listOf(
            FoodItem(
                id = "33",
                imageUrl = "https://images.unsplash.com/photo-1481070414801-51fd732d7184?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8dHVya2V5JTIwc2FuZHdpY2h8ZW58MHwwfDB8fHwy",
                name = "Turkey & Cheese Sandwich",
                price = 7.00,
                ingredients = listOf("Turkey Breast", "Cheddar Cheese", "Lettuce", "Tomato", "Bread"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "34",
                imageUrl = "https://images.unsplash.com/photo-1509722747041-616f39b57569?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8Y2FwcmVzZSUyMHNhbmR3aWNofGVufDB8MHwwfHx8Mg%3D%3D",
                name = "Caprese Sandwich",
                price = 8.00,
                ingredients = listOf("Mozzarella", "Tomato", "Basil", "Pesto", "Ciabatta Bread"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant6 = Restaurant(
    id = 6,
    name = "Fresh Mart",
    type = RestaurantType.Grocery,
    rating = 4.0,
    deliveryCharge = 3.00,
    eta = "45-60 min",
    discountPercentage = 0,
    imageUrl = "https://images.unsplash.com/photo-1542838132-92c53300491e?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8Z3JvY2VyeSUyMHN0b3JlfGVufDB8MHwwfHx8Mg%3D%3D",
    menu = mapOf(
        // Fruits
        "Fruits" to listOf(
            FoodItem(
                id = "35",
                imageUrl = "https://images.unsplash.com/photo-1560806887-1e4cd0b6cbd6?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8cmVkJTIwYXBwbGVzfGVufDB8MHwwfHx8Mg%3D%3D",
                name = "Red Apples (1kg)",
                price = 3.00,
                ingredients = listOf("Red Apples"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "36",
                imageUrl = "https://images.unsplash.com/photo-1581443517340-f04dfe0ef235?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fGJhbmFuYXN8ZW58MHwwfDB8fHwy",
                name = "Bananas (1kg)",
                price = 2.00,
                ingredients = listOf("Bananas"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Vegetables
        "Vegetables" to listOf(
            FoodItem(
                id = "37",
                imageUrl = "https://images.unsplash.com/photo-1467020323552-36f7bf0e30e6?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8dG9tYXRvZXN8ZW58MHwwfDB8fHwy",
                name = "Tomatoes (500g)",
                price = 2.79,
                ingredients = listOf("Tomatoes"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "38",
                imageUrl = "https://images.unsplash.com/photo-1580201092675-a0a6a6cafbb1?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8b25pb25zfGVufDB8MHwwfHx8Mg%3D%3D",
                name = "Onions (500g)",
                price = 1.89,
                ingredients = listOf("Onions"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Dairy & Eggs
        "Dairy & Eggs" to listOf(
            FoodItem(
                id = "39",
                imageUrl = "https://images.unsplash.com/photo-1695466552867-806d1f862098?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8bWlsayUyMHN1cGVybWFya2V0fGVufDB8MHwwfHx8Mg%3D%3D",
                name = "Milk (1L)",
                price = 1.20,
                ingredients = listOf("Pasteurized Cow's Milk"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "40",
                imageUrl = "https://images.unsplash.com/photo-1634821507330-b7df872692c2?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8ZWdnJTIwY2FydG9ufGVufDB8MHwwfHx8Mg%3D%3D",
                name = "Eggs (12 pcs)",
                price = 3.00,
                ingredients = listOf("Chicken Eggs"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Bakery
        "Bakery" to listOf(
            FoodItem(
                id = "41",
                imageUrl = "https://images.unsplash.com/photo-1549931319-a545dcf3bc73?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YnJlYWR8ZW58MHwwfDB8fHwy",
                name = "Whole Wheat Bread",
                price = 2.10,
                ingredients = listOf("Whole Wheat Flour", "Water", "Yeast", "Salt"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "42",
                imageUrl = "https://images.unsplash.com/photo-1599819055803-717bba43890f?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YmFndWV0dGV8ZW58MHwwfDB8fHwy",
                name = "Baguette",
                price = 1.00,
                ingredients = listOf("Wheat Flour", "Water", "Yeast", "Salt"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant7 = Restaurant(
    id = 7,
    name = "The Spice Route",
    type = RestaurantType.Restaurant,
    rating = 4.6,
    deliveryCharge = 3.20,
    eta = "35-45 min",
    discountPercentage = 15,
    imageUrl = "https://images.unsplash.com/photo-1571991806255-ef936945b6c7?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8c3BpY3klMjByZXN0YXVyYW50fGVufDB8MHwwfHx8Mg%3D%3D",
    menu = mapOf(
        // Appetizers
        "Appetizers" to listOf(
            FoodItem(
                id = "43",
                imageUrl = "https://images.unsplash.com/photo-1601050690117-94f5f6fa8bd7?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8c2Ftb3Nhc3xlbnwwfDB8MHx8fDI%3D",
                name = "Vegetable Samosas (3 pcs)",
                price = 6.00,
                ingredients = listOf("Potatoes", "Peas", "Spices", "Pastry"),
                spiceLevel = SpiceLevel.MEDIUM
            ),
            FoodItem(
                id = "44",
                imageUrl = "https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480_1_5x/img/recipe/ras/Assets/F7F38E73-9DE3-4648-AC36-846B91E2EC6C/Derivates/76E238A1-13B9-4115-B1C7-3E93923E299E.jpg",
                name = "Onion Bhaji",
                price = 5.90,
                ingredients = listOf("Onion", "Gram Flour", "Spices"),
                spiceLevel = SpiceLevel.MILD
            )
        ),

        // Main Courses (Curries)
        "Main Courses (Curries)" to listOf(
            FoodItem(
                id = "45",
                imageUrl = "https://www.errenskitchen.com/wp-content/uploads/2024/04/Chicken-Korma-1-16.jpg",
                name = "Chicken Korma",
                price = 14.00,
                ingredients = listOf("Chicken", "Cream", "Cashew Nuts", "Mild Spices"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "46",
                imageUrl = "https://www.currytastic.com/wp-content/uploads/2022/10/Lamb-Vindaloo.jpg",
                name = "Lamb Vindaloo",
                price = 16.00,
                ingredients = listOf("Lamb", "Potatoes", "Vinegar", "Hot Spices"),
                spiceLevel = SpiceLevel.HOT
            ),
            FoodItem(
                id = "47",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6GMD_WH9sl6HjJ4CObB9Lim-51zBji9n5KA&s",
                name = "Paneer Butter Masala",
                price = 13.00,
                ingredients = listOf("Paneer", "Tomato Gravy", "Butter", "Cream", "Spices"),
                spiceLevel = SpiceLevel.MILD
            )
        ),

        // Rice & Bread
        "Rice & Bread" to listOf(
            FoodItem(
                id = "48",
                imageUrl = "https://images.unsplash.com/photo-1536304993881-ff6e9eefa2a6?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YmFzbWF0aSUyMHJpY2V8ZW58MHwwfDB8fHwy",
                name = "Basmati Rice",
                price = 4.00,
                ingredients = listOf("Basmati Rice"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "49",
                imageUrl = "https://images.unsplash.com/photo-1697155406014-04dc649b0953?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8bmFhbnxlbnwwfDB8MHx8fDI%3D",
                name = "Garlic Naan",
                price = 3.00,
                ingredients = listOf("Flour", "Yeast", "Garlic", "Butter"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Desserts
        "Desserts" to listOf(
            FoodItem(
                id = "50",
                imageUrl = "https://theartisticcook.com/wp-content/uploads/2024/10/Gulab-Jamun-with-Milk-Powder.jpg",
                name = "Gulab Jamun (2 pcs)",
                price = 4.00,
                ingredients = listOf("Milk Solids", "Sugar Syrup", "Cardamom"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant8 = Restaurant(
    id = 8,
    name = "Kyoto Gardens",
    type = RestaurantType.Restaurant,
    rating = 4.8,
    deliveryCharge = 3.00,
    eta = "40-50 min",
    discountPercentage = 20,
    imageUrl = "https://images.unsplash.com/photo-1568018508399-e53bc8babdde?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8amFwYW5lc2UlMjByZXN0YXVyYW50fGVufDB8MHwwfHx8Mg%3D%3D",
    menu = mapOf(
        // Sushi & Sashimi
        "Sushi & Sashimi" to listOf(
            FoodItem(
                id = "51",
                imageUrl = "https://images.unsplash.com/photo-1562158074-d49fbeffcc91?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8c2FsbW9uJTIwbmlnaXJpfGVufDB8MHwwfHx8Mg%3D%3D",
                name = "Salmon Nigiri (2 pcs)",
                price = 7.00,
                ingredients = listOf("Sushi Rice", "Fresh Salmon", "Wasabi"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "52",
                imageUrl = "https://images.getrecipekit.com/20220525130330-ahi_tuna_sushi_roll_1000x.webp?aspect_ratio=4:3&quality=90&",
                name = "Tuna Maki Roll (6 pcs)",
                price = 9.00,
                ingredients = listOf("Sushi Rice", "Nori", "Fresh Tuna", "Cucumber"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "53",
                imageUrl = "https://images.unsplash.com/photo-1694763637400-12b763ebdb27?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8c2FzaGltaXxlbnwwfDB8MHx8fDI%3D",
                name = "Assorted Sashimi (6 pcs)",
                price = 18.00,
                ingredients = listOf("Fresh Salmon", "Tuna", "Yellowtail"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Ramen & Noodles
        "Ramen & Noodles" to listOf(
            FoodItem(
                id = "54",
                imageUrl = "https://www.seriouseats.com/thmb/xm-9rxkV3ZjUEHyqNQ2uT6CO2vA=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/__opt__aboutcom__coeus__resources__content_migration__serious_eats__seriouseats.com__recipes__images__2013__09__20130910-crispy-pork-miso-ramen-03-2-85700bbc1b0843199c41648cb9f2c17c.jpg",
                name = "Miso Ramen",
                price = 15.00,
                ingredients = listOf("Ramen Noodles", "Miso Broth", "Chashu Pork", "Soft-boiled Egg", "Nori"),
                spiceLevel = SpiceLevel.MILD
            ),
            FoodItem(
                id = "55",
                imageUrl = "https://i0.wp.com/seonkyounglongest.com/wp-content/uploads/2020/09/Easy-Tonkotsu-26-mini.jpg?fit=1000%2C667&ssl=1",
                name = "Tonkotsu Ramen",
                price = 16.00,
                ingredients = listOf("Ramen Noodles", "Pork Bone Broth", "Chashu Pork", "Scallions", "Wood Ear Mushrooms"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "56",
                imageUrl = "https://cdn.craft.cloud/224393fa-1975-4d80-9067-ada3cb5948ca/assets/Truvia_RECIPE-Hero_Pad-Thai.jpg",
                name = "Chicken Pad Thai",
                price = 14.00,
                ingredients = listOf("Rice Noodles", "Chicken", "Peanuts", "Bean Sprouts", "Tamarind Sauce"),
                spiceLevel = SpiceLevel.MEDIUM
            )
        ),

        // Main Dishes
        "Main Dishes" to listOf(
            FoodItem(
                id = "57",
                imageUrl = "https://cdn.apartmenttherapy.info/image/upload/f_jpg,q_auto:eco,c_fill,g_auto,w_1500,ar_16:9/k%2FPhoto%2FRecipes%2F2024-05-chicken-teriyaki-190%2Fchicken-teriyaki-190-171-horizontal",
                name = "Chicken Teriyaki",
                price = 17.00,
                ingredients = listOf("Chicken Thigh", "Teriyaki Sauce", "Sesame Seeds", "Steamed Rice"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "58",
                imageUrl = "https://vjcooks.com/wp-content/uploads/2024/08/VJ_Cooks_Beef__Broccoli_Stir_Fry-1-735x735.jpg",
                name = "Beef & Broccoli Stir-fry",
                price = 16.00,
                ingredients = listOf("Beef Slices", "Broccoli", "Soy Sauce", "Ginger", "Garlic", "Rice"),
                spiceLevel = SpiceLevel.MILD
            )
        ),

        // Drinks
        "Drinks" to listOf(
            FoodItem(
                id = "59",
                imageUrl = "https://images.unsplash.com/photo-1606377695906-236fdfcef767?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8Z3JlZW4lMjB0ZWF8ZW58MHwwfDB8fHwy",
                name = "Green Tea",
                price = 3.00,
                ingredients = listOf("Green Tea Leaves", "Hot Water"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "60",
                imageUrl = "https://images.unsplash.com/photo-1571762450239-f0f047321444?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8c2FrZXxlbnwwfDB8MHx8fDI%3D",
                name = "Sake (Small)",
                price = 8.00,
                ingredients = listOf("Rice Wine"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant9 = Restaurant(
    id = 9,
    name = "Taco Fiesta",
    type = RestaurantType.FastFood,
    rating = 4.3,
    deliveryCharge = 2.50,
    eta = "25-35 min",
    discountPercentage = 15,
    imageUrl = "https://images.unsplash.com/photo-1613514785940-daed07799d9b?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8dGFjb3N8ZW58MHwwfDB8fHwy",
    menu = mapOf(
        // Tacos
        "Tacos" to listOf(
            FoodItem(
                id = "61",
                imageUrl = "https://www.onceuponachef.com/images/2023/08/Beef-Tacos.jpg",
                name = "Beef Hard Shell Taco",
                price = 3.00,
                ingredients = listOf("Seasoned Ground Beef", "Crispy Taco Shell", "Lettuce", "Cheddar Cheese"),
                spiceLevel = SpiceLevel.MILD
            ),
            FoodItem(
                id = "62",
                imageUrl = "https://gran.luchito.com/wp-content/uploads/2023/04/Landscape-Hero-Crunchy-Chicken-Tacos.jpg",
                name = "Chicken Soft Taco",
                price = 4.29,
                ingredients = listOf("Grilled Chicken", "Soft Tortilla", "Pico de Gallo", "Sour Cream"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "63",
                imageUrl = "https://www.seriouseats.com/thmb/y3Qf-ciu-nzLgYeJzK4xWoabibQ=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/SEA-M7011302_crunchy_fish_tacos6556-JenCausey-f8285ed3d8674b25bf16d027034fc41b.jpg",
                name = "Fish Taco",
                price = 4.79,
                ingredients = listOf("Crispy Fish", "Cabbage Slaw", "Chipotle Mayo", "Corn Tortilla"),
                spiceLevel = SpiceLevel.MEDIUM
            )
        ),

        // Burritos & Bowls
        "Burritos & Bowls" to listOf(
            FoodItem(
                id = "64",
                imageUrl = "https://thecookingfoodie.com/wp-content/uploads/2022/08/IMG_1696-2.jpg",
                name = "Beef Burrito",
                price = 9.00,
                ingredients = listOf("Seasoned Beef", "Rice", "Beans", "Cheese", "Salsa", "Sour Cream", "Tortilla"),
                spiceLevel = SpiceLevel.MILD
            ),
            FoodItem(
                id = "65",
                imageUrl = "https://www.thespruceeats.com/thmb/XqGafZJmPK9prSBMa3H0JqsCa-Q=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/copycat-chipotle-chicken-burrito-bowl-4173869-hero-01-12a58fec59284f0cac31a49a80380fcd.jpg",
                name = "Chicken Burrito Bowl",
                price = 10.00,
                ingredients = listOf("Grilled Chicken", "Rice", "Black Beans", "Corn Salsa", "Guacamole", "Lettuce"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Sides & Snacks
        "Sides & Snacks" to listOf(
            FoodItem(
                id = "66",
                imageUrl = "https://recipecontent.fooby.ch/11662_10-9_480-432@2x.jpg",
                name = "Guacamole & Chips",
                price = 5.00,
                ingredients = listOf("Avocado", "Tomato", "Onion", "Cilantro", "Lime", "Tortilla Chips"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "67",
                imageUrl = "https://www.thecandidappetite.com/wp-content/uploads/2016/11/0S9A10028-2024x1349.jpg",
                name = "Churros with Chocolate Sauce",
                price = 4.00,
                ingredients = listOf("Churro Dough", "Cinnamon Sugar", "Chocolate Sauce"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Drinks
        "Drinks" to listOf(
            FoodItem(
                id = "68",
                imageUrl = "https://barebonesbutcher.com/wp-content/uploads/2020/12/BBB-ProductList-82-e1611936150677.jpg",
                name = "Mexican Coke",
                price = 3.00,
                ingredients = listOf("Carbonated Water", "Cane Sugar", "Caramel Color"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "69",
                imageUrl = "https://carolinarice.com/wp-content/uploads/2020/04/GettyImages-493110032.jpg",
                name = "Horchata",
                price = 3.00,
                ingredients = listOf("Rice Milk", "Cinnamon", "Sugar"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant10 = Restaurant(
    id = 10,
    name = "Green Harvest Market",
    type = RestaurantType.Grocery,
    rating = 4.3,
    deliveryCharge = 4.00,
    eta = "50-70 min",
    discountPercentage = 0,
    imageUrl = "https://images.unsplash.com/photo-1583258292688-d0213dc5a3a8?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Z3JvY2VyeSUyMHN0b3JlfGVufDB8MHwwfHx8Mg%3D%3D",
    menu = mapOf(
        // Organic Produce
        "Organic Produce" to listOf(
            FoodItem(
                id = "70",
                imageUrl = "https://images.unsplash.com/photo-1639086495429-d60e72c53c81?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8Y2Fycm90c3xlbnwwfDB8MHx8fDI%3D",
                name = "Organic Carrots (500g)",
                price = 3.20,
                ingredients = listOf("Organic Carrots"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "71",
                imageUrl = "https://cdn.apartmenttherapy.info/image/upload/f_jpg,q_auto:eco,c_fill,g_auto,w_1500,ar_4:3/k%2FPhoto%2FRecipes%2F2020-06-how-we-salad%2FSalads-new-spring-mix%2FSalads-New-Spring-Mix918",
                name = "Organic Mixed Greens (200g)",
                price = 4.00,
                ingredients = listOf("Organic Lettuce", "Organic Spinach", "Organic Arugula"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Meat & Poultry
        "Meat & Poultry" to listOf(
            FoodItem(
                id = "72",
                imageUrl = "https://www.momswhothink.com/wp-content/uploads/2023/05/shutterstock-1915431781-huge-licensed-scaled.jpg",
                name = "Chicken Breast Fillets (500g)",
                price = 8.00,
                ingredients = listOf("Chicken Breast"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "73",
                imageUrl = "https://www.tkranch.com/images/products/large_22_large_xlgb_22.jpg",
                name = "Lean Ground Beef (500g)",
                price = 7.00,
                ingredients = listOf("Ground Beef"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Pantry Staples
        "Pantry Staples" to listOf(
            FoodItem(
                id = "74",
                imageUrl = "https://media.istockphoto.com/id/185065945/photo/pasta-variation.jpg?s=612x612&w=0&k=20&c=MQEjU7uAnvTISNoI78MpCdum7sjN93tjeED3rFqjdHw=",
                name = "Organic Pasta (500g)",
                price = 2.80,
                ingredients = listOf("Organic Durum Wheat Semolina"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "75",
                imageUrl = "https://cdn-prod.medicalnewstoday.com/content/images/articles/321/321246/olive-oil-in-a-bottle-which-may-be-used-on-the-face.jpg",
                name = "Extra Virgin Olive Oil (500ml)",
                price = 12.00,
                ingredients = listOf("Extra Virgin Olive Oil"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Frozen Foods
        "Frozen Foods" to listOf(
            FoodItem(
                id = "76",
                imageUrl = "https://cdn11.bigcommerce.com/s-rl94rv7pw2/images/stencil/1280x1280/products/4906/4669/thumbnail__31367.1732941994.jpg?c=1",
                name = "Frozen Mixed Berries (300g)",
                price = 5.00,
                ingredients = listOf("Strawberries", "Blueberries", "Raspberries", "Blackberries"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "77",
                imageUrl = "https://ouichefboxes.co.uk/wp-content/uploads/2020/04/thumbnail-1.png",
                name = "Frozen Peas (400g)",
                price = 2.00,
                ingredients = listOf("Peas"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant11 = Restaurant(
    id = 11,
    name = "The Cozy Corner Cafe",
    type = RestaurantType.Cafe,
    rating = 4.6,
    deliveryCharge = 1.75,
    eta = "15-25 min",
    discountPercentage = 10,
    imageUrl = "https://images.unsplash.com/photo-1544031064-9de80864ade5?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTl8fGNhZmV8ZW58MHwwfDB8fHwy",
    menu = mapOf(
        // Hot Drinks
        "Hot Drinks" to listOf(
            FoodItem(
                id = "78",
                imageUrl = "https://www.nescafe.com/gb/sites/default/files/2023-08/caramel-macchiato_1066x1066.jpg",
                name = "Caramel Macchiato",
                price = 5.25,
                ingredients = listOf("Espresso", "Steamed Milk", "Vanilla Syrup", "Caramel Drizzle"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "79",
                imageUrl = "https://images.unsplash.com/photo-1661529548674-8dae0330fe04?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aG90JTIwY2hvY29sYXRlfGVufDB8MHwwfHx8Mg%3D%3D",
                name = "Hot Chocolate",
                price = 4.00,
                ingredients = listOf("Milk", "Cocoa Powder", "Sugar", "Whipped Cream"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Cold Drinks
        "Cold Drinks" to listOf(
            FoodItem(
                id = "80",
                imageUrl = "https://images.unsplash.com/photo-1566656117208-c23e67f4ce8c?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8aWNlZCUyMGxhdHRlfGVufDB8MHwwfHx8Mg%3D%3D",
                name = "Iced Latte",
                price = 4.90,
                ingredients = listOf("Espresso", "Cold Milk", "Ice"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "81",
                imageUrl = "https://images.unsplash.com/photo-1508869901315-49c557f3969d?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YmVycnklMjBzbW9vdGhpZXxlbnwwfDB8MHx8fDI%3D",
                name = "Berry Blast Smoothie",
                price = 6.00,
                ingredients = listOf("Mixed Berries", "Yogurt", "Honey", "Milk"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Breakfast & Brunch
        "Breakfast & Brunch" to listOf(
            FoodItem(
                id = "82",
                imageUrl = "https://images.unsplash.com/photo-1515041761709-f9fc96e04cd3?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8YXZvY2FkbyUyMHRvYXN0fGVufDB8MHwwfHx8Mg%3D%3D",
                name = "Avocado Toast",
                price = 7.00,
                ingredients = listOf("Toasted Bread", "Avocado", "Chili Flakes", "Lemon Juice"),
                spiceLevel = SpiceLevel.MILD
            ),
            FoodItem(
                id = "83",
                imageUrl = "https://images.unsplash.com/photo-1614663422784-07203a605793?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8YmVycnklMjBwYW5jYWtlc3xlbnwwfDB8MHx8fDI%3D",
                name = "Pancakes with Berries",
                price = 8.00,
                ingredients = listOf("Pancakes", "Mixed Berries", "Maple Syrup", "Whipped Cream"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Desserts
        "Desserts" to listOf(
            FoodItem(
                id = "84",
                imageUrl = "https://images.unsplash.com/photo-1567624725806-227866a3f784?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8bmV3JTIweW9yayUyMGNoZWVzZWNha2V8ZW58MHwwfDB8fHwy",
                name = "New York Cheesecake",
                price = 6.00,
                ingredients = listOf("Cream Cheese", "Graham Cracker Crust", "Sour Cream Topping"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "85",
                imageUrl = "https://images.unsplash.com/photo-1461009312844-e80697a81cc7?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8YnJvd25pZXxlbnwwfDB8MHx8fDI%3D",
                name = "Chocolate Fudge Brownie",
                price = 4.00,
                ingredients = listOf("Chocolate", "Butter", "Sugar", "Eggs", "Flour"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant12 = Restaurant(
    id = 12,
    name = "The Daily Crumb Bakery",
    type = RestaurantType.Bakery, // Assuming Cafe is the closest type for now
    rating = 4.8,
    deliveryCharge = 2.00,
    eta = "20-30 min",
    discountPercentage = 10,
    imageUrl = "https://images.unsplash.com/photo-1568254183919-78a4f43a2877?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8YmFrZXJ5fGVufDB8MHwwfHx8Mg%3D%3D",
    menu = mapOf(
        // Breads
        "Breads" to listOf(
            FoodItem(
                id = "86",
                imageUrl = "https://www.allrecipes.com/thmb/DCWXlgmQnMJTPiwFiYm_i3hlCbY=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/260540-Chef-Johns-Sourdough-Bread-DDMFS-004-4x3-6791a75a5d804ec28424d04756054c5b.jpg",
                name = "Artisan Sourdough Loaf",
                price = 6.00,
                ingredients = listOf("Sourdough Starter", "Flour", "Water", "Salt"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "87",
                imageUrl = "https://www.kingarthurbaking.com/sites/default/files/recipe_legacy/8-3-large.jpg",
                name = "Classic French Baguette",
                price = 3.00,
                ingredients = listOf("Wheat Flour", "Water", "Yeast", "Salt"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Pastries & Croissants
        "Pastries & Croissants" to listOf(
            FoodItem(
                id = "88",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-aEKou2wunIgXWHEO8CvDiCu5nIXykYmjtA&s",
                name = "Chocolate Croissant",
                price = 4.25,
                ingredients = listOf("Flour", "Butter", "Chocolate", "Yeast"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "89",
                imageUrl = "https://www.foodandwine.com/thmb/dCBqp4GlxvlH0YoWU-KbxmRynFU=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/miso-caramel-apple-danish-FT-RECIPE0920-005dcb017b23462383ea77c4549b1a44.jpg",
                name = "Apple Danish",
                price = 3.75,
                ingredients = listOf("Pastry Dough", "Apple Filling", "Icing"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Cakes & Slices
        "Cakes & Slices" to listOf(
            FoodItem(
                id = "90",
                imageUrl = "https://richanddelish.com/wp-content/uploads/2024/07/Lemon-Meringue-Tart-500x375.jpg",
                name = "Lemon Meringue Tart (Slice)",
                price = 5.00,
                ingredients = listOf("Lemon Curd", "Meringue", "Pastry Crust"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "91",
                imageUrl = "https://static01.nyt.com/images/2020/11/01/dining/Carrot-Cake-textless/Carrot-Cake-textless-videoSixteenByNineJumbo1600.jpg",
                name = "Carrot Cake (Slice)",
                price = 6.00,
                ingredients = listOf("Carrots", "Cream Cheese Frosting", "Walnuts"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Cookies & Bars
        "Cookies & Bars" to listOf(
            FoodItem(
                id = "92",
                imageUrl = "https://www.jordanwinery.com/wp-content/uploads/2020/04/French-Macaron-Cookie-Recipe-WebHero-6435.jpg",
                name = "Assorted Macarons (3 pcs)",
                price = 7.00,
                ingredients = listOf("Almond Flour", "Egg Whites", "Sugar", "Various Fillings"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "93",
                imageUrl = "https://www.allrecipes.com/thmb/JbnVNNMYuKZIgDvy1gDQcrTkorQ=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/10264-oatmeal-raisin-cookies-i-DDMFS-4x3-0fe02131a6354b08a175d315210adb50.jpg",
                name = "Oatmeal Raisin Cookie",
                price = 2.75,
                ingredients = listOf("Oats", "Raisins", "Flour", "Brown Sugar"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant13 = Restaurant(
    id = 13,
    name = "The Olive Tree Taverna",
    type = RestaurantType.Restaurant,
    rating = 4.7,
    deliveryCharge = 3.00,
    eta = "30-45 min",
    discountPercentage = 10,
    imageUrl = "https://images.unsplash.com/photo-1652598558866-2d96d93dc2a3?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8Z3JlZWslMjB0YXZlcm5hfGVufDB8MHwwfHx8Mg%3D%3D",
    menu = mapOf(
        // Appetizers (Mezedes)
        "Appetizers (Mezedes)" to listOf(
            FoodItem(
                id = "94",
                imageUrl = "https://popmenucloud.com/qdymchlt/e5e7a982-5c94-4b25-8d68-f7a2784ca4ad.jpg",
                name = "Tzatziki with Pita Bread",
                price = 6.00,
                ingredients = listOf("Yogurt", "Cucumber", "Garlic", "Dill", "Olive Oil", "Pita Bread"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "95",
                imageUrl = "https://www.dianekochilas.com/wp-content/uploads/2023/11/Saganaki-Greek-Fried-Cheese.jpg",
                name = "Saganaki (Fried Cheese)",
                price = 8.00,
                ingredients = listOf("Kefalotyri Cheese", "Flour", "Lemon"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Main Courses
        "Main Courses" to listOf(
            FoodItem(
                id = "96",
                imageUrl = "https://popmenucloud.com/cdn-cgi/image/width%3D1200%2Cheight%3D1200%2Cfit%3Dscale-down%2Cformat%3Dauto%2Cquality%3D60/qtkjeiud/925af144-e6b4-4cdd-9942-b70b8c8fa10b.jpg",
                name = "Chicken Gyro Plate",
                price = 14.00,
                ingredients = listOf("Marinated Chicken", "Pita Bread", "Tzatziki", "Fries", "Tomato", "Onion"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "97",
                imageUrl = "https://www.mygreekdish.com/wp-content/uploads/2013/05/Moussaka-recipe-Traditional-Greek-Moussaka-with-Eggplants.jpg",
                name = "Moussaka",
                price = 16.00,
                ingredients = listOf("Eggplant", "Minced Meat", "Potatoes", "Béchamel Sauce"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "98",
                imageUrl = "https://www.seriouseats.com/thmb/qAysZs1vJYvMCSSpsHRqRlsvExQ=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/__opt__aboutcom__coeus__resources__content_migration__serious_eats__seriouseats.com__recipes__images__20090319-pork-souvlaki-9a80ec7534d3427c888d2d0f939540a6.jpg",
                name = "Pork Souvlaki Skewers (2 pcs)",
                price = 13.00,
                ingredients = listOf("Marinated Pork", "Bell Peppers", "Onions", "Served with Rice"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Salads
        "Salads" to listOf(
            FoodItem(
                id = "99",
                imageUrl = "https://ichef.bbc.co.uk/ace/standard/1600/food/recipes/greek_salad_16407_16x9.jpg.webp",
                name = "Traditional Greek Salad",
                price = 10.00,
                ingredients = listOf("Tomato", "Cucumber", "Red Onion", "Feta Cheese", "Olives", "Oregano", "Olive Oil"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Desserts
        "Desserts" to listOf(
            FoodItem(
                id = "100",
                imageUrl = "https://cleobuttera.com/wp-content/uploads/2018/03/lifted-baklava-720x540.jpg",
                name = "Baklava",
                price = 5.00,
                ingredients = listOf("Phyllo Pastry", "Chopped Nuts", "Honey Syrup"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant14 = Restaurant(
    id = 14,
    name = "Subway Sandwiches",
    type = RestaurantType.FastFood,
    rating = 4.0,
    deliveryCharge = 2.00,
    eta = "20-30 min",
    discountPercentage = 0,
    imageUrl = "https://imageproxy.wolt.com/assets/6825b8a77854afb9cf895a01",
    menu = mapOf(
        // Classic Subs
        "Classic Subs" to listOf(
            FoodItem(
                id = "101",
                imageUrl = "https://subwayburton.com/wp-content/uploads/turkham.webp",
                name = "Turkey Breast & Ham",
                price = 8.00,
                ingredients = listOf("Turkey Breast", "Ham", "Provolone Cheese", "Lettuce", "Tomato", "Onion", "Subway Vinaigrette", "Italian Bread"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "102",
                imageUrl = "https://mysubway.ro/wp-content/uploads/2019/08/Italian-BMT-02.jpg",
                name = "Italian B.M.T.",
                price = 9.00,
                ingredients = listOf("Pepperoni", "Salami", "Ham", "Provolone Cheese", "Lettuce", "Tomato", "Onion", "Oil & Vinegar", "Italian Herbs & Cheese Bread"),
                spiceLevel = SpiceLevel.MILD
            )
        ),

        // Signature Series Subs
        "Signature Series Subs" to listOf(
            FoodItem(
                id = "103",
                imageUrl = "https://mysubway.ro/wp-content/uploads/2019/09/Chicken-teriyaki.jpg",
                name = "Sweet Onion Chicken Teriyaki",
                price = 9.75,
                ingredients = listOf("Chicken Strips", "Sweet Onion Teriyaki Sauce", "Provolone Cheese", "Spinach", "Green Peppers", "Red Onion", "White Bread"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "104",
                imageUrl = "https://subwayburton.com/wp-content/uploads/meatball-sub.webp",
                name = "Meatball Marinara",
                price = 8.75,
                ingredients = listOf("Meatballs", "Marinara Sauce", "Provolone Cheese", "Parmesan Cheese", "Italian Bread"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Salads & Wraps
        "Salads & Wraps" to listOf(
            FoodItem(
                id = "105",
                imageUrl = "https://www.subway.com/ns/images/menu/TUR/ENG/menu-category-salads-spiral-turkey-TR-308x140.jpg",
                name = "Turkey Breast Salad",
                price = 8.00,
                ingredients = listOf("Turkey Breast", "Lettuce", "Spinach", "Tomato", "Cucumber", "Green Peppers", "Olives", "Choice of Dressing"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "106",
                imageUrl = "https://www.sabwaymenu.com/wp-content/uploads/2024/10/20-elite-chicken-bacon-ranch-830-cals-670ca746cf90b.webp",
                name = "Chicken & Bacon Ranch Wrap",
                price = 9.25,
                ingredients = listOf("Chicken Strips", "Bacon", "Ranch Dressing", "Monterey Cheddar Cheese", "Lettuce", "Tomato", "Spinach Tortilla"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Sides & Drinks
        "Sides & Drinks" to listOf(
            FoodItem(
                id = "107",
                imageUrl = "https://mccainfoodservice.com/media/3wkjo0xw/maxi-chips_6900_.jpg",
                name = "Chips",
                price = 1.75,
                ingredients = listOf("Various Flavors"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "108",
                imageUrl = "https://subway.com.tw/en/include/assets/img/product/sidesDrink/Drinks-drink-small.jpg",
                name = "Fountain Drink (Large)",
                price = 2.00,
                ingredients = listOf("Various Soft Drinks"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant15 = Restaurant(
    id = 15,
    name = "Sweet Delights Bakery",
    type = RestaurantType.Bakery,
    rating = 4.9,
    deliveryCharge = 2.20,
    eta = "20-35 min",
    discountPercentage = 15,
    imageUrl = "https://images.unsplash.com/photo-1556988790-69f54648859b?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8c3dlZXRzJTIwYmFrZXJ5fGVufDB8MHwwfHx8Mg%3D%3D",
    menu = mapOf(
        // Cakes & Cupcakes
        "Cakes & Cupcakes" to listOf(
            FoodItem(
                id = "109",
                imageUrl = "https://www.brighteyedbaker.com/wp-content/uploads/2023/08/Chocolate-Fudge-Cake-Recipe.jpg",
                name = "Chocolate Fudge Cake (Slice)",
                price = 7.00,
                ingredients = listOf("Rich Chocolate Cake", "Fudge Frosting", "Chocolate Shavings"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "110",
                imageUrl = "https://www.withlovekitty.com/wp-content/uploads/2023/10/Vanilla-Bean-Cupcakes-1-22-500x500.jpg",
                name = "Vanilla Bean Cupcake",
                price = 3.00,
                ingredients = listOf("Vanilla Sponge", "Vanilla Buttercream", "Sprinkles"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "111",
                imageUrl = "https://www.allrecipes.com/thmb/W5Ou0-fSTAHi5vM9FdJkplRzgNQ=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/212429-red-velvet-cupcakes-ddmfs-0178-3x4-hero-e5cd9e2684dd4d90b40d9aa0d42e3ee2.jpg",
                name = "Red Velvet Cupcake",
                price = 4.25,
                ingredients = listOf("Red Velvet Sponge", "Cream Cheese Frosting"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Cookies & Brownies
        "Cookies & Brownies" to listOf(
            FoodItem(
                id = "112",
                imageUrl = "https://static01.nyt.com/images/2022/11/30/dining/SE-White-Chocolate-Macadamia-COOKIEWEEK/merlin_216761685_98436024-b7aa-40ca-a3f1-b092de054297-superJumbo.jpg",
                name = "White Chocolate Macadamia Cookie",
                price = 3.00,
                ingredients = listOf("White Chocolate Chips", "Macadamia Nuts", "Cookie Dough"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "113",
                imageUrl = "https://farm4.staticflickr.com/3765/19768097492_c2836a68da_c.jpg",
                name = "Double Fudge Brownie",
                price = 4.00,
                ingredients = listOf("Dark Chocolate", "Cocoa Powder", "Walnuts"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Pies & Tarts
        "Pies & Tarts" to listOf(
            FoodItem(
                id = "114",
                imageUrl = "https://www.allrecipes.com/thmb/3TRiK_GlQ3ZtoQqhoEu3svDUS9c=/0x512/filters:no_upscale():max_bytes(150000):strip_icc()/ar-88490-crumb-topping-for-pies-ddmfs_7895-cc135adf59e24ccfbeb7cc425a7146cf.jpg",
                name = "Apple Crumble Pie (Slice)",
                price = 6.75,
                ingredients = listOf("Apples", "Cinnamon", "Oat Crumble Topping", "Pie Crust"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "115",
                imageUrl = "https://www.kingarthurbaking.com/sites/default/files/2021-02/berry-cream-tart.jpg",
                name = "Mixed Berry Tart (Individual)",
                price = 5.00,
                ingredients = listOf("Shortbread Crust", "Custard", "Fresh Mixed Berries"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant16 = Restaurant(
    id = 16,
    name = "The Flour Patch Bakery",
    type = RestaurantType.Bakery,
    rating = 4.7,
    deliveryCharge = 2.00,
    eta = "20-35 min",
    discountPercentage = 10,
    imageUrl = "https://images.unsplash.com/photo-1567752588693-ad10a647c5a3?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGJha2VyeXxlbnwwfDB8MHx8fDI%3D",
    menu = mapOf(
        // Artisan Breads
        "Artisan Breads" to listOf(
            FoodItem(
                id = "116",
                imageUrl = "https://images.squarespace-cdn.com/content/v1/533f584fe4b0f77e1bd2e4d1/1584895704702-R50RS05V4OZEU8VDWEF4/no.knead.rye.bread_butteryum",
                name = "Rustic Rye Loaf",
                price = 7.00,
                ingredients = listOf("Rye Flour", "Wheat Flour", "Sourdough Starter", "Caraway Seeds"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "117",
                imageUrl = "https://www.thespruceeats.com/thmb/lQNhTPb2B9qIlRcGvIsL1WB_hbM=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/ciabatta-bread-4690594-hero-01-88aed68f1cc44ec8aa622c7ca6c3f2a9.jpg",
                name = "Ciabatta Bread",
                price = 4.00,
                ingredients = listOf("Wheat Flour", "Water", "Yeast", "Olive Oil"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Sweet Treats
        "Sweet Treats" to listOf(
            FoodItem(
                id = "118",
                imageUrl = "https://www.kingarthurbaking.com/sites/default/files/2022-11/Giant-Skillet-Cinnamon-Bun-Hero-1.jpg",
                name = "Giant Cinnamon Roll",
                price = 4.00,
                ingredients = listOf("Sweet Dough", "Cinnamon Sugar Filling", "Cream Cheese Icing"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "119",
                imageUrl = "https://www.allrecipes.com/thmb/NT8O6xd2sadl55A6EkrJs88bz9U=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/ar-13564-pecan-pie-bars-i-ddmfs-2x1-94dda257670045088b0cbacf7f6a3fc3.jpg",
                name = "Pecan Pie Bar",
                price = 4.00,
                ingredients = listOf("Shortbread Crust", "Pecan Filling", "Caramel"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Savory Pastries
        "Savory Pastries" to listOf(
            FoodItem(
                id = "120",
                imageUrl = "https://static01.nyt.com/images/2024/05/15/multimedia/15SPANAKOPITArex-cut-klhz/02SPANAKOPITArex-cut-klhz-mediumSquareAt3X.jpg",
                name = "Spinach & Feta Swirl",
                price = 5.25,
                ingredients = listOf("Puff Pastry", "Spinach", "Feta Cheese", "Herbs"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "121",
                imageUrl = "https://cdn.apartmenttherapy.info/image/upload/f_jpg,q_auto:eco,c_fill,g_auto,w_1500,ar_4:3/k%2FPhoto%2FRecipe%20Ramp%20Up%2F2021-12-Sausage-Roll%2FIMG_4454b",
                name = "Sausage Roll",
                price = 4.75,
                ingredients = listOf("Sausage Meat", "Puff Pastry", "Spices"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant17 = Restaurant(
    id = 17,
    name = "The Urban Spoon",
    type = RestaurantType.Restaurant,
    rating = 4.6,
    deliveryCharge = 3.80,
    eta = "35-50 min",
    discountPercentage = 15,
    imageUrl = "https://images.unsplash.com/photo-1622115837997-90c89ae689f9?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
    menu = mapOf(
        // Starters
        "Starters" to listOf(
            FoodItem(
                id = "122",
                imageUrl = "https://i0.wp.com/www.russianfilipinokitchen.com/wp-content/uploads/2015/04/crispy-fried-calamari-01.jpg",
                name = "Crispy Calamari",
                price = 10.00,
                ingredients = listOf("Calamari Rings", "Marinara Sauce", "Lemon Wedge"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "123",
                imageUrl = "https://static01.nyt.com/images/2020/05/12/dining/as-tomato-bruschetta/as-tomato-bruschetta-googleFourByThree-v2.jpg",
                name = "Tomato Bruschetta",
                price = 8.00,
                ingredients = listOf("Toasted Baguette", "Diced Tomatoes", "Fresh Basil", "Garlic", "Balsamic Glaze"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Main Courses (Meat)
        "Main Courses (Meat)" to listOf(
            FoodItem(
                id = "124",
                imageUrl = "https://www.amerigas.com/-/media/project/amerigas/blog/website-headers-800x600_ribeyesteakherbbutter.jpg",
                name = "Grilled Ribeye Steak",
                price = 28.00,
                ingredients = listOf("10oz Ribeye", "Garlic Mashed Potatoes", "Seasonal Vegetables", "Red Wine Reduction"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "125",
                imageUrl = "https://www.foodandwine.com/thmb/t9YqzGbmH-huAbV6xitCQs0-G4s=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/FAW-recipes-herb-and-lemon-roasted-chicken-hero-c4ba0aec56884683be482c47b1e1df11.jpg",
                name = "Herb Roasted Chicken",
                price = 19.00,
                ingredients = listOf("Half Roasted Chicken", "Rosemary Potatoes", "Green Beans"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Main Courses (Vegetarian)
        "Main Courses (Vegetarian)" to listOf(
            FoodItem(
                id = "126",
                imageUrl = "https://cdn.loveandlemons.com/wp-content/uploads/2023/12/vegetarian-lasagna-scaled.jpg",
                name = "Vegetable Lasagna",
                price = 16.00,
                ingredients = listOf("Layers of Pasta", "Ricotta Cheese", "Spinach", "Marinara Sauce", "Mozzarella"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "127",
                imageUrl = "https://www.eatingwell.com/thmb/j7BysZSxkHk2zCmnHUjSwwqrX4Y=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/mushroom-risotto-beauty-8025316-4000x2700-33aa288ff4ce4b8d854618fab2109a95.jpg",
                name = "Mushroom Risotto",
                price = 17.00,
                ingredients = listOf("Arborio Rice", "Assorted Mushrooms", "Parmesan", "White Wine"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Desserts
        "Desserts" to listOf(
            FoodItem(
                id = "128",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDzplGi87bJiPX26CdKVIHpoqCLX-x0A2xxg&s",
                name = "Crème Brûlée",
                price = 7.00,
                ingredients = listOf("Custard", "Caramelized Sugar Top"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "129",
                imageUrl = "https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480/img/recipe/ras/Assets/39E92D31-D1AE-44DC-8B86-C60A8E6B8D05/Derivates/744B2C83-F33A-4AB5-A7DD-0D59D555D0F6.jpg",
                name = "Chocolate Lava Cake",
                price = 8.00,
                ingredients = listOf("Warm Chocolate Cake", "Molten Chocolate Center", "Vanilla Ice Cream"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant18 = Restaurant(
    id = 18,
    name = "Quick Bytes Kiosk",
    type = RestaurantType.FastFood,
    rating = 3.9,
    deliveryCharge = 1.00,
    eta = "10-20 min",
    discountPercentage = 5,
    imageUrl = "https://images.unsplash.com/photo-1615996001375-c7ef13294436?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8ZmFzdCUyMGZvb2R8ZW58MHwwfDB8fHwy",
    menu = mapOf(
        // Hot Dogs
        "Hot Dogs" to listOf(
            FoodItem(
                id = "130",
                imageUrl = "https://awrestaurants.com/_next/static/chunks/images/sites-default-files-styles-responsive_image_5x4-public-2024-11-HotDogHotDog_0.3840.jpg",
                name = "Classic Hot Dog",
                price = 4.00,
                ingredients = listOf("Frankfurter", "Bun", "Ketchup", "Mustard"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "131",
                imageUrl = "https://staticcookist.akamaized.net/wp-content/uploads/sites/22/2022/02/chili-dogs.jpg",
                name = "Chili Cheese Dog",
                price = 5.00,
                ingredients = listOf("Frankfurter", "Bun", "Chili", "Cheddar Cheese"),
                spiceLevel = SpiceLevel.MILD
            )
        ),

        // Fries & Sides
        "Fries & Sides" to listOf(
            FoodItem(
                id = "132",
                imageUrl = "https://www.acouplecooks.com/wp-content/uploads/2022/06/Cheese-Fries-005.jpg",
                name = "Cheese Fries",
                price = 4.00,
                ingredients = listOf("French Fries", "Melted Cheddar Cheese Sauce"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "133",
                imageUrl = "https://www.recipeworkbook.com/wp-content/uploads/2021/09/onion-rings3-1024x683.jpg",
                name = "Crispy Onion Rings",
                price = 3.00,
                ingredients = listOf("Onion Rings", "Dipping Sauce"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Snacks
        "Snacks" to listOf(
            FoodItem(
                id = "134",
                imageUrl = "https://noshingwiththenolands.com/wp-content/uploads/2021/09/Soft-Pretzel-Recipe-1200-x-1200.jpg",
                name = "Soft Pretzel with Cheese Dip",
                price = 3.75,
                ingredients = listOf("Soft Pretzel", "Warm Cheese Dip"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "135",
                imageUrl = "https://majasrecipes.com/wp-content/uploads/2024/12/churros-11.jpg",
                name = "Mini Churros (3 pcs)",
                price = 4.00,
                ingredients = listOf("Churros", "Cinnamon Sugar"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Drinks
        "Drinks" to listOf(
            FoodItem(
                id = "136",
                imageUrl = "https://assets.bonappetit.com/photos/62aba9d5b433b325383e9ca9/3:2/w_4950,h_3300,c_limit/0616-lemonade-recipe-lede.jpg",
                name = "Fresh Lemonade",
                price = 2.00,
                ingredients = listOf("Lemon Juice", "Sugar", "Water"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "137",
                imageUrl = "https://lordinu.ro/wp-content/uploads/2016/10/Aqua-carpatica-plata-0.5-jpg.webp",
                name = "Bottled Water",
                price = 1.00,
                ingredients = listOf("Purified Water"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant19 = Restaurant(
    id = 19,
    name = "The Farmers' Pantry",
    type = RestaurantType.Grocery,
    rating = 4.1,
    deliveryCharge = 3.20,
    eta = "45-65 min",
    discountPercentage = 0,
    imageUrl = "https://images.unsplash.com/photo-1607349913338-fca6f7fc42d0?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8Z3JvY2VyeSUyMHN0b3JlfGVufDB8MHwwfHx8Mg%3D%3D",
    menu = mapOf(
        // Fresh Produce
        "Fresh Produce" to listOf(
            FoodItem(
                id = "138",
                imageUrl = "https://images.unsplash.com/photo-1524593166156-312f362cada0?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8dG9tYXRvZXN8ZW58MHwwfDB8fHwy",
                name = "Local Heirloom Tomatoes (500g)",
                price = 4.00,
                ingredients = listOf("Heirloom Tomatoes"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "139",
                imageUrl = "https://images.unsplash.com/photo-1634731201932-9bd92839bea2?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                name = "Farm Fresh Spinach (250g)",
                price = 3.00,
                ingredients = listOf("Spinach"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "140",
                imageUrl = "https://images.unsplash.com/photo-1506365069540-904bcc762636?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                name = "Sweet Bell Peppers (Red, Yellow, Green - 3 pcs)",
                price = 4.25,
                ingredients = listOf("Bell Peppers"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Dairy & Bakery
        "Dairy & Bakery" to listOf(
            FoodItem(
                id = "141",
                imageUrl = "https://images.unsplash.com/photo-1586802990181-a5771596eaea?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8ZWdnc3xlbnwwfDB8MHx8fDI%3D",
                name = "Free-Range Eggs (Dozen)",
                price = 5.75,
                ingredients = listOf("Chicken Eggs"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "142",
                imageUrl = "https://th-thumbnailer.cdn-si-edu.com/j8AlWBKrzerw0xZNVHMOPvlEbUQ=/fit-in/1200x0/filters:focal(1060x711:1061x712)/https%3A%2F%2Ftf-cmsv2-smithsonianmag-media.s3.amazonaws.com%2Ffiler_public%2Fda%2Fc6%2Fdac6155f-9f9a-42dd-a4ab-31081473e684%2Fgettyimages-1488679735.jpg",
                name = "Artisan Cheddar Cheese (250g)",
                price = 7.00,
                ingredients = listOf("Cow's Milk", "Cultures", "Salt", "Rennet"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "143",
                imageUrl = "https://www.selgros.ro/sites/default/files/styles/original_extra_large/public/2023-08/ciabatta%20reteta%20originala.jpg.webp?itok=8jLQtkQz",
                name = "Rustic Ciabatta Loaf",
                price = 3.80,
                ingredients = listOf("Flour", "Water", "Yeast", "Salt"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Pantry & Specialty
        "Pantry & Specialty" to listOf(
            FoodItem(
                id = "144",
                imageUrl = "https://i0.wp.com/post.healthline.com/wp-content/uploads/2021/04/honey-1296x728-header.jpg?w=1155&h=1528",
                name = "Local Honey (500g Jar)",
                price = 9.00,
                ingredients = listOf("Pure Honey"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "145",
                imageUrl = "https://www.nescafe.com/au/sites/default/files/2024-04/Untitled-5%20copy_6_0.jpg",
                name = "Organic Coffee Beans (250g)",
                price = 14.00,
                ingredients = listOf("Organic Arabica Coffee Beans"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant20 = Restaurant(
    id = 20,
    name = "The Sugar & Spice Bakery",
    type = RestaurantType.Bakery,
    rating = 4.9,
    deliveryCharge = 2.20,
    eta = "20-30 min",
    discountPercentage = 15,
    imageUrl = "https://images.unsplash.com/photo-1702770443047-22a2750a84dc?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
    menu = mapOf(
        // Cakes & Tarts
        "Cakes & Tarts" to listOf(
            FoodItem(
                id = "146",
                imageUrl = "https://i0.wp.com/teatimemagazine.com/wp-content/uploads/2023/12/yuletide-cake.jpg?fit=696%2C464&ssl=1",
                name = "Velvet Raspberry Cake (Slice)",
                price = 8.00,
                ingredients = listOf("Velvet Sponge", "Raspberry Compote", "Cream Cheese Frosting"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "147",
                imageUrl = "https://www.southernliving.com/thmb/D_qY7JcMIHihUf6GDOFf1lQpua0=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Southern-Living_Key_Lime_Pie_013-7739d9ed7e5e41f18b57f299e8a7953c.jpg",
                name = "Key Lime Pie (Individual)",
                price = 6.00,
                ingredients = listOf("Lime Custard", "Graham Cracker Crust", "Whipped Cream"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "148",
                imageUrl = "https://i.ytimg.com/vi/3lqZ9upJg7k/maxresdefault.jpg",
                name = "Tiramisu Cup",
                price = 7.00,
                ingredients = listOf("Coffee-soaked Ladyfingers", "Mascarpone Cream", "Cocoa Powder"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Cookies & Brownies
        "Cookies & Brownies" to listOf(
            FoodItem(
                id = "149",
                imageUrl = "https://becs-table.com.au/wp-content/uploads/2023/07/Snickerdoodles-1200.jpg",
                name = "Snickerdoodle Cookie",
                price = 3.25,
                ingredients = listOf("Butter", "Sugar", "Cinnamon", "Flour"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "150",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSxcxn5M3_4kVsIMbue6tuRAOEPYXSC8_LrA&s",
                name = "Peanut Butter Swirl Brownie",
                price = 4.00,
                ingredients = listOf("Chocolate Brownie", "Peanut Butter Swirl"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Breakfast Pastries
        "Breakfast Pastries" to listOf(
            FoodItem(
                id = "151",
                imageUrl = "https://cdn.loveandlemons.com/wp-content/uploads/2024/04/scones.jpg",
                name = "Blueberry Scone",
                price = 4.00,
                ingredients = listOf("Flour", "Butter", "Blueberries", "Cream"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "152",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRS0jqpDzmSGTwQCT9uqYtE9kw2UipsMn6iXA&s",
                name = "Cheese Danish",
                price = 4.25,
                ingredients = listOf("Pastry Dough", "Sweet Cream Cheese Filling"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "153",
                imageUrl = "https://static01.nyt.com/images/2021/04/07/dining/06croissantsrex4-almond/merlin_184842117_321090da-ce3a-4c4d-9e6a-3461506a39d3-superJumbo.jpg",
                name = "Almond Croissant",
                price = 4.75,
                ingredients = listOf("Croissant", "Almond Cream Filling", "Toasted Almonds"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurant21 = Restaurant(
    id = 21,
    name = "The Global Cafe",
    type = RestaurantType.Cafe,
    rating = 4.5,
    deliveryCharge = 1.90,
    eta = "20-30 min",
    discountPercentage = 0,
    imageUrl = "https://images.unsplash.com/photo-1559925393-8be0ec4767c8?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8Y2FmZXxlbnwwfDB8MHx8fDI%3D",
    menu = mapOf(
        // Coffee & Espresso
        "Coffee & Espresso" to listOf(
            FoodItem(
                id = "154",
                imageUrl = "https://skyfallhotel-lb.com/wp-content/uploads/2023/08/DOUBLE-ESSPRESSO.jpg",
                name = "Double Espresso",
                price = 3.00,
                ingredients = listOf("Espresso Beans", "Water"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "155",
                imageUrl = "https://hoxtoncoffee.com/cdn/shop/articles/latte-art-on-mocha_1200x1200.jpg?v=1660069726",
                name = "Mocha Latte",
                price = 5.75,
                ingredients = listOf("Espresso", "Steamed Milk", "Chocolate Syrup", "Whipped Cream"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "156",
                imageUrl = "https://www.allrecipes.com/thmb/Hqro0FNdnDEwDjrEoxhMfKdWfOY=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/21667-easy-iced-coffee-ddmfs-4x3-0093-7becf3932bd64ed7b594d46c02d0889f.jpg",
                name = "Iced Coffee",
                price = 4.00,
                ingredients = listOf("Brewed Coffee", "Ice", "Milk (optional)", "Sweetener (optional)"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Teas & Other Drinks
        "Teas & Other Drinks" to listOf(
            FoodItem(
                id = "157",
                imageUrl = "https://healthyfoodiegirl.com/wp-content/uploads/2024/01/Chai-Latte.jpg",
                name = "Spiced Chai Latte",
                price = 5.00,
                ingredients = listOf("Chai Tea Concentrate", "Steamed Milk", "Cinnamon"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "158",
                imageUrl = "https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480_1_5x/img/recipe/ras/Assets/baa340c436d6ea4fb8b32250c4eff8e0/Derivates/b4a7b6ad8582cfb62ad7c733995a1de8369e9bcb.jpg",
                name = "Fresh Orange Juice",
                price = 4.00,
                ingredients = listOf("Freshly Squeezed Oranges"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Light Bites
        "Light Bites" to listOf(
            FoodItem(
                id = "159",
                imageUrl = "https://cookingwithwineblog.com/wp-content/uploads/2024/01/Classic-Almond-Biscotti-Italian-Cantucci-Featured-1.jpg",
                name = "Almond Biscotti",
                price = 2.00,
                ingredients = listOf("Flour", "Almonds", "Sugar", "Eggs"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "160",
                imageUrl = "https://cdn.apartmenttherapy.info/image/upload/f_jpg,q_auto:eco,c_fill,g_auto,w_1500,ar_1:1/k%2FPhoto%2FRecipes%2F2023-10-spinach-quiche%2Fspinach-quiche-2134",
                name = "Spinach & Cheese Quiche (Slice)",
                price = 6.00,
                ingredients = listOf("Eggs", "Spinach", "Cheese", "Pie Crust"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "161",
                imageUrl = "https://kristineskitchenblog.com/wp-content/uploads/2024/04/veggie-wrap-11-2.jpg",
                name = "Hummus & Veggie Wrap",
                price = 8.00,
                ingredients = listOf("Tortilla", "Hummus", "Cucumber", "Carrots", "Bell Peppers", "Lettuce"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest1 = Restaurant(
    id = 22,
    name = "Caru' cu Bere",
    type = RestaurantType.Restaurant,
    rating = 4.7,
    deliveryCharge = 2.50,
    eta = "35-45 min",
    discountPercentage = 10,
    imageUrl = "https://plus.unsplash.com/premium_photo-1680357664148-6cab0e119f18?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTN8fGJlZXJ8ZW58MHx8MHx8fDA%3D",
    menu = mapOf(
        "Traditional Romanian Main Courses" to listOf(
            FoodItem(
                id = "162",
                imageUrl = "https://plus.unsplash.com/premium_photo-1664478260612-7c3c685d0998?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8U21hbGwlMjBTYXVzYWdlcyUyMHdpdGglMjBNdXN0YXJkfGVufDB8fDB8fHww",
                name = "Small Sausages with Mustard", // Mici cu Muștar =))))
                price = 10.00,
                ingredients = listOf("Minced meat (pork and beef)", "Spices", "Mustard"),
                spiceLevel = SpiceLevel.MILD
            ),
            FoodItem(
                id = "163",
                imageUrl = "https://plus.unsplash.com/premium_photo-1701973251304-90707eb09804?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTN8fENhYmJhZ2UlMjBSb2xscyUyMHdpdGglMjBQb2xlbnRhJTIwYW5kJTIwU291ciUyMENyZWFtfGVufDB8fDB8fHww",
                name = "Cabbage Rolls with Polenta and Sour Cream", // Sarmale cu Mămăliguță și Smântână
                price = 22.00,
                ingredients = listOf("Sour cabbage leaves", "Minced meat", "Rice", "Polenta", "Sour cream"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "164",
                imageUrl = "https://images.unsplash.com/photo-1665594051407-7385d281ad76?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8VHJpcGUlMjBTb3VwfGVufDB8fDB8fHww",
                name = "Tripe Soup", // Ciorbă de Burtă :)))
                price = 18.00,
                ingredients = listOf("Beef tripe", "Sour cream", "Egg", "Garlic", "Vinegar"),
                spiceLevel = SpiceLevel.MILD
            )
        ),

        // Appetizers
        "Appetizers" to listOf(
            FoodItem(
                id = "165",
                imageUrl = "https://images.pexels.com/photos/18349977/pexels-photo-18349977/free-photo-of-meal-on-wooden-board-by-zacusca-in-glass-jars-on-table.jpeg?auto=compress&cs=tinysrgb&w=600",
                name = "Zacusca (Vegetable Spread)",
                price = 9.00,
                ingredients = listOf("Roasted eggplant", "Bell peppers", "Onion", "Tomatoes"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "166",
                imageUrl = "https://www.eatingwell.com/thmb/JZsh0lxL7Kv00Abb7NPUYnx4uEI=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/6675627-1c519176bcb149beb6a084771a9c5d57.jpg",
                name = "Eggplant Salad",
                price = 10.00,
                ingredients = listOf("Roasted eggplant", "Oil", "Onion"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        // Desserts
        "Desserts" to listOf(
            FoodItem(
                id = "167",
                imageUrl = "https://i0.wp.com/veredguttman.com/wp-content/uploads/2020/12/papanasi-papanash.jpg?resize=750%2C750&ssl=1",
                name = "Papanasi with Sour Cream and Jam",
                price = 15.00,
                ingredients = listOf("Cottage cheese", "Flour", "Eggs", "Sour cream", "Blueberry jam"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "168",
                imageUrl = "https://thumbs.dreamstime.com/b/pancakes-23872338.jpg?w=768",
                name = "Pancakes with Finetti Chocolate Spread",
                price = 15.00,
                ingredients = listOf("Pancakes", "Finetti chocolate spread"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest2 = Restaurant(
    id = 23,
    name = "La Mama",
    type = RestaurantType.Restaurant,
    rating = 4.3,
    deliveryCharge = 3.00,
    eta = "25-35 min",
    discountPercentage = 0,
    imageUrl = "https://timeoutbucuresti.ro/wp-content/uploads/2023/06/La-Mama-1-of-1.jpg",
    menu = mapOf(
        "Soups" to listOf(
            FoodItem(
                id = "169",
                imageUrl = "https://media.istockphoto.com/id/1285926633/ro/fotografie/carne-de-vit%C4%83-bourguignon-tocan%C4%83-de-carne-cu-legume-%C8%99i-ciuperci-cu-vin-ro%C8%99u-%C3%AEntr-o-tigaie.jpg?s=612x612&w=0&k=20&c=jqvv3hyG7N8vcwi10Svj5heaD92ScN6T8A-aoa78ElI=",
                name = "Traditional Beef Soup",
                price = 6.00,
                ingredients = listOf("Beef", "Vegetables", "Noodles"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "170",
                imageUrl = "https://media.istockphoto.com/id/510011108/ro/fotografie/fasole-cu-carne.jpg?s=612x612&w=0&k=20&c=TjGYiibM5oNjr0zjYky8KrHTliApiFdtvHm7yUt_Kds=",
                name = "Smoked Bean Soup with Smoked Hocks",
                price = 7.00,
                ingredients = listOf("Beans", "Smoked pork hocks", "Vegetables"),
                spiceLevel = SpiceLevel.MILD
            )
        ),

        "Main Courses" to listOf(
            FoodItem(
                id = "171",
                imageUrl = "https://media.istockphoto.com/id/2149800067/ro/fotografie/por%C8%9Bie-de-piept-de-pui-la-gr%C4%83tar-cu-o-garnitur%C4%83-de-piure-de-cartofi-%C8%99i-broccoli-prim.jpg?s=612x612&w=0&k=20&c=qxMUQ3Sc1bMfMhObAVaAVID5OP1PtUjXe7JxPJjf1dc=",
                name = "Grilled Chicken Breast with Mashed Potatoes",
                price = 12.00,
                ingredients = listOf("Chicken breast", "Potatoes", "Milk", "Butter"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "172",
                imageUrl = "https://media.istockphoto.com/id/486565658/ro/fotografie/p%C3%A2ine-de-cas%C4%83-german%C4%83-weiner-schnitzel.jpg?s=612x612&w=0&k=20&c=_CGdf-_pbpnvgmWpBNiriuIMgSqlqPXSgd61n5g827M=",
                name = "Pork Schnitzel",
                price = 14.00,
                ingredients = listOf("Pork fillet", "Breadcrumbs", "Egg", "Flour"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "173",
                imageUrl = "https://media.istockphoto.com/id/1333540545/ro/fotografie/moussaka-pe-baz%C4%83-de-plante-cu-nuc-ciuperci-%C8%99i-acoperite-cu-cartofi-cremo%C8%99i-bechamel.jpg?s=612x612&w=0&k=20&c=MbYpzNW9qVQFmvlx_-iupe8xhczi9IbT5rabP3ArQps=",
                name = "Vegetarian Moussaka",
                price = 11.00,
                ingredients = listOf("Potatoes", "Eggplant", "Zucchini", "Mushrooms", "Tomato sauce"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        "Salads" to listOf(
            FoodItem(
                id = "174",
                imageUrl = "https://media.istockphoto.com/id/1337799015/ro/fotografie/salata-caesar.jpg?s=612x612&w=0&k=20&c=p511PJsIr0sUf-WNazCnM1FzJKcZc2cAtFyiqLh5vjg=",
                name = "Caesar Salad",
                price = 9.00,
                ingredients = listOf("Romaine lettuce", "Chicken breast", "Croutons", "Parmesan", "Caesar dressing"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "175",
                imageUrl = "https://media.istockphoto.com/id/1178068360/ro/fotografie/magazine-de-legume-bulg%C4%83re%C8%99tika-salat%C4%83-fundal-din-lemn-%C3%AEnchide%C8%9Bi.jpg?s=612x612&w=0&k=20&c=kFBYXNAUvZBVLGxkHArhqRSgnQK3OiWaaQn-ksZh3Jw=",
                name = "Bulgarian Salad",
                price = 8.00,
                ingredients = listOf("Tomatoes", "Cucumbers", "Onion", "Bell peppers", "Feta cheese", "Olives"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest3 = Restaurant(
    id = 23,
    name = "The Urban Spoon",
    type = RestaurantType.Cafe,
    rating = 4.6,
    deliveryCharge = 2.00,
    eta = "20-30 min",
    discountPercentage = 5,
    imageUrl = "https://media.istockphoto.com/id/1018141890/ro/fotografie/dou%C4%83-pahare-goale-de-vin-st%C3%A2nd-%C3%AEntr-un-restaurant-%C3%AEntr-o-dup%C4%83-amiaz%C4%83-cald%C4%83-%C3%AEnsorit%C4%83.jpg?s=612x612&w=0&k=20&c=D9qQt7hEZoC94OrcybVqqc3mVr7BNkrqawNylDy1eXo=",
    menu = mapOf(
        "Breakfast & Brunch" to listOf(
            FoodItem(
                id = "172",
                imageUrl = "https://media.istockphoto.com/id/980285640/ro/fotografie/avocado-s%C4%83n%C4%83tos-%C8%99i-p%C3%A2ine-pr%C4%83jit%C4%83-cu-ou%C4%83-cu-semin%C8%9Be-de-dovleac-%C8%99i-susan-pres%C4%83rate-cu.jpg?s=612x612&w=0&k=20&c=zZNNE7o2NvN5UP-4VCnsvBFeZui0nISE0p2Jg6CqoM0=",
                name = "Avocado Toast with Poached Egg",
                price = 9.00,
                ingredients = listOf("Sourdough bread", "Avocado", "Poached egg", "Chili flakes", "Arugula"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "173",
                imageUrl = "https://media.istockphoto.com/id/1396762374/ro/fotografie/shakshuka-%C3%AEn-tigaie-pe-tejghea-de-buc%C4%83t%C4%83rie.jpg?s=612x612&w=0&k=20&c=TRY6saeN6h9kvgNc9XtUBmazig3GYwYWfpuDCwYEiys=",
                name = "Shakshuka",
                price = 11.00,
                ingredients = listOf("Tomatoes", "Bell peppers", "Onion", "Eggs", "Feta cheese"),
                spiceLevel = SpiceLevel.MILD
            ),
            FoodItem(
                id = "174",
                imageUrl = "https://media.istockphoto.com/id/1305291791/ro/fotografie/bol-mixt-de-fructe-de-padure-pe-masa-rustica-din-lemn.jpg?s=612x612&w=0&k=20&c=nib6UPSbfIEwB5aTz7Jqj_GzcMHFJfeTMZhMjeL-q2Q=",
                name = "Berry Smoothie Bowl",
                price = 8.00,
                ingredients = listOf("Mixed berries", "Banana", "Greek yogurt", "Granola", "Coconut flakes"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        "Sandwiches & Wraps" to listOf(
            FoodItem(
                id = "175",
                imageUrl = "https://media.istockphoto.com/id/1339623043/ro/fotografie/rola-halloumi.jpg?s=612x612&w=0&k=20&c=NDdHuQcLcllKeb_veZPxYuy9CQYbxt7y-7qUlWOHSrE=",
                name = "Grilled Halloumi & Veggie Wrap",
                price = 10.00,
                ingredients = listOf("Tortilla", "Grilled halloumi", "Zucchini", "Bell peppers", "Hummus", "Spinach"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "176",
                imageUrl = "https://media.istockphoto.com/id/619073422/ro/fotografie/covrig-pr%C4%83jit-cu-somon-afumat-%C8%99i-br%C3%A2nz%C4%83-crem%C4%83.jpg?s=612x612&w=0&k=20&c=WNCpRAl18vX33KsA3C8nasKIMolX-DrNUIB3OFq2hBY=",
                name = "Smoked Salmon Bagel",
                price = 9.00,
                ingredients = listOf("Bagel", "Smoked salmon", "Cream cheese", "Red onion", "Capers"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        "Coffee & Drinks" to listOf(
            FoodItem(
                id = "177",
                imageUrl = "https://media.istockphoto.com/id/891706644/ro/fotografie/duminic%C4%83-diminea%C8%9B%C4%83-plat-alb.jpg?s=612x612&w=0&k=20&c=MyUaN5fn_BNAzOnv_UAz6LHMixja-kl4GIo8XxTKEIM=",
                name = "Flat White",
                price = 4.00,
                ingredients = listOf("Espresso", "Steamed milk"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "178",
                imageUrl = "https://media.istockphoto.com/id/1400831765/ro/fotografie/fructe-portocalii-galbene-%C8%99i-suc-proasp%C4%83t-de-portocale-stoarcerea-portocalei-proaspete.jpg?s=612x612&w=0&k=20&c=_s5sqHPKBzlZrnp5xWl4-ll6zIpMN0oc6LK7WfLMk8k=",
                name = "Freshly Squeezed Orange Juice",
                price = 5.00,
                ingredients = listOf("Fresh oranges"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest4 = Restaurant(
    id = 24,
    name = "Pizza Ciao",
    type = RestaurantType.Restaurant,
    rating = 4.2,
    deliveryCharge = 2.80,
    eta = "30-40 min",
    discountPercentage = 0,
    imageUrl = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/12/b3/3d/5e/img-20180120-wa0004-largejpg.jpg?w=900&h=-1&s=1",
    menu = mapOf(
        "Pizzas" to listOf(
            FoodItem(
                id = "178",
                imageUrl = "https://media.istockphoto.com/id/1393150881/ro/fotografie/pizza-italiana-margherita-cu-branza-si-sos-de-rosii-pe-tabla-pe-masa-gri-macro-close-up.jpg?s=612x612&w=0&k=20&c=M_OLeTqw5t0WBbDP77THyKrKd8G9GhTKbHSyXear9C8=",
                name = "Pizza Margherita",
                price = 10.00,
                ingredients = listOf("Tomato sauce", "Mozzarella", "Fresh basil"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "179",
                imageUrl = "https://media.istockphoto.com/id/1744442094/ro/fotografie/pizza-quattro-fromaggi-pe-o-plac%C4%83-de-lemn-patru-pizza-cu-br%C3%A2nz%C4%83-sau-pizza-quattro.jpg?s=612x612&w=0&k=20&c=devu3ZQoe9gTNxBYf3sHlRgaQwu59NnaFsX1ommQ_sI=",
                name = "Pizza Quattro Formaggi",
                price = 13.00,
                ingredients = listOf("Mozzarella", "Gorgonzola", "Parmesan", "Provolone"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "180",
                imageUrl = "https://media.istockphoto.com/id/1452846407/ro/fotografie/shot-close-up-de-o-pizza-pepperoni-clasic-servit-cu-frunze-de-busuioc.jpg?s=612x612&w=0&k=20&c=ny5QUmmmQoUL6xusuEkyL1eizH9797shLy9_oDOPpA4=",
                name = "Pizza Diavola",
                price = 12.00,
                ingredients = listOf("Tomato sauce", "Mozzarella", "Spicy salami", "Chili flakes"),
                spiceLevel = SpiceLevel.HOT
            ),
            FoodItem(
                id = "181",
                imageUrl = "https://media.istockphoto.com/id/1226972850/ro/fotografie/pizza-prosciutto-e-funghi-cuptor-traditional-italian-la-cuptor-sos-de-rosii-mozzarella.jpg?s=612x612&w=0&k=20&c=qG-wHaE2HYr5bJ1Ewqyz_PRGMBlUimqaOj4GR_0vdYk=",
                name = "Pizza Prosciutto e Funghi",
                price = 11.00,
                ingredients = listOf("Tomato sauce", "Mozzarella", "Ham", "Mushrooms"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        "Pasta" to listOf(
            FoodItem(
                id = "182",
                imageUrl = "https://media.istockphoto.com/id/177413384/ro/fotografie/paste-cu-carbonara.jpg?s=612x612&w=0&k=20&c=tD2C--kX6K-2O1hiOMI6aSmEqbls9lWvf-RDutie720=",
                name = "Spaghetti Carbonara",
                price = 11.00,
                ingredients = listOf("Spaghetti", "Eggs", "Pancetta", "Pecorino cheese", "Black pepper"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "183",
                imageUrl = "https://media.istockphoto.com/id/482964545/ro/fotografie/paste-arrabiata.jpg?s=612x612&w=0&k=20&c=4Xjt9XglOc3AdDFBzQ25BrsolmrHPXzw0DhIzNFXHt4=",
                name = "Penne Arrabbiata",
                price = 10.00,
                ingredients = listOf("Penne", "Tomato sauce", "Garlic", "Chili", "Parsley"),
                spiceLevel = SpiceLevel.MEDIUM
            )
        ),

        "Desserts" to listOf(
            FoodItem(
                id = "184",
                imageUrl = "https://media.istockphoto.com/id/1248489319/ro/fotografie/tort-tiramisu-cu-menta.jpg?s=612x612&w=0&k=20&c=aN8N8PU6uuUItrzDazkb3vGgOqonqJrd828GWwdi9mo=",
                name = "Tiramisu",
                price = 6.00,
                ingredients = listOf("Ladyfingers", "Mascarpone", "Coffee", "Cocoa powder"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest5 = Restaurant(
    id = 25,
    name = "Sushi Bar Zen",
    type = RestaurantType.Restaurant,
    rating = 4.8,
    deliveryCharge = 3.00,
    eta = "30-45 min",
    discountPercentage = 0,
    imageUrl = "https://media.istockphoto.com/id/1555947107/ro/fotografie/set-de-sushi-%C8%99i-maki.jpg?s=612x612&w=0&k=20&c=6uFhmFVJidsLHewQo_1fk47ZUje9_SECcF030WqicCU=",
    menu = mapOf(
        "Nigiri" to listOf(
            FoodItem(
                id = "185",
                imageUrl = "https://media.istockphoto.com/id/514415144/ro/fotografie/set-de-somon-nigiri-sushi-%C8%99i-be%C8%9Bi%C8%99oare.jpg?s=612x612&w=0&k=20&c=Ff8EKCb_ujQj-Zj_977haxkQOOl1Iu0Vj6ib3b_c1sU=",
                name = "Salmon Nigiri (2 pcs)",
                price = 7.00,
                ingredients = listOf("Sushi rice", "Fresh salmon"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "186",
                imageUrl = "https://media.istockphoto.com/id/655973342/ro/fotografie/sushi-ton-pus-pe-fond-negru.jpg?s=612x612&w=0&k=20&c=j54UJPIPXpzAj-z8IGFEJYp-C8pqgi9tZTpyb1q5TVs=",
                name = "Tuna Nigiri (2 pcs)",
                price = 8.00,
                ingredients = listOf("Sushi rice", "Fresh tuna"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        "Maki Rolls" to listOf(
            FoodItem(
                id = "187",
                imageUrl = "https://media.istockphoto.com/id/1521132476/ro/fotografie/california-rolls.jpg?s=612x612&w=0&k=20&c=wFAR3clcLcKU7mLGoF-_CZ0IuNQEYT3Y-ou1UT9y09Q=",
                name = "California Roll (8 pcs)",
                price = 12.00,
                ingredients = listOf("Sushi rice", "Nori", "Crab stick", "Avocado", "Cucumber", "Tobiko"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "188",
                imageUrl = "https://media.istockphoto.com/id/495774976/ro/fotografie/spicy-ton-roll.jpg?s=612x612&w=0&k=20&c=qZpcUcRoxNg-RgDT8BhszoK-0cpTsm7N_PEPYrEzFcY=",
                name = "Spicy Tuna Roll (8 pcs)",
                price = 13.00,
                ingredients = listOf("Sushi rice", "Nori", "Tuna", "Spicy mayo", "Scallions"),
                spiceLevel = SpiceLevel.MEDIUM
            ),
            FoodItem(
                id = "189",
                imageUrl = "https://media.istockphoto.com/id/1302598144/ro/fotografie/rola-de-sushi-philadelphia-servit%C4%83-pe-plac%C4%83-ceramic%C4%83-neagr%C4%83.jpg?s=612x612&w=0&k=20&c=ph3HzuqvZ6KbVkSdKtpFJWGZ7eaqAXZZHWhL2aEzvVU=",
                name = "Philadelphia Roll (8 pcs)",
                price = 12.00,
                ingredients = listOf("Sushi rice", "Nori", "Smoked salmon", "Cream cheese", "Cucumber"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        "Sashimi" to listOf(
            FoodItem(
                id = "190",
                imageUrl = "https://media.istockphoto.com/id/621899966/ro/fotografie/felii-de-somon-sashimi-meniu-japonez-de-m%C3%A2ncare-crud%C4%83-delicios.jpg?s=612x612&w=0&k=20&c=uuesE3rI0hfmGaVyrrlgRT4ljV_EfD-ANuv9n5jJ2Nc=",
                name = "Salmon Sashimi (3 pcs)",
                price = 10.00,
                ingredients = listOf("Fresh salmon"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        "Soups & Sides" to listOf(
            FoodItem(
                id = "191",
                imageUrl = "https://media.istockphoto.com/id/479541866/ro/fotografie/sup%C4%83-miso-japonez%C4%83-%C3%AEntr-un-castron-alb-vedere-orizontal%C4%83-de-sus.jpg?s=612x612&w=0&k=20&c=wTAqaLEP3-RFjfh3kV6vFCERaSCFeM8XwMWP4h4lmU4=",
                name = "Miso Soup",
                price = 4.00,
                ingredients = listOf("Miso paste", "Tofu", "Seaweed", "Scallions"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "192",
                imageUrl = "https://media.istockphoto.com/id/945129060/ro/fotografie/edamame.jpg?s=612x612&w=0&k=20&c=0wH3ALc4PutgvqDvAYhjYo-QqNOW-C9_NVVM-TvanjY=",
                name = "Edamame",
                price = 5.00,
                ingredients = listOf("Steamed soybeans", "Sea salt"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest6 = Restaurant(
    id = 26,
    name = "Burger Factory",
    type = RestaurantType.FastFood,
    rating = 4.4,
    deliveryCharge = 2.20,
    eta = "20-30 min",
    discountPercentage = 15,
    imageUrl = "https://media.istockphoto.com/id/1295387240/ro/fotografie/mas%C4%83-delicioas%C4%83.jpg?s=612x612&w=0&k=20&c=lBYiRXF1pBl4QJLfb92wNW-OPotQmX2zIcnP2-ShxT8=",
    menu = mapOf(
        "Burgers" to listOf(
            FoodItem(
                id = "193",
                imageUrl = "https://media.istockphoto.com/id/854565540/ro/fotografie/prim-plan-cu-burgeri-de-cas%C4%83.jpg?s=612x612&w=0&k=20&c=lmM05JLzevFsxYVcOUCgZfHn4nIERxmqRwVXaZ7UG20=",
                name = "Classic Cheeseburger",
                price = 9.00,
                ingredients = listOf("Beef patty", "Cheddar cheese", "Lettuce", "Tomato", "Pickles", "Burger sauce", "Brioche bun"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "194",
                imageUrl = "https://media.istockphoto.com/id/811146266/ro/fotografie/burger-proasp%C4%83t-gustos.jpg?s=612x612&w=0&k=20&c=eQIyDPSvzjGRVPo7a05278U7UeQvU0qzerHiv3Mfd5o=",
                name = "Bacon & Egg Burger",
                price = 11.00,
                ingredients = listOf("Beef patty", "Crispy bacon", "Fried egg", "Cheddar cheese", "Caramelized onions", "BBQ sauce", "Brioche bun"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "195",
                imageUrl = "https://media.istockphoto.com/id/526283108/ro/fotografie/homemade-vegan-tras-jackfruit-bbq-sandwich.jpg?s=612x612&w=0&k=20&c=J5fj-NNs8nE_o38QRGbNmNXA8FmNBN_ABnJuRPzxcEc=",
                name = "Spicy Chicken Burger",
                price = 10.00,
                ingredients = listOf("Crispy chicken fillet", "Spicy mayo", "Coleslaw", "Jalapeños", "Brioche bun"),
                spiceLevel = SpiceLevel.MEDIUM
            ),
            FoodItem(
                id = "196",
                imageUrl = "https://media.istockphoto.com/id/1248302421/ro/fotografie/vegan-falafel-burger-cu-legume-%C8%99i-sos-fundal-%C3%AEntunecat-spa%C8%9Biu-de-copiere-concept-de.jpg?s=612x612&w=0&k=20&c=qR1OcGBSr-V_Q--mswmwayUvED7T8BLmIa6ryBXRSyc=",
                name = "Veggie Burger",
                price = 9.00,
                ingredients = listOf("Vegetable patty", "Lettuce", "Tomato", "Onion rings", "Avocado mayo", "Whole wheat bun"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        "Sides" to listOf(
            FoodItem(
                id = "197",
                imageUrl = "https://media.istockphoto.com/id/1443993866/ro/fotografie/cartofi-pr%C4%83ji%C8%9Bi-cu-ketchup-%C8%99i-sos-de-cocktail.jpg?s=612x612&w=0&k=20&c=k41ZtY9FVgqMv-DfpNbbeMj_hzWPUm6Xj2Y-WfeFHxE=",
                name = "French Fries",
                price = 3.00,
                ingredients = listOf("Potatoes", "Salt"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "198",
                imageUrl = "https://media.istockphoto.com/id/865789218/ro/fotografie/inele-de-ceapa-cu-ketchup.jpg?s=612x612&w=0&k=20&c=5w-6itAEvc4zrkd2Vva_p92ABQatsBlAUl0B8JY-wFg=",
                name = "Onion Rings",
                price = 4.00,
                ingredients = listOf("Onion", "Batter", "Oil"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "199",
                imageUrl = "https://media.istockphoto.com/id/1013694674/ro/fotografie/salat%C4%83-tradi%C8%9Bional%C4%83-de-gheara-de-cole.jpg?s=612x612&w=0&k=20&c=WDSlanKWOwkTCoLxx8SNYP5pvL5T7g2mouoSBR4wj6w=",
                name = "Coleslaw",
                price = 3.00,
                ingredients = listOf("Cabbage", "Carrots", "Mayonnaise dressing"),
                spiceLevel = SpiceLevel.NONE
            )
        ),

        "Drinks" to listOf(
            FoodItem(
                id = "200",
                imageUrl = "https://media.istockphoto.com/id/1217684552/ro/fotografie/coca-cola-poate-de-cola-pe-care-oamenii-o-beau-%C3%AEn-timp-ce-m%C4%83n%C3%A2nc%C4%83-fabricat-din-aluminiu.jpg?s=612x612&w=0&k=20&c=3MwuVA8Ov5-o1XU2XJWISFIvQ18m4hM-Eap8deZWHKU=",
                name = "Coca-Cola (Can)",
                price = 2.00,
                ingredients = listOf("Coca-Cola"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "201",
                imageUrl = "https://media.istockphoto.com/id/480775284/ro/fotografie/zborul-berii-artizanale.jpg?s=612x612&w=0&k=20&c=homnIh2gbK4ixsnCATESG5YNx7Xf3tD0RiGnnVuv87w=",
                name = "Local Craft Beer",
                price = 5.00,
                ingredients = listOf("Water", "Malt", "Hops", "Yeast"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest7 = Restaurant(
    id = 27,
    name = "Green Bites Salad Bar",
    type = RestaurantType.Restaurant, // Could also be Cafe, depending on the specific concept
    rating = 4.5,
    deliveryCharge = 1.00,
    eta = "15-25 min",
    discountPercentage = 10,
    imageUrl = "https://media.istockphoto.com/id/523400804/ro/fotografie/supermarket-legume.jpg?s=612x612&w=0&k=20&c=-VLf7Jhpds_GreymLzT_Hrmk9U1ciR5fW0uQrK8O-Ao=",
    menu = mapOf(
        "Build Your Own Salad" to listOf(
            FoodItem(
                id = "202",
                imageUrl = "https://media.istockphoto.com/id/944478708/ro/fotografie/cuplu-mananca-masa-de-pr%C3%A2nz-cu-salata-proaspata-si-aperitive.jpg?s=612x612&w=0&k=20&c=G9oKqUKY595J-HGEIPXWv3ZAi7Vob2JxznJRmDg4qGU=",
                name = "Custom Salad (Base + 5 Toppings + Dressing)",
                price = 10.00,
                ingredients = listOf("Choose your greens", "Protein options", "Fresh vegetables", "Nuts & seeds", "Premium dressings"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Signature Salads" to listOf(
            FoodItem(
                id = "203",
                imageUrl = "https://media.istockphoto.com/id/478991680/ro/fotografie/quinoa-spanac-salata-de-vinete-feta.jpg?s=612x612&w=0&k=20&c=ZOBsGwX2NhcZf0apvpTGaMvS9Dcy2KMsK4jtVqjqzqY=",
                name = "Mediterranean Quinoa Salad",
                price = 12.00,
                ingredients = listOf("Quinoa", "Cucumber", "Tomatoes", "Olives", "Feta cheese", "Red onion", "Lemon-herb vinaigrette"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "204",
                imageUrl = "https://media.istockphoto.com/id/169986941/ro/fotografie/salata-de-pui.jpg?s=612x612&w=0&k=20&c=2Zqi-gIU078Cjiqj1Sv3wh3C_bfIkXEWh1vg6r6CWIs=",
                name = "Grilled Chicken Caesar Salad",
                price = 11.00,
                ingredients = listOf("Romaine lettuce", "Grilled chicken breast", "Croutons", "Parmesan", "Caesar dressing"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "205",
                imageUrl = "https://media.istockphoto.com/id/1200883141/ro/fotografie/somon-afumat-cu-m%C4%83rar-%C8%99i-l%C4%83m%C3%A2ie.jpg?s=612x612&w=0&k=20&c=aIbIByt8CovffT_nZL35dITVKrJPX0Ytj7izXJCdUs8=",
                name = "Smoked Salmon & Dill Salad",
                price = 13.00,
                ingredients = listOf("Mixed greens", "Smoked salmon", "Cherry tomatoes", "Red onion", "Capers", "Dill-yogurt dressing"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Soups & Sides" to listOf(
            FoodItem(
                id = "206",
                imageUrl = "https://media.istockphoto.com/id/1362685419/ro/fotografie/supa-cremoasa-cu-ciuperci-boletus-si-ierburi-pe-masa-rustica-din-lemn.jpg?s=612x612&w=0&k=20&c=-nGMhCIEaob-B2pO5hEW4tK1ced6lYQaqzEFGecOz40=",
                name = "Cream of Mushroom Soup",
                price = 5.00,
                ingredients = listOf("Fresh mushrooms", "Cream", "Herbs"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "207",
                imageUrl = "https://media.istockphoto.com/id/537871744/ro/fotografie/multi-semin%C8%9Be-chifle-de-gr%C3%A2u-integral-pe-un-fundal-de-piatr%C4%83-gri.jpg?s=612x612&w=0&k=20&c=nsmgDH_9IjsRM3RWWiqXkXO4Fra83am8mQ8c2NvcYkE=",
                name = "Whole Wheat Bread Roll",
                price = 1.00,
                ingredients = listOf("Whole wheat flour", "Water", "Yeast", "Salt"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest8 = Restaurant(
    id = 28,
    name = "The Dessert Haven",
    type = RestaurantType.Bakery,
    rating = 4.9,
    deliveryCharge = 1.80,
    eta = "20-30 min",
    discountPercentage = 0,
    imageUrl = "https://media.istockphoto.com/id/497959594/ro/fotografie/pr%C4%83jituri-proaspete.jpg?s=612x612&w=0&k=20&c=O1eIZ_1JcgxH5SCfKm20cx0B70qmUHzjiy4pC34Y7M4=",
    menu = mapOf(
        "Cakes & Slices" to listOf(
            FoodItem(
                id = "208",
                imageUrl = "https://media.istockphoto.com/id/544716244/ro/fotografie/tort-de-lav%C4%83-de-ciocolat%C4%83-cald%C4%83-cu-centru-topit-%C8%99i-coac%C4%83ze-ro%C8%99ii.jpg?s=612x612&w=0&k=20&c=9mckeScehtNa7g0PGdSyhS-aGvlcFLsZJ6DPPTB_WHY=",
                name = "Chocolate Lava Cake",
                price = 7.00,
                ingredients = listOf("Dark chocolate", "Flour", "Eggs", "Sugar", "Butter"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "209",
                imageUrl = "https://media.istockphoto.com/id/1125658011/ro/fotografie/felie-de-cheesecake-cu-zmeur%C4%83-proasp%C4%83t%C4%83-afine-gem-%C8%99i-ment%C4%83-pe-fond-de-beton-vedere-de-sus.jpg?s=612x612&w=0&k=20&c=TMsO_qlP6i1UFswPboIBtjHiBeYLtfsMQJNUW6kKHjo=",
                name = "New York Cheesecake Slice",
                price = 6.00,
                ingredients = listOf("Cream cheese", "Graham cracker crust", "Sour cream", "Vanilla"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "210",
                imageUrl = "https://media.istockphoto.com/id/1078587036/ro/fotografie/tort-de-catifea-rosie-decorat-flori-de-trandafir-pe-farfurie-alba.jpg?s=612x612&w=0&k=20&c=GllsCn-YxkGxOo7omNEV674-WsOGAMnM45IcAk5sKi8=",
                name = "Red Velvet Cake Slice",
                price = 6.00,
                ingredients = listOf("Red velvet sponge", "Cream cheese frosting"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Pastries & Tarts" to listOf(
            FoodItem(
                id = "211",
                imageUrl = "https://media.istockphoto.com/id/611625984/ro/fotografie/mini-tarte-delicioase-de-zmeur%C4%83-pe-fond-%C3%AEntunecat.jpg?s=612x612&w=0&k=20&c=FrZ88zHFClCZFFOemM3VYBKa-URoypB_QI7j70MAT6k=",
                name = "Fruit Tartlet",
                price = 5.00,
                ingredients = listOf("Pâte sablée", "Pastry cream", "Seasonal fresh fruits"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "212",
                imageUrl = "https://media.istockphoto.com/id/1463830243/ro/fotografie/croissant-dulce-delicios-cu-ciocolat%C4%83-%C8%99i-fructe-pe-mas%C4%83-alb%C4%83-din-lemn.jpg?s=612x612&w=0&k=20&c=xpb2jVKSqV8LhDqx8yzn5MN0dkdkAvH09caZ-i3ly5I=",
                name = "Croissant with Chocolate",
                price = 3.00,
                ingredients = listOf("Puff pastry", "Chocolate filling"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Cookies & Brownies" to listOf(
            FoodItem(
                id = "213",
                imageUrl = "https://media.istockphoto.com/id/1066562502/ro/fotografie/o-pisic%C4%83-alb%C4%83-curioas%C4%83-%C8%99i-o-gr%C4%83mad%C4%83-de-biscui%C8%9Bi.jpg?s=612x612&w=0&k=20&c=53I31M2WRIxtCgyjVymLBR7rH32FZ4mQCIKMBE1-Hd4=",
                name = "Classic Chocolate Chip Cookie",
                price = 2.00,
                ingredients = listOf("Flour", "Butter", "Brown sugar", "Chocolate chips"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "214",
                imageUrl = "https://media.istockphoto.com/id/628596566/ro/fotografie/ciocolata-fudgy-brownie-cu-inghetata-de-vanilie-pe-partea-de-sus.jpg?s=612x612&w=0&k=20&c=zR2SkFePL8G0FpkhMHIU3JHAli7ZT9OJNecDTrGhkcg=",
                name = "Fudgy Brownie",
                price = 4.00,
                ingredients = listOf("Dark chocolate", "Butter", "Sugar", "Eggs", "Flour"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest9 = Restaurant(
    id = 29,
    name = "Curry House",
    type = RestaurantType.Restaurant,
    rating = 4.6,
    deliveryCharge = 3.20,
    eta = "35-45 min",
    discountPercentage = 0,
    imageUrl = "https://media.istockphoto.com/id/1295772368/ro/fotografie/macher-jhol-%C3%AEn-castron-negru-pe-partea-de-sus-mas%C4%83-ardezie-%C3%AEntuneric-buc%C4%83t%C4%83ria-indian%C4%83.jpg?s=612x612&w=0&k=20&c=27RhyjIJG2_SIePLSX6cFHj3jB6VcJdcK04f5F9EBAA=",
    menu = mapOf(
        "Chicken Curries" to listOf(
            FoodItem(
                id = "215",
                imageUrl = "https://media.istockphoto.com/id/1093661590/ro/fotografie/m%C3%A2ncare-tradi%C8%9Bional%C4%83-indian%C4%83-pui-tikka-masala-cu-carne-de-curry-picant%C4%83-%C3%AEn-castron-orez.jpg?s=612x612&w=0&k=20&c=J9RJhQqJDt3kfp2cW1qsuqAHBvf0qveqzSeS06goQYU=",
                name = "Chicken Tikka Masala",
                price = 15.00,
                ingredients = listOf("Marinated chicken", "Creamy tomato sauce", "Spices"),
                spiceLevel = SpiceLevel.MEDIUM
            ),
            FoodItem(
                id = "216",
                imageUrl = "https://media.istockphoto.com/id/618457124/ro/fotografie/unt-de-pui-servit-cu-p%C3%A2ine-de-cas%C4%83-indian-naan.jpg?s=612x612&w=0&k=20&c=lPvIuJDNLph5txEJcDDd46ul_nVz0gxAT-SH42gghns=",
                name = "Butter Chicken",
                price = 14.00,
                ingredients = listOf("Chicken", "Tomato puree", "Butter", "Cream", "Fenugreek"),
                spiceLevel = SpiceLevel.MILD
            )
        ),
        "Vegetarian Curries" to listOf(
            FoodItem(
                id = "217",
                imageUrl = "https://media.istockphoto.com/id/1166167732/ro/fotografie/palak-paneer-pe-fundal-de-beton-gri.jpg?s=612x612&w=0&k=20&c=6f7I_zMnOz9n3PANV6ZVEjBM9Ulfl1v049-4r1e_68M=",
                name = "Palak Paneer",
                price = 13.00,
                ingredients = listOf("Spinach", "Indian cottage cheese", "Garlic", "Ginger", "Spices"),
                spiceLevel = SpiceLevel.MEDIUM
            ),
            FoodItem(
                id = "218",
                imageUrl = "https://media.istockphoto.com/id/1170374719/ro/fotografie/dal-makhani-pe-fundal-%C3%AEntunecat.jpg?s=612x612&w=0&k=20&c=6mTAT9HBjJ6jdTNDuryKxt__zsAj_yYlyX9UF2MVPvs=",
                name = "Dal Makhani",
                price = 12.00,
                ingredients = listOf("Black lentils", "Kidney beans", "Cream", "Butter", "Spices"),
                spiceLevel = SpiceLevel.MILD
            )
        ),
        "Rice & Bread" to listOf(
            FoodItem(
                id = "219",
                imageUrl = "https://media.istockphoto.com/id/848599312/ro/fotografie/orez-crud-in-lingura-de-lemn-bol-pe-placa-de-lemn-tocata.jpg?s=612x612&w=0&k=20&c=48UbBmIcYvMNFQScw64GBpGtUAHHRd5nG-A1714NKNw=",
                name = "Basmati Rice",
                price = 3.00,
                ingredients = listOf("Basmati rice", "Water"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "220",
                imageUrl = "https://media.istockphoto.com/id/1143530040/ro/fotografie/p%C3%A2ine-indian%C4%83-naan-cu-unt-de-usturoi-pe-mas%C4%83-de-lemn.jpg?s=612x612&w=0&k=20&c=ukE9CNXciXc1h3AYpS7myWZYbQywRRSX4rMSTQwyrm4=",
                name = "Garlic Naan",
                price = 3.00,
                ingredients = listOf("Flour", "Yogurt", "Garlic", "Cilantro"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest10 = Restaurant(
    id = 30,
    name = "The Vegan Spot",
    type = RestaurantType.Restaurant,
    rating = 4.7,
    deliveryCharge = 2.00,
    eta = "25-35 min",
    discountPercentage = 5,
    imageUrl = "https://media.istockphoto.com/id/1369489882/ro/fotografie/varietate-de-alimente-vegane-pe-baz%C4%83-de-proteine-pe-baz%C4%83-de-plante.jpg?s=612x612&w=0&k=20&c=HYAHkT-H5BI3DzWlXZhNHsw0CKDrSenXZBtl1Zs2E3M=",
    menu = mapOf(
        "Main Dishes" to listOf(
            FoodItem(
                id = "221",
                imageUrl = "https://media.istockphoto.com/id/1359499290/ro/fotografie/fotografie-cu-vedere-de-top-a-unui-burger-vegan-de-sfecl%C4%83-%C8%99i-cartofi-pr%C4%83ji%C8%9Bi-dulci-%C8%99i.jpg?s=612x612&w=0&k=20&c=960FaA68gn1Y-WCKOiwm8mdBpMAGOruBmZ1GyAk95GQ=",
                name = "Vegan Burger with Sweet Potato Fries",
                price = 14.00,
                ingredients = listOf("Black bean patty", "Vegan bun", "Lettuce", "Tomato", "Vegan mayo", "Sweet potato fries"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "222",
                imageUrl = "https://media.istockphoto.com/id/1297080347/ro/fotografie/pl%C4%83cint%C4%83-ciobanesc-vegan-cu-linte-%C8%99i-piure-de-cartofi-%C3%AEn-vas-negru-de-sus%C8%9Binere.jpg?s=612x612&w=0&k=20&c=593OvgESAV3anc29O_ipA1hIL0bVNUQhyTYKz_sVxbg=",
                name = "Lentil Shepherd's Pie",
                price = 13.00,
                ingredients = listOf("Lentils", "Carrots", "Peas", "Corn", "Mashed potato topping"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "223",
                imageUrl = "https://media.istockphoto.com/id/926663774/ro/fotografie/pad-thai-legume-vegetariene-udon-t%C4%83i%C8%9Bei-%C3%AEntr-un-fundal-%C3%AEntunecat-vedere-de-top-m%C3%A2ncare.jpg?s=612x612&w=0&k=20&c=KJscAeCb1XYDL4Sz64CoVqQwGSQlnI1ztE2eTcaGOnc=",
                name = "Spicy Peanut Noodles",
                price = 12.00,
                ingredients = listOf("Rice noodles", "Peanut sauce", "Bell peppers", "Carrots", "Broccoli", "Tofu"),
                spiceLevel = SpiceLevel.MEDIUM
            )
        ),
        "Salads & Bowls" to listOf(
            FoodItem(
                id = "224",
                imageUrl = "https://media.istockphoto.com/id/1293479617/ro/fotografie/femeia-mananca-salata-vegana-de-legume-coapte-avocado-tofu-si-bol-de-hrica-vedere-de-top.jpg?s=612x612&w=0&k=20&c=7WS3XDUpMfubR-b8CnyTEcG-abDLb_dfMGtECHCNRJk=",
                name = "Buddha Bowl",
                price = 11.00,
                ingredients = listOf("Quinoa", "Roasted chickpeas", "Avocado", "Cucumber", "Spinach", "Tahini dressing"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "225",
                imageUrl = "https://media.istockphoto.com/id/1408949450/ro/fotografie/viral-green-zeita-salata-cu-pui-la-gratar-si-verde-mixt.jpg?s=612x612&w=0&k=20&c=RrH09IeLWVQ_iyz9ny-7QEo3jxAC4ylHBGYBdR5hnTY=",
                name = "Green Goddess Salad",
                price = 10.00,
                ingredients = listOf("Mixed greens", "Broccoli florets", "Edamame", "Green apple", "Green goddess dressing"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Desserts" to listOf(
            FoodItem(
                id = "226",
                imageUrl = "https://media.istockphoto.com/id/1138234189/ro/fotografie/brownie-vegan-cu-unt-de-arahide-pe-fond-alb.jpg?s=612x612&w=0&k=20&c=2kx0ZC4Vv5Q9OkmCdx_EpKcS7b6N1ff2W2TciNeBunU=",
                name = "Vegan Chocolate Brownie",
                price = 4.00,
                ingredients = listOf("Cocoa powder", "Flour", "Sugar", "Vegan butter", "Chocolate chips"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest11 = Restaurant(
    id = 31,
    name = "Grill Master",
    type = RestaurantType.Restaurant,
    rating = 4.3,
    deliveryCharge = 2.70,
    eta = "30-40 min",
    discountPercentage = 0,
    imageUrl = "https://media.istockphoto.com/id/1402612822/ro/fotografie/prieteni-care-au-o-petrecere-la-gratar.jpg?s=612x612&w=0&k=20&c=O8nfK1QKLEqWIchQehBun8s6L5SEqSKMeLXZHxxYPC8=",
    menu = mapOf(
        "Grilled Meats" to listOf(
            FoodItem(
                id = "227",
                imageUrl = "https://media.istockphoto.com/id/1191425335/ro/fotografie/conceptul-alimentar-american-coaste-de-porc-la-gratar-cu-sos-la-gratar-cu-fum-condimente.jpg?s=612x612&w=0&k=20&c=Nn7BZVfYdWif7kM4IO4N-ZqjDlYvi_L62TPY4jxM7qY=",
                name = "Pork Ribs (full rack)",
                price = 18.00,
                ingredients = listOf("Pork ribs", "BBQ sauce", "Spices"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "228",
                imageUrl = "https://media.istockphoto.com/id/1369184877/ro/fotografie/pulpe-de-pui-la-gratar.jpg?s=612x612&w=0&k=20&c=DNLBHC9Nf7Juv_KoeVN0LagU5S83yrz6KCa1D-GmPbM=",
                name = "Grilled Chicken Thighs (2 pcs)",
                price = 13.00,
                ingredients = listOf("Chicken thighs", "Herbs", "Spices"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "229",
                imageUrl = "https://media.istockphoto.com/id/687749576/ro/fotografie/frigarui-shishkabab-de-carne-de-vit%C4%83-la-gr%C4%83tar.jpg?s=612x612&w=0&k=20&c=kHI3l_HMls3VImsZ5kbYGScQ6d9QiwdTHYrZt2aljGs=",
                name = "Beef Skewers",
                price = 16.00,
                ingredients = listOf("Beef chunks", "Bell peppers", "Onion", "Cherry tomatoes"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Sides" to listOf(
            FoodItem(
                id = "230",
                imageUrl = "https://media.istockphoto.com/id/1490791531/ro/fotografie/femeie-de-g%C4%83tit-legume-pe-gratar-gratar-in-aer-liber-closeup.jpg?s=612x612&w=0&k=20&c=GY9FnZiIaCXDIwWpgXr6j8HmPC-Bpe5rs5XZdygG92A=",
                name = "Grilled Vegetables",
                price = 6.00,
                ingredients = listOf("Zucchini", "Eggplant", "Bell peppers", "Mushrooms", "Olive oil"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "231",
                imageUrl = "https://media.istockphoto.com/id/1411646602/ro/fotografie/gheara-de-varz%C4%83-asiatic%C4%83-cu-sos-de-arahide.jpg?s=612x612&w=0&k=20&c=5-g-n0-8jprweg1HvhGiVVX03asizqXJBpQKubCkghg=",
                name = "Coleslaw Salad",
                price = 4.00,
                ingredients = listOf("Cabbage", "Carrots", "Mayonnaise dressing"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "232",
                imageUrl = "https://media.istockphoto.com/id/1332549357/ro/fotografie/boluri-de-sup%C4%83-de-cartofi-cop%C8%9Bi-%C3%AEnc%C4%83rcat%C4%83-topped-cu-sm%C3%A2nt%C3%A2n%C4%83-br%C3%A2nz%C4%83-cheddar-bacon-%C8%99i.jpg?s=612x612&w=0&k=20&c=n8BUa6VQpR15vbDNNxoFVFD-FK3PUEYctRG4InfbOPY=",
                name = "Baked Potato with Sour Cream",
                price = 5.00,
                ingredients = listOf("Potato", "Sour cream", "Chives"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Sauces" to listOf(
            FoodItem(
                id = "233",
                imageUrl = "https://media.istockphoto.com/id/908245108/ro/fotografie/sos-de-usturoi-izolat-pe-fond-alb.jpg?s=612x612&w=0&k=20&c=A1Foh-yaWH8Xl4KXZukpDkz4AhJR62IVabL5Wiz2F0E=",
                name = "Garlic Sauce",
                price = 2.00,
                ingredients = listOf("Garlic", "Mayonnaise", "Yogurt"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "234",
                imageUrl = "https://media.istockphoto.com/id/538475104/ro/fotografie/sos-de-chili-ro%C8%99u-fierbinte.jpg?s=612x612&w=0&k=20&c=dOdF7iTgCCay1kFaIIkcmHjR69uxnQZCLHv-y61OpTA=",
                name = "Spicy Chili Sauce",
                price = 2.00,
                ingredients = listOf("Chili peppers", "Tomatoes", "Garlic"),
                spiceLevel = SpiceLevel.HOT
            )
        )
    )
)

val mockRestaurantBucharest12 = Restaurant(
    id = 32,
    name = "The Coffee Corner",
    type = RestaurantType.Cafe,
    rating = 4.7,
    deliveryCharge = 1.70,
    eta = "15-25 min",
    discountPercentage = 0,
    imageUrl = "https://media.istockphoto.com/id/1467739359/ro/fotografie/cea%C8%99c%C4%83-de-cafea-cu-fum-%C8%99i-boabe-de-cafea-pe-fundal-vechi-de-lemn.jpg?s=612x612&w=0&k=20&c=nTTPHzA-iLG02H5Gt0oH6wPtfZn6Jw2IXXPrxCungao=",
    menu = mapOf(
        "Coffee Specialties" to listOf(
            FoodItem(
                id = "235",
                imageUrl = "https://media.istockphoto.com/id/1397676276/ro/fotografie/cafea-fierbinte-macchiato.jpg?s=612x612&w=0&k=20&c=Qd2loJGutqnPJC9O-BQwI5i95eer1k1nQrusUmlCqZE=",
                name = "Espresso Macchiato",
                price = 3.00,
                ingredients = listOf("Espresso", "Dash of foamed milk"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "236",
                imageUrl = "https://media.istockphoto.com/id/1935148047/ro/fotografie/ghea%C8%9B%C4%83-caramel-macchiato-cafea-pe-mas%C4%83-de-lemn.jpg?s=612x612&w=0&k=20&c=GsRliE6GYfG5K-0eg8xp0YaiV0j21wRycO73DamLivA=",
                name = "Caramel Macchiato",
                price = 5.80,
                ingredients = listOf("Espresso", "Steamed milk", "Vanilla syrup", "Caramel drizzle"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "237",
                imageUrl = "https://media.istockphoto.com/id/1038768868/ro/fotografie/rece-brew-cafea.jpg?s=612x612&w=0&k=20&c=kr-W4tV-1vqyBNcQicxaPbLJkrfTlI24eeCpMP7qMA0=",
                name = "Cold Brew",
                price = 4.00,
                ingredients = listOf("Slow-steeped coffee concentrate", "Water", "Ice"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Non-Coffee Drinks" to listOf(
            FoodItem(
                id = "238",
                imageUrl = "https://media.istockphoto.com/id/1255226051/ro/fotografie/iced-green-matcha-ceai-amestecat-cu-cub-de-ghea%C8%9B%C4%83-%C8%99i-lapte-%C3%AEn-pahar-latte-pe-alb.jpg?s=612x612&w=0&k=20&c=K72y0iF66owbtg3lIyL1-aeLCsSfdA8TrcGKX25Bd58=",
                name = "Matcha Latte",
                price = 5.00,
                ingredients = listOf("Matcha green tea", "Steamed milk", "Sweetener (optional)"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "239",
                imageUrl = "https://media.istockphoto.com/id/537228258/ro/fotografie/mason-pahare-borcan-de-limonad%C4%83-de-cas%C4%83-pe-lemn-rustic.jpg?s=612x612&w=0&k=20&c=_rsucgduPCXegJ6URms312LaXsIHGyerMbubjEo0EAo=",
                name = "Fresh Lemonade",
                price = 4.00,
                ingredients = listOf("Freshly squeezed lemons", "Water", "Sugar"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Pastries" to listOf(
            FoodItem(
                id = "240",
                imageUrl = "https://media.istockphoto.com/id/1299104835/ro/fotografie/scor%C8%9Bi%C8%99oar%C4%83-rol%C4%83-cu-glazur%C4%83-alb%C4%83.jpg?s=612x612&w=0&k=20&c=qlf4E4AI290-KL3MziUAyyhrG5INsCWOkrNSSz0UqP4=",
                name = "Cinnamon Roll",
                price = 3.20,
                ingredients = listOf("Dough", "Cinnamon", "Brown sugar", "Icing"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "241",
                imageUrl = "https://media.istockphoto.com/id/537698341/ro/fotografie/briose-ciocolata-neagra-de-casa.jpg?s=612x612&w=0&k=20&c=-rRizf2pGbSpz3EdrYWZpxEmJszXDfWiPBkmBytANjs=",
                name = "Chocolate Muffin",
                price = 2.80,
                ingredients = listOf("Flour", "Cocoa powder", "Sugar", "Chocolate chips"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest13 = Restaurant(
    id = 33,
    name = "The Noodle House",
    type = RestaurantType.Restaurant,
    rating = 4.4,
    deliveryCharge = 2.90,
    eta = "30-40 min",
    discountPercentage = 0,
    imageUrl = "https://media.istockphoto.com/id/926663774/ro/fotografie/pad-thai-legume-vegetariene-udon-t%C4%83i%C8%9Bei-%C3%AEntr-un-fundal-%C3%AEntunecat-vedere-de-top-m%C3%A2ncare.jpg?s=612x612&w=0&k=20&c=KJscAeCb1XYDL4Sz64CoVqQwGSQlnI1ztE2eTcaGOnc=",
    menu = mapOf(
        "Ramen Bowls" to listOf(
            FoodItem(
                id = "242",
                imageUrl = "https://media.istockphoto.com/id/1406672650/ro/fotografie/japonez%C4%83-tonkotsu-ramen.jpg?s=612x612&w=0&k=20&c=Z_M40CQAnv57P2Bb5ZR5tFX1WWt8pI_AjWJxcb5Mowo=",
                name = "Tonkotsu Ramen",
                price = 14.00,
                ingredients = listOf("Pork broth", "Noodles", "Chashu pork", "Soft-boiled egg", "Nori", "Scallions"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "243",
                imageUrl = "https://media.istockphoto.com/id/1976621637/ro/fotografie/t%C4%83i%C8%9Bei-pican%C8%9Bi-cu-chili.jpg?s=612x612&w=0&k=20&c=mIFHTlQpvgfSyW8PTrovtDFz65X3jSwb-JTZM7T6EKk=",
                name = "Spicy Miso Ramen",
                price = 14.00,
                ingredients = listOf("Miso broth", "Noodles", "Ground pork", "Corn", "Bamboo shoots", "Chili oil"),
                spiceLevel = SpiceLevel.MEDIUM
            )
        ),
        "Stir-fried Noodles" to listOf(
            FoodItem(
                id = "244",
                imageUrl = "https://media.istockphoto.com/id/1361821718/ro/fotografie/homemade-asiatice-de-pui-pad-thai.jpg?s=612x612&w=0&k=20&c=XdTHGnvW8c7uDWizq7HNPgPV4Ppz0Hi9-Tpm_1lY6S4=",
                name = "Pad Thai with Chicken",
                price = 13.00,
                ingredients = listOf("Rice noodles", "Chicken", "Peanuts", "Bean sprouts", "Lime", "Tamarind sauce"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "245",
                imageUrl = "https://media.istockphoto.com/id/518114816/ro/fotografie/legume-lo-mein.jpg?s=612x612&w=0&k=20&c=1UJkeYoo2OIhLBJeOU5TeZcRbQWmN6-DHkjHaOdpRNI=",
                name = "Vegetable Lo Mein",
                price = 11.00,
                ingredients = listOf("Egg noodles", "Broccoli", "Carrots", "Bell peppers", "Soy sauce"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Appetizers" to listOf(
            FoodItem(
                id = "246",
                imageUrl = "https://media.istockphoto.com/id/1286079738/ro/fotografie/g%C4%83lu%C8%99te-pr%C4%83jite-gyoza-cu-sos-de-soia-%C8%99i-be%C8%9Bi%C8%99oare-vedere-de-sus.jpg?s=612x612&w=0&k=20&c=WynXNml1V_IQPCcsHRgyg69a6iaEDE2OsxhwpYToWuk=",
                name = "Gyoza (Pork Dumplings)",
                price = 7.00,
                ingredients = listOf("Pork", "Cabbage", "Ginger", "Soy sauce dipping"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "247",
                imageUrl = "https://media.istockphoto.com/id/1371154829/ro/fotografie/prajit-de-prim%C4%83var%C4%83-roll-cu-pui-vietnamez%C4%83-alimentare-vedere-de-top.jpg?s=612x612&w=0&k=20&c=Gv7wtS9T6irnjOnTC8XrMkLPh_g7rVyTXwi7KZ1hKpc=",
                name = "Spring Rolls (Vegetable)",
                price = 6.00,
                ingredients = listOf("Cabbage", "Carrots", "Vermicelli", "Sweet chili sauce"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest14 = Restaurant(
    id = 34,
    name = "The Burger Joint",
    type = RestaurantType.FastFood,
    rating = 4.1,
    deliveryCharge = 2.00,
    eta = "20-30 min",
    discountPercentage = 0,
    imageUrl = "https://media.istockphoto.com/id/1412706551/ro/fotografie/burger-pe-o-mas%C4%83-de-lemn-%C3%AEntunecat%C4%83.jpg?s=612x612&w=0&k=20&c=9McSR-b1Agi4SXy43MBCH8uLNbWl8aqwM5z_n8Y1O4c=",
    menu = mapOf(
        "Signature Burgers" to listOf(
            FoodItem(
                id = "248",
                imageUrl = "https://media.istockphoto.com/id/610747100/ro/fotografie/burger-gustos-la-gratar-cu-salata-verde-si-maioneza-masa-rustica-din-lemn.jpg?s=612x612&w=0&k=20&c=DZfY_ZSqZAVoaQ9C0fgQsGpdetUc55opXCA9TehPgRA=",
                name = "The Classic Burger",
                price = 9.00,
                ingredients = listOf("Beef patty", "Lettuce", "Tomato", "Onion", "Pickles", "Signature sauce", "Brioche bun"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "249",
                imageUrl = "https://media.istockphoto.com/id/520215281/ro/fotografie/bacon-burger.jpg?s=612x612&w=0&k=20&c=XY6Oapp2Hd7ye9nbJ-_e2XPeMkgx4VPogyTRkeYIAuQ=",
                name = "Cheesy Bacon Burger",
                price = 11.00,
                ingredients = listOf("Beef patty", "Cheddar cheese", "Crispy bacon", "BBQ sauce", "Brioche bun"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "250",
                imageUrl = "https://media.istockphoto.com/id/539659420/ro/fotografie/ciuperci-swiss-burger.jpg?s=612x612&w=0&k=20&c=BqLPf2BoPoVXowxrJZ-xlZdRAIY1ySZ7np1zaS2HwUM=",
                name = "Mushroom Swiss Burger",
                price = 10.00,
                ingredients = listOf("Beef patty", "Sautéed mushrooms", "Swiss cheese", "Garlic aioli", "Brioche bun"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Chicken Burgers" to listOf(
            FoodItem(
                id = "251",
                imageUrl = "https://media.istockphoto.com/id/521207406/ro/fotografie/%C8%9Bara-de-sud-fried-chicken-sandwich.jpg?s=612x612&w=0&k=20&c=AF-SZSoKu6r4T3EauWme7gZPXrR4Dn4WETfc0ucwdz0=",
                name = "Crispy Chicken Sandwich",
                price = 9.80,
                ingredients = listOf("Crispy chicken fillet", "Lettuce", "Tomato", "Mayo", "Toasted bun"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Sides & Drinks" to listOf(
            FoodItem(
                id = "252",
                imageUrl = "https://media.istockphoto.com/id/1131426299/ro/fotografie/pe%C8%99te-tradi%C8%9Bional-britanic-de-strad%C4%83-%C8%99i-chipsuri-cu-sos-de-tartru-pe-h%C3%A2rtie-de.jpg?s=612x612&w=0&k=20&c=3D0EjX9Xp9WPklRVA_9_NwVyQ7jd2lk9whITfoEepwU=",
                name = "Large Fries",
                price = 4.00,
                ingredients = listOf("Potatoes", "Salt"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "253",
                imageUrl = "https://media.istockphoto.com/id/926990564/ro/fotografie/lapte-de-ciocolat%C4%83-%C8%99i-fri%C8%99c%C4%83.jpg?s=612x612&w=0&k=20&c=ELw8Dfpa9C33ZDC8Cv7PoDbsmmZWyCAGvAQFZMb2VjM=",
                name = "Milkshake (Vanilla)",
                price = 5.00,
                ingredients = listOf("Vanilla ice cream", "Milk", "Vanilla syrup"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest15 = Restaurant(
    id = 35,
    name = "Pasta & Co.",
    type = RestaurantType.Restaurant,
    rating = 4.5,
    deliveryCharge = 2.60,
    eta = "25-35 min",
    discountPercentage = 0,
    imageUrl = "https://media.istockphoto.com/id/1189709277/ro/fotografie/paste-penne-cu-rosii-prajite-sos-branza-mozzarella-fundal-de-piatr%C4%83-gri-vedere-de-sus.jpg?s=612x612&w=0&k=20&c=tSxc67J6G01A3JaOm_8oI_IchPX3lo7G1JnKNqAX87Y=",
    menu = mapOf(
        "Classic Pasta" to listOf(
            FoodItem(
                id = "254",
                imageUrl = "https://media.istockphoto.com/id/1136814342/ro/fotografie/spaghete-delicioase-servite-pe-o-farfurie-neagr%C4%83.jpg?s=612x612&w=0&k=20&c=wjW4OI92KOLzzcajv3dWd-s2nr3L0yW9Y3EPnoM-e-c=",
                name = "Spaghetti Bolognese",
                price = 12.00,
                ingredients = listOf("Spaghetti", "Beef ragu", "Parmesan cheese"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "255",
                imageUrl = "https://media.istockphoto.com/id/1451111530/ro/fotografie/paste-cremoase-alfredo-cu-pui-ciuperci-si-parmezan-m%C3%A2ncare-italian%C4%83-s%C4%83n%C4%83toas%C4%83.jpg?s=612x612&w=0&k=20&c=tovEl9laiOEl73xFXy1UAcR3PcWX1eFtpJhiIV5sIC0=",
                name = "Fettuccine Alfredo",
                price = 11.80,
                ingredients = listOf("Fettuccine", "Cream sauce", "Parmesan cheese", "Butter"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "256",
                imageUrl = "https://media.istockphoto.com/id/1324563622/ro/fotografie/prim-plan-al-unei-tigai-cu-paste-penne-allarrabbiata-fierte-conform-unei-re%C8%9Bete.jpg?s=612x612&w=0&k=20&c=428ZKXrnXStePU8ouUC2UrUZplnBqFPor3kGxq8X7RA=",
                name = "Penne all'Arrabbiata",
                price = 10.00,
                ingredients = listOf("Penne", "Spicy tomato sauce", "Garlic", "Chili"),
                spiceLevel = SpiceLevel.MEDIUM
            )
        ),
        "Specialty Pasta" to listOf(
            FoodItem(
                id = "257",
                imageUrl = "https://media.istockphoto.com/id/1141161156/ro/fotografie/gnocchi-%C3%AEn-sos-de-cas%C4%83-basil-pesto-%C3%AEntr-un-castron.jpg?s=612x612&w=0&k=20&c=6s9hZ6e09z5UKjM-QkEuVuJOH90vJiItcFkdWgyKB4w=",
                name = "Gnocchi with Pesto",
                price = 13.00,
                ingredients = listOf("Potato gnocchi", "Basil pesto", "Cherry tomatoes"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "258",
                imageUrl = "https://media.istockphoto.com/id/1498866287/ro/fotografie/lasagna-al-forno-lasagna-italian%C4%83-de-vit%C4%83-vedere-de-sus.jpg?s=612x612&w=0&k=20&c=ajOkICZbuBzp-s-P7WnIuPyw7vEKHjMcThXk-gV6kKw=",
                name = "Lasagna al Forno",
                price = 14.00,
                ingredients = listOf("Pasta layers", "Beef ragu", "Béchamel sauce", "Mozzarella", "Parmesan"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Salads" to listOf(
            FoodItem(
                id = "259",
                imageUrl = "https://media.istockphoto.com/id/1345888788/ro/fotografie/salata-caprese.jpg?s=612x612&w=0&k=20&c=bNlYOqNWNyhdOHT8EcgniJ7QY23ZBOvO2t7xWMh4P7o=",
                name = "Caprese Salad",
                price = 8.00,
                ingredients = listOf("Fresh mozzarella", "Tomatoes", "Fresh basil", "Balsamic glaze"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest16 = Restaurant(
    id = 36,
    name = "Mexican Fiesta",
    type = RestaurantType.Restaurant,
    rating = 4.3,
    deliveryCharge = 3.10,
    eta = "30-40 min",
    discountPercentage = 0,
    imageUrl = "https://media.istockphoto.com/id/1341928512/ro/fotografie/tacos-mexican-de-cochinita-pibil-buc%C4%83t%C4%83ria-maya%C8%99%C4%83-din-yucatan-mexic.jpg?s=612x612&w=0&k=20&c=YISmtypNf7ZNJH3GDlXl5Zx8IWJmjLx5WdWgbDl5XwI=",
    menu = mapOf(
        "Tacos & Burritos" to listOf(
            FoodItem(
                id = "260",
                imageUrl = "https://media.istockphoto.com/id/960337396/ro/fotografie/picant-de-carne-de-vit%C4%83-de-cas%C4%83-barbacoa-tacos.jpg?s=612x612&w=0&k=20&c=jSsZCJkbdu9q42kxtN1ka71u8hT4FAauRhh6XlonSIE=",
                name = "Beef Tacos (2 pcs)",
                price = 11.00,
                ingredients = listOf("Corn tortillas", "Seasoned ground beef", "Lettuce", "Cheese", "Salsa"),
                spiceLevel = SpiceLevel.MILD
            ),
            FoodItem(
                id = "261",
                imageUrl = "https://media.istockphoto.com/id/1300212146/ro/fotografie/homemade-s%C4%83n%C4%83toase-de-pui-burrito-bowl.jpg?s=612x612&w=0&k=20&c=BfVeltQm9HgZlPURBd9cIeS3FK2yai4NH1n-jHE9dR4=",
                name = "Chicken Burrito",
                price = 12.00,
                ingredients = listOf("Flour tortilla", "Grilled chicken", "Rice", "Beans", "Salsa", "Sour cream"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "262",
                imageUrl = "https://media.istockphoto.com/id/1204163374/ro/fotografie/%C3%AEnf%C4%83%C8%99ura%C8%9Bi-sandwich-ul-cu-legume-la-gr%C4%83tar-%C8%99i-br%C3%A2nz%C4%83-feta-pe-o-farfurie-fundal-gri.jpg?s=612x612&w=0&k=20&c=cP2U6d3il4HhW9gsAe6FgcAdxXPid0upTnMyjRHzLmc=",
                name = "Veggie Fajita Wrap",
                price = 11.00,
                ingredients = listOf("Flour tortilla", "Sautéed bell peppers", "Onions", "Mushrooms", "Guacamole"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Appetizers & Sides" to listOf(
            FoodItem(
                id = "263",
                imageUrl = "https://media.istockphoto.com/id/1264183429/ro/fotografie/plac%C4%83-de-nachos-cu-guacamole-%C8%99i-salsa.jpg?s=612x612&w=0&k=20&c=7eVX8DKPlh2X-9V6QMzdDPK5Ql7B-TOo-gGwjVrgPZo=",
                name = "Nachos with Guacamole",
                price = 9.00,
                ingredients = listOf("Tortilla chips", "Melted cheese", "Salsa", "Jalapeños", "Guacamole"),
                spiceLevel = SpiceLevel.MILD
            ),
            FoodItem(
                id = "264",
                imageUrl = "https://media.istockphoto.com/id/2154912399/ro/fotografie/churros-cu-sos-de-ciocolat%C4%83-cald%C4%83-zah%C4%83r-%C8%99i-scor%C8%9Bi%C8%99oar%C4%83.jpg?s=612x612&w=0&k=20&c=J9s3kzEMqQEyhYoyEv1yrRk2KsZXBT1cqfhgqTVe1wc=",
                name = "Churros with Chocolate Sauce",
                price = 6.00,
                ingredients = listOf("Fried dough pastry", "Cinnamon sugar", "Chocolate dipping sauce"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Drinks" to listOf(
            FoodItem(
                id = "265",
                imageUrl = "https://media.istockphoto.com/id/1414348785/ro/fotografie/b%C4%83utur%C4%83-rece-pe-baz%C4%83-de-orez-horchata-%C3%AEntr-un-pahar-pe-o-plac%C4%83-de-lemn-cu-bastoane-de.jpg?s=612x612&w=0&k=20&c=neNbDRA99vklZ_ewXrKhUd7gcpo94BFd7TwlvnHhkKU=",
                name = "Horchata",
                price = 4.00,
                ingredients = listOf("Rice milk", "Cinnamon", "Vanilla"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest17 = Restaurant(
    id = 37,
    name = "The Healthy Bowl",
    type = RestaurantType.Cafe,
    rating = 4.6,
    deliveryCharge = 1.90,
    eta = "20-30 min",
    discountPercentage = 0,
    imageUrl = "https://media.istockphoto.com/id/1468860049/ro/fotografie/femeie-de-fitness-mananca-un-castron-poke-s%C4%83n%C4%83tos-%C3%AEn-buc%C4%83t%C4%83rie-la-domiciliu.jpg?s=612x612&w=0&k=20&c=idD-VaMPtiGAFyKp4TLyL99Fs-02eoDdb0EbRHCEapc=",
    menu = mapOf(
        "Grain Bowls" to listOf(
            FoodItem(
                id = "266",
                imageUrl = "https://media.istockphoto.com/id/1485226090/ro/fotografie/salata-quinoa-tabbouleh-cu-rosii-rosii-cherry-boia-de-ardei-portocalii-avocado.jpg?s=612x612&w=0&k=20&c=Xv_FdtL8Uu8IYvQDRYwt9mRPedNPt_HdZ4Id8L1lXQ4=",
                name = "Mediterranean Grain Bowl",
                price = 12.00,
                ingredients = listOf("Farro", "Grilled chicken", "Cherry tomatoes", "Cucumber", "Kalamata olives", "Hummus", "Lemon-tahini dressing"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "267",
                imageUrl = "https://media.istockphoto.com/id/1305943018/ro/fotografie/se-amestec%C4%83-tofu-marinat-pr%C4%83jit.jpg?s=612x612&w=0&k=20&c=Ioird_nYDL9luqyNfYFfSvLlh4SezS5-xKviZXPiAqE=",
                name = "Asian Tofu Bowl",
                price = 11.00,
                ingredients = listOf("Brown rice", "Marinated tofu", "Steamed broccoli", "Carrots", "Edamame", "Peanut dressing"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Acai Bowls" to listOf(
            FoodItem(
                id = "268",
                imageUrl = "https://media.istockphoto.com/id/1268633484/ro/fotografie/clasic-acai-bowl.jpg?s=612x612&w=0&k=20&c=ZeFEc5cKAcmRDLZxrHA5yLld7FZxTvgthrjL62j8kNY=",
                name = "Classic Acai Bowl",
                price = 9.00,
                ingredients = listOf("Acai puree", "Granola", "Banana", "Strawberries", "Blueberries", "Honey"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "269",
                imageUrl = "https://media.istockphoto.com/id/612232770/ro/fotografie/matcha-ceai-verde-mic-dejun-superfoods-bol-piureuri-cu-seminte-de-chia.jpg?s=612x612&w=0&k=20&c=qAQd-q8kx-LtJQWziwUZZf4fBNMXlhHkPiDtfm8PiPs=",
                name = "Green Acai Bowl",
                price = 9.00,
                ingredients = listOf("Acai puree", "Spinach", "Banana", "Almond milk", "Coconut flakes", "Chia seeds"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Smoothies" to listOf(
            FoodItem(
                id = "270",
                imageUrl = "https://media.istockphoto.com/id/1371342715/ro/fotografie/smoothie-verde-s%C4%83n%C4%83tos-bea-cu-avocado-ananas-nuc%C4%83-de-cocos-%C8%99i-spanac.jpg?s=612x612&w=0&k=20&c=3b2xh2OmKUK-GzfrqOGqa0KLU0YBGi2PRvLRv73nQpI=",
                name = "Tropical Green Smoothie",
                price = 6.00,
                ingredients = listOf("Spinach", "Pineapple", "Mango", "Coconut water"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "271",
                imageUrl = "https://media.istockphoto.com/id/2152470209/ro/fotografie/pahar-de-smoothie-gustos-fructe-de-padure-proaspete-banda-de-masurare-si-gantere-pe-masa.jpg?s=612x612&w=0&k=20&c=keH0WixAcyjK75QvCgpci859hX31IXmQg64VTerrGs0=",
                name = "Protein Power Smoothie",
                price = 6.00,
                ingredients = listOf("Banana", "Peanut butter", "Almond milk", "Protein powder"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest18 = Restaurant(
    id = 38,
    name = "Authentic Greek Souvlaki",
    type = RestaurantType.FastFood,
    rating = 4.4,
    deliveryCharge = 2.30,
    eta = "20-30 min",
    discountPercentage = 0,
    imageUrl = "https://media.istockphoto.com/id/1285922642/ro/fotografie/concept-de-m%C3%A2ncare-greceasc%C4%83-cu-o-salat%C4%83-de-fermieri-%C3%AEn-fa%C8%9Ba-m%C4%83rii-egee.jpg?s=612x612&w=0&k=20&c=jSyW3j7PaiOl5hTGUQnmIGNqH-gGa7ZjQh51KyHp794=",
    menu = mapOf(
        "Souvlaki & Gyros" to listOf(
            FoodItem(
                id = "272",
                imageUrl = "https://media.istockphoto.com/id/959937952/ro/fotografie/gyros-grecesc-%C3%AEnf%C4%83%C8%99urat-%C3%AEntr-o-p%C3%A2ine-pita-pe-un-fundal-de-lemn.jpg?s=612x612&w=0&k=20&c=oWfUsDwnZmjGNpEhZ4Xf4pWObHNHr8PkJg-XKmN_0mU=",
                name = "Pork Souvlaki Pita",
                price = 8.00,
                ingredients = listOf("Pork skewer", "Pita bread", "Tomatoes", "Onion", "Tzatziki sauce", "Fries"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "273",
                imageUrl = "https://media.istockphoto.com/id/1319819715/ro/fotografie/dou%C4%83-gyros-cu-legume-%C8%99i-sos-de-usturoi-alb-pe-o-mas%C4%83-rustic%C4%83-din-lemn.jpg?s=612x612&w=0&k=20&c=LHM4dskS4O5v-wSUjNByTmWzgMqOiuZSY4RogCWwtEE=",
                name = "Chicken Gyros Plate",
                price = 13.00,
                ingredients = listOf("Chicken gyros meat", "Pita bread", "Fries", "Tomatoes", "Onion", "Tzatziki sauce"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "274",
                imageUrl = "https://media.istockphoto.com/id/2046203906/ro/fotografie/homemade-seitan-wrapped-in-pita-bread-with-vegies.jpg?s=612x612&w=0&k=20&c=GMGE21Z_bWYiepno2ix6szlAbUeXEFXOnuT-_UYCKe8=",
                name = "Vegetarian Souvlaki",
                price = 7.00,
                ingredients = listOf("Halloumi cheese", "Bell peppers", "Zucchini", "Pita bread", "Tzatziki"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Sides" to listOf(
            FoodItem(
                id = "275",
                imageUrl = "https://media.istockphoto.com/id/180698997/ro/fotografie/carne-de-vit%C4%83-souvlaki-wrap.jpg?s=612x612&w=0&k=20&c=5UENWQjH5-91TRJOWlSD9wJou8SYcXMH2ypW3BVe5JA=",
                name = "Greek Fries with Feta",
                price = 5.00,
                ingredients = listOf("Fries", "Feta cheese", "Oregano"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "276",
                imageUrl = "https://media.istockphoto.com/id/1056787708/ro/fotografie/sos-de-iaurt-cu-ierburi-condimente-%C8%99i-castravete-prim-plan-pe-mas%C4%83-raita-vedere.jpg?s=612x612&w=0&k=20&c=qNislYi_mR4Q_xWMOmcwAzHCZP8d3FGnKrkP1JNh6Qs=",
                name = "Tzatziki Dip",
                price = 3.00,
                ingredients = listOf("Greek yogurt", "Cucumber", "Garlic", "Dill"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest19 = Restaurant(
    id = 39,
    name = "The Bakery Corner",
    type = RestaurantType.Bakery,
    rating = 4.8,
    deliveryCharge = 1.60,
    eta = "15-25 min",
    discountPercentage = 0,
    imageUrl = "https://media.istockphoto.com/id/496564915/ro/fotografie/p%C3%A2ine-%C8%99i-chifle.jpg?s=612x612&w=0&k=20&c=NpD2WqXezZTCO6qZYdyldOrardWv_G0lqCyZXqzOaKY=",
    menu = mapOf(
        "Freshly Baked Bread" to listOf(
            FoodItem(
                id = "277",
                imageUrl = "https://media.istockphoto.com/id/947886300/ro/fotografie/p%C3%A2ine-%C3%AEnc%C4%83-via%C8%9B%C4%83.jpg?s=612x612&w=0&k=20&c=jCOSgoY-sr8y9wutsSw1inEO65p_v8eAFQkbZg858Pk=",
                name = "Sourdough Loaf",
                price = 4.00,
                ingredients = listOf("Sourdough starter", "Flour", "Water", "Salt"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "278",
                imageUrl = "https://media.istockphoto.com/id/1125389587/ro/fotografie/p%C3%A2ine-delicioas%C4%83-de-secar%C4%83-cu-maia-de-cas%C4%83-pe-o-farfurie-%C8%99i-lapte-coacere-de-cas%C4%83.jpg?s=612x612&w=0&k=20&c=54T-fZfPC7eawU27gSb8DoYSUhn3vK06GLMvZpGFVss=",
                name = "Rye Bread",
                price = 4.00,
                ingredients = listOf("Rye flour", "Wheat flour", "Water", "Yeast", "Salt"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Sweet Pastries" to listOf(
            FoodItem(
                id = "279",
                imageUrl = "https://media.istockphoto.com/id/601382248/ro/fotografie/%C8%99trudel-de-mere.jpg?s=612x612&w=0&k=20&c=qQEyVL1G2CGB-DHM4J0YXfXyB-Q02k8Q7Z398c1abfI=",
                name = "Apple Strudel",
                price = 5.00,
                ingredients = listOf("Puff pastry", "Apples", "Cinnamon", "Sugar", "Raisins"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "280",
                imageUrl = "https://media.istockphoto.com/id/1269391551/ro/fotografie/yummy-proasp%C4%83t-croissant-migdale-felii-cu-umplutur%C4%83-de-ciocolat%C4%83-t%C4%83iat%C4%83-aproape.jpg?s=612x612&w=0&k=20&c=708oz6G_H73LnbT9G51lwlzOC6jA9gU2p6xAbuD7veI=",
                name = "Chocolate Croissant",
                price = 3.80,
                ingredients = listOf("Puff pastry", "Chocolate"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Savory Pastries" to listOf(
            FoodItem(
                id = "281",
                imageUrl = "https://media.istockphoto.com/id/1397224254/ro/fotografie/pl%C4%83cint%C4%83-tradi%C8%9Bional%C4%83-de-patiserie-cu-br%C3%A2nz%C4%83-feta-phyllo.jpg?s=612x612&w=0&k=20&c=b1dYRqaPjEwF0VZLDu1L98vgTt2p_KZDTBPwYvXQY7Q=",
                name = "Spinach & Feta Borek",
                price = 4.20,
                ingredients = listOf("Phyllo dough", "Spinach", "Feta cheese", "Eggs"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "282",
                imageUrl = "https://media.istockphoto.com/id/1348716530/ro/fotografie/mini-%C8%99unc%C4%83-%C8%99i-quiches-br%C3%A2nz%C4%83.jpg?s=612x612&w=0&k=20&c=MhRT75COYmuRnvaVf5WTm1viy0xC3QKMefVmxgOQY7w=",
                name = "Cheese & Ham Quiche",
                price = 6.00,
                ingredients = listOf("Pie crust", "Eggs", "Cheese", "Ham", "Cream"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest20 = Restaurant(
    id = 40,
    name = "Asian Fusion Wok",
    type = RestaurantType.Restaurant,
    rating = 4.5,
    deliveryCharge = 3.00,
    eta = "25-35 min",
    discountPercentage = 10,
    imageUrl = "https://media.istockphoto.com/id/588595864/ro/fotografie/aburind-legume-mixte-%C3%AEn-wok-g%C4%83tit-stil-asiatic.jpg?s=612x612&w=0&k=20&c=pV59AVHvKsM1Gg16UeCIZIEynkAbcss_bUT10afCQc4=",
    menu = mapOf(
        "Wok Your Own" to listOf(
            FoodItem(
                id = "283",
                imageUrl = "https://media.istockphoto.com/id/491237104/ro/fotografie/se-amestec%C4%83-pui-pr%C4%83jit-ardei-dulci-%C8%99i-fasole-verde.jpg?s=612x612&w=0&k=20&c=Og3X21qzGTiaPJdUZMC0D4nSn-rBwYyMpyrsRBwR8v4=",
                name = "Custom Wok (Base + Protein + Veggies + Sauce)",
                price = 13.00,
                ingredients = listOf("Choose your noodles or rice", "Chicken, Beef, Tofu or Shrimp", "Assorted vegetables", "Variety of sauces"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Signature Wok Dishes" to listOf(
            FoodItem(
                id = "284",
                imageUrl = "https://media.istockphoto.com/id/1811101755/ro/fotografie/se-amestec%C4%83-puiul-cu-ananas-boia-ro%C8%99ie-arpagic-sos-de-soia-%C8%99i-semin%C8%9Be-de-susan-m%C3%A2ncare.jpg?s=612x612&w=0&k=20&c=nOC8fZazNO9ez9RKg-e-wzn73Co3mHSzvo9_WhdfdXo=",
                name = "Sweet & Sour Chicken Wok",
                price = 12.00,
                ingredients = listOf("Chicken", "Pineapple", "Bell peppers", "Onion", "Sweet & sour sauce", "Jasmine rice"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "285",
                imageUrl = "https://media.istockphoto.com/id/641850444/ro/fotografie/se-amestec%C4%83-carnea-de-vit%C4%83-pr%C4%83jit%C4%83-cu-legume-%C3%AEn-castron.jpg?s=612x612&w=0&k=20&c=9Uuuo5JL1AKYQaodwef-g9420mMvkxjr94dGMxPw16I=",
                name = "Spicy Beef & Broccoli Wok",
                price = 14.00,
                ingredients = listOf("Beef slices", "Broccoli", "Chili flakes", "Garlic-ginger sauce", "Udon noodles"),
                spiceLevel = SpiceLevel.HOT
            )
        ),
        "Appetizers" to listOf(
            FoodItem(
                id = "286",
                imageUrl = "https://media.istockphoto.com/id/1313085999/ro/fotografie/rulouri-de-prim%C4%83var%C4%83-de-legume-pr%C4%83jite-cu-chili-dulce-%C8%99i-sos-de-soia-pe-tabl%C4%83-de-lemn.jpg?s=612x612&w=0&k=20&c=5gGyiIk5BOb3pOzWkn5-J1traSVIGjo9Osi62Y4UcKY=",
                name = "Vegetable Spring Rolls (4 pcs)",
                price = 6.00,
                ingredients = listOf("Cabbage", "Carrots", "Vermicelli", "Sweet chili sauce"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "287",
                imageUrl = "https://media.istockphoto.com/id/1371154791/ro/fotografie/chips-uri-de-creve%C8%9Bi-vietnamez-pe-mas%C4%83-de-beton-%C3%AEntuneric-vedere-de-sus.jpg?s=612x612&w=0&k=20&c=LdkvSTB1-Az4nfkfQyBgQacuZZX-3laSba_IOIyp1q0=",
                name = "Prawn Crackers",
                price = 3.00,
                ingredients = listOf("Tapioca flour", "Prawns", "Water"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

val mockRestaurantBucharest21 = Restaurant(
    id = 41,
    name = "The Local Deli",
    type = RestaurantType.Grocery,
    rating = 4.0,
    deliveryCharge = 4.00,
    eta = "45-60 min",
    discountPercentage = 0,
    imageUrl = "https://media.istockphoto.com/id/1438530555/ro/fotografie/charcuterie-goal%C4%83-concepte-de-afaceri-mici.jpg?s=612x612&w=0&k=20&c=lcej_BZlo5O3Dpuk9u8Xn08VEy5olVSLONVqEbl__NM=",
    menu = mapOf(
        "Fresh Produce" to listOf(
            FoodItem(
                id = "288",
                imageUrl = "https://media.istockphoto.com/id/184276818/ro/fotografie/m%C4%83r-ro%C8%99u.jpg?s=612x612&w=0&k=20&c=sC6-EcF7txwhRtyuzfjhIxg9vCy4b5cg28px3IhweoQ=",
                name = "Organic Apples (1 kg)",
                price = 3.00,
                ingredients = listOf("Apples"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "289",
                imageUrl = "https://media.istockphoto.com/id/172925573/ro/fotografie/ro%C8%99ii-ro%C8%99ii-%C3%AEnc%C4%83-pe-vi%C8%9B%C4%83-de-vie.jpg?s=612x612&w=0&k=20&c=qCl_ZzImMNalLvgGP8Mb9cvgS8MXMCKuLl7B2FJ6rOQ=",
                name = "Cherry Tomatoes (250g pack)",
                price = 2.80,
                ingredients = listOf("Cherry tomatoes"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Dairy & Eggs" to listOf(
            FoodItem(
                id = "290",
                imageUrl = "https://media.istockphoto.com/id/1356240873/ro/fotografie/closeup-macro-de-p%C4%83%C8%99une-a-crescut-ferma-proasp%C4%83t%C4%83-duzin%C4%83-de-ou%C4%83-brune-magazin-cump%C4%83rat.jpg?s=612x612&w=0&k=20&c=FZiTdtuj0bunbkKvKo3al5exp1lXhYhqVz5lII_EUpc=",
                name = "Farm Fresh Eggs (10 pcs)",
                price = 3.00,
                ingredients = listOf("Eggs"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "291",
                imageUrl = "https://media.istockphoto.com/id/1394044503/ro/fotografie/sortiment-de-lapte-vegan-organic-non-lactate-din-nuci-nuci-de-pin-fulgi-de-ov%C4%83z-orez.jpg?s=612x612&w=0&k=20&c=pgA9XWCdpsLBPwtPWnHImH84mcRG6c0dzlFj1Emf_4M=",
                name = "Local Cow's Milk (1 liter)",
                price = 1.80,
                ingredients = listOf("Cow's milk"),
                spiceLevel = SpiceLevel.NONE
            )
        ),
        "Bakery Goods" to listOf(
            FoodItem(
                id = "292",
                imageUrl = "https://media.istockphoto.com/id/1330509379/ro/fotografie/patru-p%C3%A2ini-de-p%C3%A2ine-cu-maia-%C3%AEntr-o-tav%C4%83-de-copt-f%C4%83cut%C4%83-manual-doar-coapt%C4%83.jpg?s=612x612&w=0&k=20&c=frPABfVq8q1PvIdvwJxernGtkktpGmZ6l5kics_13l0=",
                name = "Artisan Bread Loaf",
                price = 4.00,
                ingredients = listOf("Flour", "Water", "Yeast", "Salt"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "293",
                imageUrl = "https://media.istockphoto.com/id/1345857656/ro/fotografie/sortiment-de-pl%C4%83cinte-de-toamn%C4%83-de-cas%C4%83-scen%C4%83-de-mas%C4%83-pe-lemn-%C3%AEntunecat.jpg?s=612x612&w=0&k=20&c=WthzWXp_44bdEBz6PU5D46AV3_l39IRlAdTjzLfg2K0=",
                name = "Assorted Pastry Box (4 pcs)",
                price = 7.00,
                ingredients = listOf("Selection of daily pastries"),
                spiceLevel = SpiceLevel.NONE
            )
        )
    )
)

private val restaurantList = listOf(mockRestaurant1, mockRestaurant2, mockRestaurant3)

val clujRestaurantList = listOf(
    mockRestaurant1,
    mockRestaurant2,
    mockRestaurant3,
    mockRestaurant4,
    mockRestaurant5,
    mockRestaurant6,
    mockRestaurant7,
    mockRestaurant8,
    mockRestaurant9,
    mockRestaurant10,
    mockRestaurant11,
    mockRestaurant12,
    mockRestaurant13,
    mockRestaurant14,
    mockRestaurant15,
    mockRestaurant16,
    mockRestaurant17,
    mockRestaurant18,
    mockRestaurant19,
    mockRestaurant20,
    mockRestaurant21
)

val bucharestRestaurantList = listOf(
    mockRestaurantBucharest1,
    mockRestaurantBucharest2,
    mockRestaurantBucharest3,
    mockRestaurantBucharest4,
    mockRestaurantBucharest5,
    mockRestaurantBucharest6,
    mockRestaurantBucharest7,
    mockRestaurantBucharest8,
    mockRestaurantBucharest9,
    mockRestaurantBucharest10,
    mockRestaurantBucharest11,
    mockRestaurantBucharest12,
    mockRestaurantBucharest13,
    mockRestaurantBucharest14,
    mockRestaurantBucharest15,
    mockRestaurantBucharest16,
    mockRestaurantBucharest17,
    mockRestaurantBucharest18,
    mockRestaurantBucharest19,
    mockRestaurantBucharest20,
    mockRestaurantBucharest21
)

val restaurantLocationList = mapOf<AvailableLocation, List<Restaurant>>(
    AvailableLocation.CLUJ to clujRestaurantList,
    AvailableLocation.BRASOV to emptyList(),
    AvailableLocation.SIBIU to restaurantList.subList(0,1),
    AvailableLocation.TIMISOARA to restaurantList,
    AvailableLocation.ORADEA to restaurantList,
    AvailableLocation.BUCURESTI to bucharestRestaurantList
)

