package com.guz.horoscapp.data.network.response

import com.google.gson.annotations.SerializedName
import com.guz.horoscapp.domain.model.PredictionModel

//{
//    "date": "2020-01-01"
//    "horoscope": "Hoy sera un dia asqueroso para tí"
//    "icon": "https://newastro.vercel.app/static/assets/zodiac-1.png"
//    "id": 10,
//    "sign": "aries"
//}

data class PredictionResponse(
    @SerializedName("date") val date: String,
    @SerializedName("horoscope") val horoscope: String,
    @SerializedName("sign") val sign: String
) {
    fun toDomain(): PredictionModel {
        return PredictionModel(horoscope = horoscope, sign = sign)
    }
}