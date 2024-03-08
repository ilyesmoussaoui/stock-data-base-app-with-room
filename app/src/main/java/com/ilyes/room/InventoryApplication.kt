
package com.ilyes.room

import android.app.Application
import com.ilyes.room.data.AppContainer
import com.ilyes.room.data.AppDataContainer


class InventoryApplication : Application() {


    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
