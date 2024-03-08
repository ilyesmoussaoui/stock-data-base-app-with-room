package com.ilyes.room

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.ilyes.room.data.InventoryDatabase
import com.ilyes.room.data.ItemDao
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class ItemDaoTest {
    private lateinit var itemDao: ItemDao
    private lateinit var inventoryDatabase: InventoryDatabase
}