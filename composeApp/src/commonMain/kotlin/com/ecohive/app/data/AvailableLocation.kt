package com.ecohive.app.data

enum class AvailableLocation(val locality: String) {
    CLUJ("Cluj-Napoca, Cluj"),
    BRASOV("Brasov, Brasov"),
    SIBIU("Sibiu, Sibiu"),
    TIMISOARA("Timisoara, Timis"),
    ORADEA("Oradea, Bihor"),
    BUCURESTI("Bucuresti, Bucuresti")
}

val availableLocations = AvailableLocation.entries.toList()