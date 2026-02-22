package com.javaDeveloper.springbootapi.service;

import com.javaDeveloper.springbootapi.Dao.CityRepo;
import com.javaDeveloper.springbootapi.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepo cityRepo;

    @Override
    public City addCity(City city) {

        City existing = cityRepo.findByCitynameIgnoreCase(city.getCityname());

        if (existing != null) {
            throw new RuntimeException("City already exists");
        }

        return cityRepo.save(city);
    }

    @Override
    public List<City> getAllCities() {
        return cityRepo.findAll();
    }

    @Override
    public City getCityById(Integer id) {
        return cityRepo.findById(id)
                .orElseThrow(null);
    }

    @Override
    public City updateCity(Integer id, City city) {

        City existing = cityRepo.findById(id)
                .orElseThrow(null);

        existing.setCityname(city.getCityname());
        existing.setPopulation(city.getPopulation());

        return cityRepo.save(existing);
    }

    @Override
    public void deleteCity(Integer id) {

        City existing = cityRepo.findById(id)
                .orElseThrow(null);

        cityRepo.delete(existing);
    }
}