package com.ecohive.app.ui.navigation

import androidx.lifecycle.ViewModel
import com.ecohive.app.data.AvailableLocation
import com.ecohive.app.data.FoodItem
import com.ecohive.app.data.Order
import com.ecohive.app.data.OrderItem
import com.ecohive.app.data.Restaurant
import com.ecohive.app.data.User
import com.ecohive.app.data.mockUserItem
import com.ecohive.app.data.restaurantLocationList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

class AppViewModel : ViewModel() {
    private val _selectedLocation: MutableStateFlow<AvailableLocation> =
        MutableStateFlow(AvailableLocation.CLUJ)
    val selectedLocation: StateFlow<AvailableLocation> = _selectedLocation.asStateFlow()

    fun selectNewLocation(newLocation: AvailableLocation) {
        _selectedLocation.update { newLocation }
    }

    val restaurantList: List<Restaurant> =
        restaurantLocationList[_selectedLocation.value] ?: emptyList()

    private val _allOrders: MutableStateFlow<List<Order>> = MutableStateFlow(emptyList())
    val allOrders: StateFlow<List<Order>> = _allOrders.asStateFlow()

    private val _currentOrder: MutableStateFlow<Order?> = MutableStateFlow(null)
    val currentOrder = _currentOrder.asStateFlow()

    private val _currentUser: MutableStateFlow<User> = MutableStateFlow(mockUserItem)
    val currentUser: StateFlow<User> = _currentUser.asStateFlow()

    fun addFoodItemToCart(restaurantID: Int, foodItem: FoodItem, newQuantity: Int) {
        _currentOrder.update {
            if (it == null) {
                val now = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault())
                val orderID = (_allOrders.value.maxOfOrNull { it.orderID } ?: 1) + 1
                val restaurant =
                    restaurantList.find { it.id == restaurantID } ?: restaurantList.first()
                Order(
                    orderID = orderID,
                    restaurant = restaurant,
                    date = now.date.toString(),
                    time = now.time.toString(),
                    items = listOf(
                        OrderItem(
                            orderID = orderID,
                            foodItem = foodItem,
                            quantity = newQuantity,
                            restaurant = restaurant,
                        )
                    ),
                )
            } else {
                //check if item already exists and add the new quantity only
                val orderItem = it.items.find { orderItem -> orderItem.foodItem.id == foodItem.id }
                val currentListWOOrderItem =
                    if (orderItem != null) it.items.filter { co -> co.foodItem.id != orderItem.foodItem.id } else it.items
                val newOrderItem = orderItem?.copy(
                    quantity = newQuantity
                ) ?: OrderItem(
                    orderID = it.orderID,
                    foodItem = foodItem,
                    quantity = newQuantity,
                    restaurant = it.restaurant
                )
                it.copy(
                    items = currentListWOOrderItem + newOrderItem
                )
            }
        }
    }

    fun placeOrder() {
        if (currentOrder.value!=null){
            _allOrders.update {
                it + currentOrder.value!!
            }
            _currentOrder.update { null }
        }
    }
}