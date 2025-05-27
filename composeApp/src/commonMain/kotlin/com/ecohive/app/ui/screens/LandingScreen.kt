package com.ecohive.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.DropdownMenu
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingBasket
import androidx.compose.material.icons.outlined.FilterList
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.ecohive.app.data.AvailableLocation
import com.ecohive.app.data.Filter
import com.ecohive.app.data.FoodItem
import com.ecohive.app.data.Restaurant
import com.ecohive.app.data.RestaurantType
import com.ecohive.app.data.availableLocations
import com.ecohive.app.data.toItemPrice
import ecohive.composeapp.generated.resources.Res
import ecohive.composeapp.generated.resources._collectCommonMainFont0Resources
import ecohive.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource


@Composable
fun EcoHiveTopBar(
    locationSelected: AvailableLocation,
    onClickLocation: (AvailableLocation) -> Unit,
    onCartClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    var expandedLocationDropdown by remember { mutableStateOf(false) }
    TopAppBar(
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Location Dropdown
                Column {
                    Text(
                        "Location",
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onTertiary.copy(alpha = 0.5f)
                    )
                    Row(
                        modifier = Modifier.clickable {
                            expandedLocationDropdown = true
                        },
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = locationSelected.locality,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onTertiary.copy(0.7f)
                        )
                        Icon(
                            Icons.Default.KeyboardArrowDown,
                            contentDescription = "Dropdown Arrow",
                            tint = MaterialTheme.colorScheme.background
                        )
                    }
                }

                DropdownMenu(
                    expanded = expandedLocationDropdown,
                    onDismissRequest = { expandedLocationDropdown = false },
                ) {
                    availableLocations.forEach { location ->
                        DropdownMenuItem(
                            text = {
                                Text(
                                    text = location.locality,
                                    style = MaterialTheme.typography.bodyMedium
                                )
                            },
                            onClick = {
                                expandedLocationDropdown = false
                                onClickLocation(location)
                            }
                        )
                    }
                }

                Spacer(modifier = Modifier.weight(1f))

                // Cart Icon
                IconButton(
                    onClick = onCartClicked,
                    colors = IconButtonDefaults.iconButtonColors()
                        .copy(contentColor = MaterialTheme.colorScheme.background)
                ) {
                    Icon(Icons.Default.ShoppingBasket, contentDescription = "Cart")
                }
            }
        },
        modifier = modifier,
        backgroundColor = MaterialTheme.colorScheme.tertiary,
        contentColor = MaterialTheme.colorScheme.background
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EcoHiveSearchBar(
    restaurantList: List<Restaurant>,
    goToRestaurantPage: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    var query by remember { mutableStateOf<String?>(null) }
    val filteredRestaurants = if (!query.isNullOrBlank()) restaurantList.filter {
        it.name.contains(query!!, ignoreCase = true)
    } else emptyList()
    Row(
        modifier = modifier.background(MaterialTheme.colorScheme.tertiary).fillMaxWidth()
            .padding(10.dp)
    ) {
        SearchBar(
            inputField = {
                LocalTextStyle.provides(MaterialTheme.typography.bodySmall)
                SearchBarDefaults.InputField(
                    onSearch = { expanded = true },
                    expanded = false,
                    onExpandedChange = { },
                    placeholder = { Text("Search...") },
                    leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                    trailingIcon = {
                        if (expanded) {
                            IconButton(onClick = {
                                expanded = false
                            }) {
                                Icon(Icons.Default.Close, contentDescription = null)
                            }
                        }
                    },
                    query = query ?: "",
                    onQueryChange = {
                        query = it
                    }
                )
            },
            modifier = Modifier.fillMaxWidth(0.8f).padding(end = 10.dp),
            expanded = false,
            onExpandedChange = {},
            content = {}
        )
        DropdownMenu(
            expanded = expanded && filteredRestaurants.isNotEmpty(),
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .fillMaxWidth(0.75f)
                .heightIn(max = 300.dp)
                .background(MaterialTheme.colorScheme.background)
        ) {
            filteredRestaurants.forEach { restaurant ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = restaurant.name,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    },
                    onClick = {
                        expanded = false
                        goToRestaurantPage(restaurant.id)
                    },
                    modifier = Modifier.background(
                        MaterialTheme.colorScheme.background,
                        shape = RoundedCornerShape(32.dp)
                    )
                )
            }
        }


        Spacer(modifier = Modifier.weight(1f))
        IconButton(
            onClick = {},
            modifier = Modifier.padding(end = 8.dp)
                .height(50.dp).width(50.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(MaterialTheme.colorScheme.onSecondaryContainer)
                .align(Alignment.CenterVertically)
        ) {
            Icon(
                Icons.Outlined.FilterList,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onTertiary
            )
        }
    }

}

@Composable
fun PromoBanner(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxWidth().padding(8.dp).clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.onSecondaryContainer).padding(16.dp)
    ) {
        Text(
            text = "Save Food.\nSave Money.\nSave the Planet.",
            color = MaterialTheme.colorScheme.onTertiary,
            style = MaterialTheme.typography.titleMedium
        )
    }
}

