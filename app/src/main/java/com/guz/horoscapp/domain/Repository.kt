package com.guz.horoscapp.domain

import com.guz.horoscapp.data.network.response.PredictionResponse
import com.guz.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?

}