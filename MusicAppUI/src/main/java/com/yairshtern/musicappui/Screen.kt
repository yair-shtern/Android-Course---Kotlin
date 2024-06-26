package com.yairshtern.musicappui

import androidx.annotation.DrawableRes

sealed class Screen(val title: String, val route: String) {

    sealed class BottomScreen(
        val btitle:String,val bRoute:String,@DrawableRes val icon:Int
    ):Screen(btitle,bRoute){
        object Home : BottomScreen(
            "Home",
            "home",
            R.drawable.baseline_home_24
        )

        object Library  : BottomScreen(
            "Library",
            "library",
            R.drawable.baseline_video_library_24
        )

        object Browse : BottomScreen(
            "Browse",
            "browse",
            R.drawable.baseline_apps_24
        )
    }

    sealed class DrawerScreen(val dTitle: String, val dRoute: String, @DrawableRes val icon: Int) :
        Screen(dTitle, dRoute) {
        object Account : DrawerScreen(
            "Account",
            "account",
            R.drawable.ic_account
        )

        object Subscription : DrawerScreen(
            "Subscription",
            "subscribe",
            R.drawable.ic_subscribe
        )

        object AddAccount : DrawerScreen(
            "AddAccount",
            "add_account",
            R.drawable.ic_baseline_person_add_alt_1_24
        )





    }
}

val screensInBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Browse,
    Screen.BottomScreen.Library
)

val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)