package com.watchlist.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Movie(
    @PrimaryKey val id: Long,
    val title: String,
    val overview: String,
    val rating: Float,
    val posterLink: String,
    var isFavorite: Boolean,
)