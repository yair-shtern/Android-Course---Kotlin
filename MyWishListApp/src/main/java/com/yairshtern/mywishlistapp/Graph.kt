package com.yairshtern.mywishlistapp

import android.content.Context
import androidx.room.Room
import com.yairshtern.mywishlistapp.data.WishDatabase
import com.yairshtern.mywishlistapp.data.WishRepository

object Graph {
    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context) {
        database = Room.databaseBuilder(context, WishDatabase::class.java, "wishlist.db").build()
    }
}