package com.javaDeveloper.springbootapi.Dao;

import com.javaDeveloper.springbootapi.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<City,Integer> {
    City findByCitynameIgnoreCase(String cityname);
}
