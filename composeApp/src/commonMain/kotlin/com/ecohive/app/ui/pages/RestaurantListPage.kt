package com.ecohive.app.ui.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.ecohive.app.data.Restaurant



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantListPage(restaurants: List<Restaurant>, modifier: Modifier = Modifier) {
    var searchQuery by remember { mutableStateOf("") }

    var activeSearchbar by remember { mutableStateOf(false) }

    val filteredRestaurants = if (searchQuery.isNotEmpty() && activeSearchbar) restaurants.filter {
        it.name.contains(searchQuery)
    } else restaurants

    Box(modifier) {
        //search bar
        SearchBar(
            query = searchQuery,
            onQueryChange = { searchQuery = it },
            onSearch = { activeSearchbar = false },
            active = activeSearchbar,
            onActiveChange = { activeSearchbar = it },

            modifier = Modifier
                .fillMaxWidth(),

            placeholder = { Text("Search") },

            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurface,
                )
            },
            trailingIcon = {
                if (activeSearchbar)
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = null
                    )
            },
            colors = SearchBarDefaults.colors(
                containerColor = MaterialTheme.colorScheme.surfaceContainerLow,
            ),
        ) {
            filteredRestaurants.forEach { item ->

            }
        }
    }
}