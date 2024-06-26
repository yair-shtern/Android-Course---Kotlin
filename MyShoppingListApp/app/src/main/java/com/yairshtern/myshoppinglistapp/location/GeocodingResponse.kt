package com.yairshtern.myshoppinglistapp.location

data class GeocodingResponse(
    val results: List<GeocodingResult>,
    val status: String
)
