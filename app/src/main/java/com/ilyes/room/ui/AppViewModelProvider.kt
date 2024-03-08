

package com.ilyes.room.ui


import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.ilyes.room.InventoryApplication
import com.ilyes.room.ui.home.HomeViewModel
import com.ilyes.room.ui.item.ItemDetailsViewModel
import com.ilyes.room.ui.item.ItemEditViewModel
import com.ilyes.room.ui.item.ItemEntryViewModel


object AppViewModelProvider {
    val Factory = viewModelFactory {

        initializer {
            ItemEditViewModel(
                this.createSavedStateHandle(),
                inventoryApplication().container.itemsRepository
            )
        }

        initializer {
            ItemEntryViewModel(inventoryApplication().container.itemsRepository)
        }


        initializer {
            ItemDetailsViewModel(
                this.createSavedStateHandle(),
                inventoryApplication().container.itemsRepository
            )
        }


        initializer {
            HomeViewModel(inventoryApplication().container.itemsRepository)
        }
    }
}

fun CreationExtras.inventoryApplication(): InventoryApplication =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as InventoryApplication)
