package com.yairshtern.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = "An android Watch 2"),
        Wish(title = "Google Watch 3", description = "An android Watch 3"),
        Wish(title = "Google Watch 4", description = "An android Watch 4"),
        Wish(title = "Google Watch 5", description = "An android Watch 5"),
        Wish(title = "Google Watch 6", description = "An android Watch 6")
    )
}
