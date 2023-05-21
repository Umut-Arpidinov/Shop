package com.example.shoppinglist.domain

class AddShopItemUseCase(private val shopRepository: ShopListRepository) {
    fun addShopItem(shopItem: ShopItem){
        shopRepository.addShopItem(shopItem)
    }
}