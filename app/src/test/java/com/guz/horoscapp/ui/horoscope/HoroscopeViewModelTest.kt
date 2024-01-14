package com.guz.horoscapp.ui.horoscope

import com.guz.horoscapp.data.providers.HoroscopeProvider
import com.guz.horoscapp.motherobject.HoroscopeMotherObject
import com.guz.horoscapp.motherobject.HoroscopeMotherObject.horoscopeInfoList
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class HoroscopeViewModelTest {

    @MockK
    lateinit var horoscopeProvider: HoroscopeProvider

    private lateinit var viewModel: HoroscopeViewModel

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

     @Test
     fun `when viewmodel is created then horoscopes are loaded`() {
         every {horoscopeProvider.getHoroscope()} returns horoscopeInfoList
         viewModel = HoroscopeViewModel(horoscopeProvider)

         val horoscopes = viewModel.horoscope.value

         assertTrue(horoscopes.isNotEmpty())
     }

}