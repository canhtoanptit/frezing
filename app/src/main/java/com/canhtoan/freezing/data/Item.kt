package com.canhtoan.freezing.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "items")
data class Item(
//    val addDate: Calendar = Calendar.getInstance(),
    val name: String,
    val imageUrl: String = ""
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var itemId: Long = 0
}