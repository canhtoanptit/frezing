package com.canhtoan.freezing.data

class FriezeItemRepository(private val itemDao: ItemDao) {

    suspend fun createItem(item: Item): Long {
        return itemDao.createItem(item)
    }

    suspend fun deleteItem(item: Item) {
        itemDao.deleteItem(item)
    }
}