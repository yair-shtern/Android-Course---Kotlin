package com.yairshtern.myrecipeapp

import androidx.navigation.compose.rememberNavController

sealed class Screen(val route: String) {
    object RecipeScreen : Screen("recipescreen")
    object DetailScreen : Screen("detailscreen")
}