package com.ecohive.app.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.ecohive.app.data.Restaurant
import ecohive.composeapp.generated.resources.Res
import ecohive.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource


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

    Column(modifier.fillMaxSize()) {
        //search bar
        SearchBar(
            inputField = {
                SearchBarDefaults.InputField(
                    query = searchQuery,
                    onQueryChange = { searchQuery = it },
                    onSearch = { /* No-op, filtering is live */ },
                    expanded = false,
                    onExpandedChange = { },
                    enabled = true,
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
                    colors = SearchBarDefaults.inputFieldColors().copy(
                        focusedIndicatorColor = MaterialTheme.colorScheme.onTertiary,
                        unfocusedIndicatorColor = MaterialTheme.colorScheme.onTertiary,
                        focusedPlaceholderColor = MaterialTheme.colorScheme.onTertiary,
                        unfocusedPlaceholderColor = MaterialTheme.colorScheme.onTertiary,
                        cursorColor = MaterialTheme.colorScheme.onTertiary,
                        focusedTextColor = MaterialTheme.colorScheme.onTertiary,
                        unfocusedTextColor = MaterialTheme.colorScheme.onTertiary,
                        focusedLeadingIconColor = MaterialTheme.colorScheme.onTertiary,
                        unfocusedLeadingIconColor = MaterialTheme.colorScheme.onTertiary,
                        focusedTrailingIconColor = MaterialTheme.colorScheme.onTertiary,
                        unfocusedTrailingIconColor = MaterialTheme.colorScheme.onTertiary
                    ),
                    interactionSource = null,
                )
            },
            expanded = false,
            onExpandedChange = { },
            modifier = Modifier.fillMaxWidth().background(color = MaterialTheme.colorScheme.tertiary, shape = RectangleShape),
            shape = RectangleShape,
            colors = SearchBarDefaults.colors(
                containerColor = MaterialTheme.colorScheme.tertiary,
                dividerColor = MaterialTheme.colorScheme.onTertiary
            ),
            content = {},
        )
        //restaurant list
        LazyColumn {
            items(filteredRestaurants) { item ->
                SmallRestaurantCardSearch(
                    restaurant = item,
                    onRestaurantClick = onRestaurantClick,
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp).fillMaxWidth()
                )
            }

        }
    }
}

@Composable
private fun SmallRestaurantCardSearch(
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
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(8.dp)
            )
            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = null,
                modifier = Modifier.fillMaxWidth().height(200.dp),
                contentScale = ContentScale.FillWidth,
                error = painterResource(Res.drawable.compose_multiplatform),
                placeholder = painterResource(Res.drawable.compose_multiplatform),
            )
            Text(
                text = restaurant.eta,
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier.align(Alignment.End).padding(8.dp)
            )
        }
    }
}