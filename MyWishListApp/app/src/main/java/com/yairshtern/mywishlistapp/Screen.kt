package com.yairshtern.mywishlistapp

sealed class Screen(val rute: String) {
    object HomeScreen : Screen("home_screen")
    object AddScreen : Screen("add_screen")
}