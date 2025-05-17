package com.ecohive.app.ui.pages

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ecohive.app.data.Restaurant


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantListPage(
    restaurants: List<Restaurant>,
    onRestaurantClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    var searchQuery by remember { mutableStateOf("") }

    val filteredRestaurants = if (searchQuery.isNotEmpty()) restaurants.filter {
        it.name.contains(searchQuery, ignoreCase = true)
    } else restaurants

    Column(modifier) {
        //search bar
        SearchBar(
            query = searchQuery,
            onQueryChange = { searchQuery = it },
            onSearch = { /* No-op, filtering is live */ },
            active = false,
            onActiveChange = { /* No-op, always not expanded */ },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Search") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null
                )
            },
            trailingIcon = {
                if (searchQuery.isNotEmpty()) {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = null,
                        modifier = Modifier.clickable { searchQuery = "" }
                    )
                }
            },
            colors = SearchBarDefaults.colors(
                containerColor = MaterialTheme.colorScheme.surfaceContainerLow,
            ),
            content = {}
        )
        //restaurant list
        LazyColumn {
            items(filteredRestaurants) { item ->
                SmallRestaurantCard(
                    restaurant = item,
                    onRestaurantClick = onRestaurantClick,
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp).fillMaxWidth()
                )
            }

        }
    }
}

@Composable
private fun SmallRestaurantCard(
    restaurant: Restaurant,
    onRestaurantClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = {
            onRestaurantClick(restaurant.id)
        },
        modifier = modifier
    ) {
        Column(modifier = Modifier.padding(6.dp).fillMaxWidth()) {
            Text(
                text = restaurant.name,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = restaurant.eta,
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier.align(Alignment.End)
            )
        }
    }
}