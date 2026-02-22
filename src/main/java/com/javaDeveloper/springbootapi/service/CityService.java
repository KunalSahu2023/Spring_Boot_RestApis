package com.javaDeveloper.springbootapi.service;

import com.javaDeveloper.springbootapi.entity.City;
import java.util.List;

public interface CityService {

    // 1. Add city
    City addCity(City city);

    // 2. Get all cities
    List<City> getAllCities();

    // 3. Get city by ID
    City getCityById(Integer id);

    // 4. Update city
    City updateCity(Integer id, City city);

    // 5. Delete city
    void deleteCity(Integer id);
}