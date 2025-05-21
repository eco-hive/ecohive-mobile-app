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

val mockRestaurant4 = Restaurant(
    id = 4,
    name = "Burger Bonanza",
    type = RestaurantType.FastFood,
    rating = 4.2,
    deliveryCharge = 1.99,
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
                price = 8.99,
                ingredients = listOf("Beef Patty", "Cheddar Cheese", "Ketchup", "Mustard", "Pickles"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "20",
                imageUrl = "https://images.unsplash.com/photo-1627662168223-7df99068099a?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                name = "Chicken Nuggets & Fries",
                price = 7.49,
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
                price = 9.99,
                ingredients = listOf("Spicy Chicken Patty", "Lettuce", "Tomato", "Mayonnaise"),
                spiceLevel = SpiceLevel.HOT
            ),
            FoodItem(
                id = "22",
                imageUrl = "https://images.unsplash.com/photo-1520072959219-c595dc870360?q=80&w=1890&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                name = "Veggie Burger",
                price = 8.49,
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
                price = 3.49,
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
                price = 2.50,
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
    deliveryCharge = 1.50,
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
                price = 4.50,
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
                price = 3.99,
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
                price = 2.50,
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
                price = 7.99,
                ingredients = listOf("Turkey Breast", "Cheddar Cheese", "Lettuce", "Tomato", "Bread"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "34",
                imageUrl = "https://images.unsplash.com/photo-1509722747041-616f39b57569?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8Y2FwcmVzZSUyMHNhbmR3aWNofGVufDB8MHwwfHx8Mg%3D%3D",
                name = "Caprese Sandwich",
                price = 8.49,
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
    deliveryCharge = 3.50,
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
                price = 3.99,
                ingredients = listOf("Red Apples"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "36",
                imageUrl = "https://images.unsplash.com/photo-1581443517340-f04dfe0ef235?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fGJhbmFuYXN8ZW58MHwwfDB8fHwy",
                name = "Bananas (1kg)",
                price = 2.49,
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
                price = 3.50,
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
                price = 1.50,
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
                price = 6.50,
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
                price = 14.99,
                ingredients = listOf("Chicken", "Cream", "Cashew Nuts", "Mild Spices"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "46",
                imageUrl = "https://www.currytastic.com/wp-content/uploads/2022/10/Lamb-Vindaloo.jpg",
                name = "Lamb Vindaloo",
                price = 16.50,
                ingredients = listOf("Lamb", "Potatoes", "Vinegar", "Hot Spices"),
                spiceLevel = SpiceLevel.HOT
            ),
            FoodItem(
                id = "47",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6GMD_WH9sl6HjJ4CObB9Lim-51zBji9n5KA&s",
                name = "Paneer Butter Masala",
                price = 13.99,
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
                price = 4.50,
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
    deliveryCharge = 3.99,
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
                price = 7.50,
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
                price = 15.50,
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
                price = 17.50,
                ingredients = listOf("Chicken Thigh", "Teriyaki Sauce", "Sesame Seeds", "Steamed Rice"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "58",
                imageUrl = "https://vjcooks.com/wp-content/uploads/2024/08/VJ_Cooks_Beef__Broccoli_Stir_Fry-1-735x735.jpg",
                name = "Beef & Broccoli Stir-fry",
                price = 16.99,
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
                price = 3.99,
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
                price = 9.50,
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
                price = 5.99,
                ingredients = listOf("Avocado", "Tomato", "Onion", "Cilantro", "Lime", "Tortilla Chips"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "67",
                imageUrl = "https://www.thecandidappetite.com/wp-content/uploads/2016/11/0S9A10028-2024x1349.jpg",
                name = "Churros with Chocolate Sauce",
                price = 4.50,
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
                price = 3.50,
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
                price = 4.50,
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
                price = 8.99,
                ingredients = listOf("Chicken Breast"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "73",
                imageUrl = "https://www.tkranch.com/images/products/large_22_large_xlgb_22.jpg",
                name = "Lean Ground Beef (500g)",
                price = 7.50,
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
                price = 5.50,
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
                price = 7.50,
                ingredients = listOf("Toasted Bread", "Avocado", "Chili Flakes", "Lemon Juice"),
                spiceLevel = SpiceLevel.MILD
            ),
            FoodItem(
                id = "83",
                imageUrl = "https://images.unsplash.com/photo-1614663422784-07203a605793?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8YmVycnklMjBwYW5jYWtlc3xlbnwwfDB8MHx8fDI%3D",
                name = "Pancakes with Berries",
                price = 8.99,
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
                price = 6.50,
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
                price = 6.99,
                ingredients = listOf("Sourdough Starter", "Flour", "Water", "Salt"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "87",
                imageUrl = "https://www.kingarthurbaking.com/sites/default/files/recipe_legacy/8-3-large.jpg",
                name = "Classic French Baguette",
                price = 3.50,
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
                price = 5.50,
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
                price = 7.50,
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
    deliveryCharge = 3.50,
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
                price = 8.50,
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
                price = 14.99,
                ingredients = listOf("Marinated Chicken", "Pita Bread", "Tzatziki", "Fries", "Tomato", "Onion"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "97",
                imageUrl = "https://www.mygreekdish.com/wp-content/uploads/2013/05/Moussaka-recipe-Traditional-Greek-Moussaka-with-Eggplants.jpg",
                name = "Moussaka",
                price = 16.50,
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
                price = 10.50,
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
                price = 8.50,
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
                price = 2.50,
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
                price = 7.50,
                ingredients = listOf("Rich Chocolate Cake", "Fudge Frosting", "Chocolate Shavings"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "110",
                imageUrl = "https://www.withlovekitty.com/wp-content/uploads/2023/10/Vanilla-Bean-Cupcakes-1-22-500x500.jpg",
                name = "Vanilla Bean Cupcake",
                price = 3.99,
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
                price = 3.50,
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
                price = 5.99,
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
                price = 7.50,
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
                price = 4.99,
                ingredients = listOf("Sweet Dough", "Cinnamon Sugar Filling", "Cream Cheese Icing"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "119",
                imageUrl = "https://www.allrecipes.com/thmb/NT8O6xd2sadl55A6EkrJs88bz9U=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/ar-13564-pecan-pie-bars-i-ddmfs-2x1-94dda257670045088b0cbacf7f6a3fc3.jpg",
                name = "Pecan Pie Bar",
                price = 4.50,
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
                price = 10.50,
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
                price = 19.50,
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
                price = 17.50,
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
                price = 5.50,
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
                price = 4.50,
                ingredients = listOf("French Fries", "Melted Cheddar Cheese Sauce"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "133",
                imageUrl = "https://www.recipeworkbook.com/wp-content/uploads/2021/09/onion-rings3-1024x683.jpg",
                name = "Crispy Onion Rings",
                price = 3.99,
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
                price = 2.99,
                ingredients = listOf("Lemon Juice", "Sugar", "Water"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "137",
                imageUrl = "https://lordinu.ro/wp-content/uploads/2016/10/Aqua-carpatica-plata-0.5-jpg.webp",
                name = "Bottled Water",
                price = 1.50,
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
                price = 4.99,
                ingredients = listOf("Heirloom Tomatoes"),
                spiceLevel = SpiceLevel.NONE
            ),
            FoodItem(
                id = "139",
                imageUrl = "https://images.unsplash.com/photo-1634731201932-9bd92839bea2?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                name = "Farm Fresh Spinach (250g)",
                price = 3.50,
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
                price = 9.50,
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
                price = 6.50,
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
                price = 4.50,
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
                price = 3.50,
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
                price = 4.50,
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
                price = 2.50,
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
                price = 8.50,
                ingredients = listOf("Tortilla", "Hummus", "Cucumber", "Carrots", "Bell Peppers", "Lettuce"),
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

//todo add more test data so that it looks better

val restaurantLocationList = mapOf<AvailableLocation, List<Restaurant>>(
    AvailableLocation.CLUJ to clujRestaurantList,
    AvailableLocation.BRASOV to emptyList(),
    AvailableLocation.SIBIU to restaurantList.subList(0,1),
    AvailableLocation.TIMISOARA to restaurantList,
    AvailableLocation.ORADEA to restaurantList,
    AvailableLocation.BUCURESTI to restaurantList
)

