package com.example.myapplication

import android.app.Application
import com.example.myapplication.ui.favourite.model.ItemService

class App : Application() {
    val itemsService = ItemService()
}