package com.yairshtern.musicappui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.yairshtern.musicappui.ui.AccountView
import com.yairshtern.musicappui.ui.Browse
import com.yairshtern.musicappui.ui.Home
import com.yairshtern.musicappui.ui.Library
import com.yairshtern.musicappui.ui.SubscriptionView

@Composable
fun Navigation(navController: NavController, viewModel: MainViewModel, pd: PaddingValues) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = Screen.DrawerScreen.Account.route,
        modifier = Modifier.padding(pd)
    ) {
        composable(Screen.BottomScreen.Home.bRoute) {
            Home()
        }
        composable(Screen.BottomScreen.Browse.bRoute) {
            Browse()
        }
        composable(Screen.BottomScreen.Library.bRoute) {
            Library()
        }
        composable(Screen.DrawerScreen.Account.route) {
            AccountView()
        }
        composable(Screen.DrawerScreen.Subscription.route) {
            SubscriptionView()
        }
    }
}
