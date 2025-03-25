package com.ecohive.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.DropdownMenu
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingBasket
import androidx.compose.material.icons.outlined.FilterList
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ecohive.app.data.AvailableLocation
import com.ecohive.app.data.availableLocations


@Composable
fun EcoHiveTopBar(
    onClickLocation: (AvailableLocation) -> Unit,
    onCartClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    var expandedLocationDropdown by remember { mutableStateOf(false) }
    var selectedLocation by remember { mutableStateOf(availableLocations.first()) }
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
                            text = selectedLocation.locality,
                            style = MaterialTheme.typography.bodyMedium
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
                                ) },
                            onClick = {
                                onClickLocation(location)
                                selectedLocation = location
                                expandedLocationDropdown = false
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
fun EcoHiveSearchBar(modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    var query by remember { mutableStateOf<String?>(null) }
    Row(
        modifier = modifier.background(MaterialTheme.colorScheme.tertiary).fillMaxWidth()
            .padding(10.dp)
    ) {
        SearchBar(
            inputField = {
                SearchBarDefaults.InputField(
                    onSearch = { },
                    expanded = false,
                    onExpandedChange = { },
                    placeholder = { Text("Search...") },
                    leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                    trailingIcon = {
                        if (expanded) {
                            IconButton(onClick = {
//                                expanded = false
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
            modifier = Modifier.fillMaxWidth(0.8f).padding(end = 10.dp).height(50.dp),
            expanded = false,
            onExpandedChange = {
                expanded = it
            },
            content = {}
        )
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
            "Save Food.\nSave Money.\nSave the Planet.",
            color = MaterialTheme.colorScheme.onTertiary,
            style = MaterialTheme.typography.titleMedium
        )
    }
}

@Composable
fun CategoryChips(modifier: Modifier = Modifier) {
    val filters = listOf("All Deals", "Groceries", "Restaurants", "Bakeries", "Cafes")
    var selectedFilter by remember { mutableStateOf(filters.first()) }

    LazyRow(modifier = modifier.fillMaxWidth().padding(vertical = 8.dp)) {
        items(filters) { filter ->
            FilterChip(
                selected = selectedFilter == filter,
                onClick = { selectedFilter = filter },
                label = {
                    Text(
                        text = filter,
                        style = MaterialTheme.typography.labelSmall,
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
fun LandingScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            EcoHiveTopBar(
                onClickLocation = { _ -> },
                onCartClicked = {},
                modifier = Modifier.fillMaxWidth()
            )
        },
        modifier = modifier
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            EcoHiveSearchBar()
            PromoBanner()
            CategoryChips()
        }

    }
}