package com.canhtoan.freezing.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ItemDao {

    @Query("SELECT * FROM items")
    fun getItems(): LiveData<List<Item>>

    @Insert
    suspend fun createItem(item: Item): Long

    @Delete
    suspend fun deleteItem(item: Item)
}