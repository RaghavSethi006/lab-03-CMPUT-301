package com.example.listycity3

import androidx.compose.runtime.mutableStateListOf

class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )

    val cities: MutableList<City>
        get() = _cities

    fun addCity(city: City) {
        _cities.add(city)
    }

    fun editCity(newCity:City , newCityIndex : Int){
        _cities[newCityIndex] = newCity
    }
}