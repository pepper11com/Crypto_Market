package com.example.crypto.data.remote.dto

import com.example.crypto.domain.model.Coin
import com.google.gson.annotations.SerializedName

/**
 * Data transfer object for coin
 */
data class CoinDto(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

/**
 * Map CoinDto to Coin domain model object function
 */
fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}