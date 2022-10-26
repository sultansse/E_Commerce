package com.example.myapplication.ui.favourite.model

import com.github.javafaker.Faker
typealias ItemsListener = (items: List<FavItem>) -> Unit

class ItemService {

    private var items = mutableListOf<FavItem>()

    private val listeners = mutableSetOf<ItemsListener>()

    init {
        val faker = Faker.instance()
        val generatedItems: List<FavItem> = (1..5).map { FavItem(
            name = faker.name().name(),
            size = 39,
            price = 45,
            fav = true,
            image = "https://assets.ajio.com/medias/sys_master/root/20220704/KsQx/62c2b2aeaeb26921af5e6522/-288Wx360H-460185188-brown-MODEL.jpg"
        ) }

    }
    fun getFavItem(): List<FavItem> {
        return items
    }
    fun deleteItem(item: FavItem) {
        items.remove(item)
    }
    fun addListener(listener: ItemsListener) {
        listeners.add(listener)
    }
    fun removeListener(listener: ItemsListener) {
        listeners.remove(listener)
    }
}