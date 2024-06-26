package com.yairshtern.myshoppinglistapp.location

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class LocationViewModel : ViewModel() {
    private val _location = mutableStateOf<LocationDate?>(null)
    val location: State<LocationDate?> = _location

    private val _address = mutableStateOf(listOf<GeocodingResult>())
    val address: State<List<GeocodingResult>> = _address

    fun updateLocation(newLocation: LocationDate) {
        _location.value = newLocation
    }

    fun fetchAddress(latlng: String) {
        try {
            viewModelScope.launch {
                val result = RetrofitClient.create().getAddressFromCoordinates(
                    latlng, "AIzaSyAhFLZG1-DKiiZCs4XkeXzNunMg0q5SMtA"
                )
                _address.value = result.results
            }
        } catch (e: Exception) {
            Log.d("res1", "${e.cause} ${e.message}")
        }
    }
}