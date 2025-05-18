package com.ecohive.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.ecohive.app.data.Order
import com.ecohive.app.data.OrderItem
import com.ecohive.app.data.toItemPrice

const val SERVICE_FEE: Double = 4.0

@Composable
private fun OrderItemElement(
    orderItem: OrderItem,
    onChange: (OrderItem) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
    ) {
        //image
        AsyncImage(
            model = orderItem.foodItem.imageUrl,
            contentDescription = "Food Item Image",
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize(0.2f)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.FillBounds,

            )

        //food item title and price
        Column(modifier = Modifier.align(Alignment.CenterVertically)) {
            Text(
                text = orderItem.foodItem.name,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface
            )
            Text(
                text = orderItem.totalPrice.toItemPrice(),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        Spacer(modifier = Modifier.weight(1f))
        //quantity
        Row(
            modifier = Modifier.padding(all = 12.dp).border(
                2.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(8.dp)
            )
                .align(Alignment.CenterVertically)
        ) {
            IconButton(
                onClick = {
                    // Decrease quantity
                    onChange(
                        orderItem.copy(
                            quantity = orderItem.quantity - 1
                        )
                    )
                },
                enabled = orderItem.quantity > 0
            ) {
                Icon(
                    imageVector = Icons.Default.Remove,
                    contentDescription = "Decrease Quantity",
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
            Text(
                text = orderItem.quantity.toString(),
                style = MaterialTheme.typography.displayMedium,
                color = MaterialTheme.colorScheme.onSurface
            )
            IconButton(
                onClick = {
                    // increase quantity
                    onChange(
                        orderItem.copy(
                            quantity = orderItem.quantity + 1
                        )
                    )
                },
                enabled = orderItem.quantity > 0,
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add Quantity",
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }

        }
    }
}

@Composable
private fun CartDivider(modifier: Modifier = Modifier) {
    HorizontalDivider(
        modifier = modifier
            .fillMaxWidth(),
        thickness = 1.dp
    )
}


@Composable
private fun OrderSection(
    orderItems: List<OrderItem>,
    onOrderItemChange: (OrderItem) -> Unit,
    onItemClick: (OrderItem) -> Unit,
    restaurantName: String,
    onAddMoreClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(shape = RoundedCornerShape(12.dp), modifier = modifier) {
        Row(modifier = Modifier.fillMaxWidth().padding(vertical = 12.dp)) {
            //back button
            IconButton(
                onClick = {},
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }

            Text(
                text = restaurantName,
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }

        //order items
        Column(modifier = Modifier.padding(start = 12.dp)) {
            orderItems.forEach { item ->
                OrderItemElement(
                    orderItem = item,
                    onChange = {
                        onOrderItemChange(it)
                    },
                    modifier = Modifier.clickable {
                        onItemClick(item)
                    }
                )
                CartDivider(modifier = Modifier.padding(vertical = 8.dp))
            }
        }

        Text(
            text = "+ Add more...",
            modifier = Modifier
                .padding(20.dp)
                .clickable {
                    onAddMoreClick()
                }
        )

        CartDivider(modifier = Modifier.padding(20.dp))

        Text(
            text = "Need cutlery or anything else?\nLeave a comment...",
            style = MaterialTheme.typography.labelMedium,
            modifier = Modifier.padding(all = 12.dp)
        )
    }
}

@Composable
private fun DeliverySection(
    eta: String,
    deliveryCharge: Double,
    selectDelivery: (Boolean) -> Unit,
    deliverySelected: Boolean,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Text(
            text = "Delivery or pickup?",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(horizontal = 12.dp).padding(top = 8.dp),
        )

        Row(
            modifier = Modifier.padding(horizontal = 16.dp).clickable {
                if (!deliverySelected) {
                    selectDelivery(true)
                }
            }
        ) {
            Column {
                Text(
                    text = "Delivery",
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = eta,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = deliveryCharge.toItemPrice(),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            RadioButton(
                selected = deliverySelected,
                onClick = {
                    if (!deliverySelected) {
                        selectDelivery(true)
                    }
                },
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }

        CartDivider(modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp))

        Row(modifier = Modifier.padding(horizontal = 16.dp).padding(bottom = 4.dp).clickable {
            if (deliverySelected) {
                selectDelivery(false)
            }
        }) {
            Column {
                Text(
                    text = "Pickup",
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "20 - 30 min",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "0 RON",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            RadioButton(
                selected = !deliverySelected,
                onClick = {
                    if (deliverySelected) {
                        selectDelivery(false)
                    }
                },
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
    }
}

@Composable
private fun CostExplainerSection(
    subtotal: Double,
    discount: Double,
    deliveryCharge: Double,
    serviceFee: Double,
    totalSum: Double,
    placeOrder: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(modifier) {
        Row {
            Text(
                text = "Subtotal",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(12.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = subtotal.toItemPrice(),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(12.dp)
            )
        }
        Row {
            Text(
                text = "Discount",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(12.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = discount.toItemPrice(),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(12.dp)
            )
        }
        Row {
            Text(
                text = "Service fee",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(12.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = serviceFee.toItemPrice(),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(12.dp)
            )
        }
        Row {
            Text(
                text = "Delivery fee",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(12.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = deliveryCharge.toItemPrice(),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(12.dp)
            )
        }
        CartDivider()
        Row {
            Text(
                text = "Total",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(12.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = totalSum.toItemPrice(),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(12.dp)
            )
        }

        Button(
            onClick = placeOrder,
            modifier = Modifier.align(Alignment.CenterHorizontally).fillMaxWidth().height(75.dp),
            shape = RectangleShape
        ) {
            Text(
                text = "Place order"
            )
        }
    }
}

@Composable
private fun DeliveryLocationSection(
    location: String,
    onChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Text(
            text = "Delivery location",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(horizontal = 12.dp).padding(top = 8.dp),
        )
        TextField(
            value = location,
            onValueChange = onChange,
            placeholder = {
                Text(
                    text = "Address",
                    style = MaterialTheme.typography.bodyMedium
                )
            },
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
                .wrapContentHeight()
        )
    }
}


@Composable
fun ShoppingCartScreen(
    currentOrder: Order,
    onItemClick: (OrderItem) -> Unit,
    onPlaceOrder: (Order) -> Unit,
    modifier: Modifier = Modifier
) {
    var currentOrderShown by remember { mutableStateOf(currentOrder) }
    var deliverySelection by remember { mutableStateOf(true) }
    var deliveryLocation by remember { mutableStateOf("") }
    LazyColumn(modifier.background(color = MaterialTheme.colorScheme.surface).padding(8.dp)) {
        //first card -> order items
        item {
            OrderSection(
                orderItems = currentOrderShown.items,
                onItemClick = onItemClick,
                restaurantName = currentOrderShown.restaurant.name,
                onOrderItemChange = { orderItem ->
                    currentOrderShown = currentOrderShown.copy(
                        items = if (orderItem.quantity == 0) currentOrderShown.items.filter { it.orderID != orderItem.orderID }
                        else currentOrderShown.items.map { if (it.orderID == orderItem.orderID) orderItem else it }
                    )
                },
                onAddMoreClick = {},
                modifier = Modifier
                    .background(color = MaterialTheme.colorScheme.background)
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
        }

        //second card -> delivery or pickup
        item {
            DeliverySection(
                eta = currentOrder.restaurant.eta,
                deliveryCharge = currentOrder.restaurant.deliveryCharge,
                selectDelivery = { deliveryType ->
                    deliverySelection = deliveryType
                },
                deliverySelected = deliverySelection,
                modifier = Modifier
                    .background(color = MaterialTheme.colorScheme.background)
                    .padding(top = 16.dp)
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
        }

        //third card -> delivery location
        item {
            DeliveryLocationSection(
                location = deliveryLocation,
                onChange = { deliveryLocation = it },
                modifier = Modifier
                    .background(color = MaterialTheme.colorScheme.background)
                    .padding(top = 16.dp)
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
        }

        //fourth card -> cost explainer
        item {
            var totalSum by remember {
                mutableStateOf(0.0)
            }
            LaunchedEffect(currentOrderShown, deliverySelection) {
                totalSum =
                    SERVICE_FEE + currentOrderShown.calculateTotalPrice() + if (deliverySelection) currentOrderShown.restaurant.deliveryCharge else 0.0
            }
            CostExplainerSection(
                subtotal = currentOrderShown.calculateSubTotal(),
                discount = currentOrderShown.calculateTotalDiscount(),
                deliveryCharge = if (deliverySelection)
                    currentOrderShown.restaurant.deliveryCharge else 0.0,
                serviceFee = 4.0,
                totalSum = totalSum,
                placeOrder = { onPlaceOrder(currentOrderShown) },
                modifier = Modifier
                    .background(color = MaterialTheme.colorScheme.background)
                    .padding(top = 16.dp)
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
        }
    }
}