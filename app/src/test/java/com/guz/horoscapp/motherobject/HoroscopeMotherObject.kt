package com.guz.horoscapp.motherobject

import com.guz.horoscapp.data.network.response.PredictionResponse
import com.guz.horoscapp.domain.model.HoroscopeInfo

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date", "taurus", "taurus")

    val horoscopeInfoList = listOf(
        HoroscopeInfo.Aries,
        HoroscopeInfo.Taurus,
        HoroscopeInfo.Gemini,
        HoroscopeInfo.Cancer,
        HoroscopeInfo.Leo,
        HoroscopeInfo.Virgo,
        HoroscopeInfo.Libra,
        HoroscopeInfo.Scorpio,
        HoroscopeInfo.Sagittarius,
        HoroscopeInfo.Capricorn,
        HoroscopeInfo.Aquarius,
        HoroscopeInfo.Pisces
    )
}