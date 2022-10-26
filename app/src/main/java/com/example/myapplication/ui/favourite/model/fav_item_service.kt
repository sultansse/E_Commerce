package com.example.myapplication.ui.favourite.model

class fav_item_service {
    init {
        val firstItem = fav_item(
            name = "Almond Toe",
            size = 39,
            price = 45,
            fav = true,
            image = "https://assets.ajio.com/medias/sys_master/root/20220704/KsQx/62c2b2aeaeb26921af5e6522/-288Wx360H-460185188-brown-MODEL.jpg"
        )
    }
    fun getFavItem(): List
}