package com.guz.horoscapp.data

import android.util.Log
import com.guz.horoscapp.data.network.HoroscopeApiService
import com.guz.horoscapp.data.network.response.PredictionResponse
import com.guz.horoscapp.domain.Repository
import com.guz.horoscapp.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("gutz", "Ha ocurrido un error ${it.message}") }

        return null
    }

}