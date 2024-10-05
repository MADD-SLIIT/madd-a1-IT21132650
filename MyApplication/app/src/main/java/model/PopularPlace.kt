package com.tbapp.model

data class PopularPlace(
    val imageResId: Int,
    val title: String,
    val location: String,
    val rating: Double,
    val pricePerPerson: String,
    val isFavorite: Boolean
)