@Composable
fun CategoryChips(
    filters: List<Filter>,
    onFilterSelected: (Filter) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedFilter by remember { mutableStateOf(filters.first()) }

    LazyRow(modifier = modifier.fillMaxWidth().padding(vertical = 8.dp)) {
        items(filters) { filter ->
            FilterChip(
                selected = selectedFilter == filter,
                onClick = {
                    selectedFilter = filter
                    onFilterSelected(filter)
                },
                label = {
                    Text(
                        text = filter.title,
                        style = MaterialTheme.typography.labelMedium,
                        color = if (selectedFilter == filter) MaterialTheme.colorScheme.onTertiary else Color.Black
                    )
                },
                modifier = Modifier.padding(horizontal = 4.dp),
                colors = FilterChipDefaults.filterChipColors().copy(
                    selectedContainerColor = MaterialTheme.colorScheme.onSecondaryContainer,
                    selectedLabelColor = MaterialTheme.colorScheme.onTertiary,
                ),
                shape = RoundedCornerShape(20.dp)
            )

        }
    }
}

@Composable
fun FoodItemElement(foodItem: FoodItem, discountPercentage: Double, modifier: Modifier = Modifier) {
    Card(modifier.padding(horizontal = 8.dp, vertical = 12.dp).width(150.dp).height(180.dp)) {
        Box(Modifier.padding(12.dp)) {
            AsyncImage(
                model = foodItem.imageUrl,
                contentDescription = null,
                modifier = Modifier.clip(RoundedCornerShape(10.dp)).align(Alignment.TopCenter)
                    .height(80.dp).fillMaxWidth(),
                error = painterResource(Res.drawable.compose_multiplatform),
                contentScale = ContentScale.Crop
            )
        }
        // Food Name
        Column(modifier = Modifier.padding(start = 4.dp)) {

            Text(
                text = foodItem.name,
                style = MaterialTheme.typography.titleMedium,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

            // Food Price
            Row {
                Text(
                    text = foodItem.price.toItemPrice(),
                    style = MaterialTheme.typography.bodyLarge,
                    textDecoration = TextDecoration.LineThrough,
                    color = MaterialTheme.colorScheme.error
                )
                Text(
                    text = (foodItem.price * (1 - discountPercentage)).toItemPrice(),
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 4.dp)
                )
            }

        }
    }
}

@Composable
fun RestaurantItem(
    restaurant: Restaurant,
    goToRestaurantPage: (Int) -> Unit,
    goToFoodItemDetailsPage: (Int, Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val foodItemList = restaurant.menu.values.flatten().take(5)
    Column(modifier) {
        Row {
            Text(
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface,
                text = restaurant.name,
                modifier = Modifier.padding(start = 16.dp).align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.weight(1f))
            TextButton(
                onClick = {
                    goToRestaurantPage(restaurant.id)
                },
                modifier = Modifier.padding(end = 8.dp).align(Alignment.CenterVertically),
                colors = ButtonDefaults.textButtonColors().copy(
                    containerColor = Color.Transparent,
                    contentColor = Color(0xffe9b357)
                )
            ) {
                Text(
                    text = "See more",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.W600
                )
            }
        }
        LazyRow {
            items(foodItemList) { foodItem ->
                FoodItemElement(
                    foodItem = foodItem,
                    discountPercentage = restaurant.discountPercentage,
                    modifier = Modifier.clickable {
                        goToFoodItemDetailsPage(
                            restaurant.id,
                            foodItem.id
                        )
                    }
                )
            }
        }
    }
}


@Composable
fun LandingScreen(
    restaurantList: List<Restaurant>,
    locationSelected: AvailableLocation,
    onLocationSelected: (AvailableLocation) -> Unit,
    goToRestaurantPage: (Int) -> Unit,
    onCartClicked: () -> Unit,
    goToFoodItemDetailsPage: (Int, Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            EcoHiveTopBar(
                locationSelected = locationSelected,
                onClickLocation = onLocationSelected,
                onCartClicked = onCartClicked,
                modifier = Modifier.fillMaxWidth()
            )
        },
        modifier = modifier
    ) { paddingValues ->
        val filters = Filter.entries.toList()
        var selectedFilter by remember { mutableStateOf(filters.first()) }
        val filteredRestaurants by remember(selectedFilter, restaurantList) {
            mutableStateOf(
                restaurantList.filter { restaurant ->
                    when (selectedFilter) {
                        Filter.ALL_DEALS -> true
                        Filter.GROCERIES -> restaurant.type == RestaurantType.Grocery
                        Filter.RESTAURANTS -> restaurant.type == RestaurantType.Restaurant
                        Filter.BAKERIES -> restaurant.type == RestaurantType.Bakery
                        Filter.CAFES -> restaurant.type == RestaurantType.Cafe
                        Filter.FAST_FOOD -> restaurant.type == RestaurantType.FastFood
                    }
                }
            )
        }
        LazyColumn(modifier = Modifier.padding(paddingValues)) {
            item {
                EcoHiveSearchBar(restaurantList, goToRestaurantPage)
            }
            item {
                PromoBanner()
            }
            item {
                CategoryChips(
                    filters = filters,
                    onFilterSelected = { filter ->
                        // Handle filter selection
                        selectedFilter = filter
                    },
                )
            }
            //restaurant list
            items(filteredRestaurants) {
                RestaurantItem(it, goToRestaurantPage, goToFoodItemDetailsPage)
            }
        }

    }
}