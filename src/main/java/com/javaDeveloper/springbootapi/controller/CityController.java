package com.javaDeveloper.springbootapi.controller;

import com.javaDeveloper.springbootapi.entity.City;
import com.javaDeveloper.springbootapi.payload.ApiResponse;
import com.javaDeveloper.springbootapi.service.CityService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    // Add City
    @PostMapping
    public ResponseEntity<ApiResponse<City>> addCity(@Valid @RequestBody City newCity){

        City savedCity = cityService.addCity(newCity);

        return new ResponseEntity<>(
                new ApiResponse<>(1, "City added successfully", savedCity, LocalDateTime.now()),
                HttpStatus.CREATED
        );
    }

    // Get All Cities
    @GetMapping
    public ResponseEntity<ApiResponse<List<City>>> getCities(){

        List<City> cities = cityService.getAllCities();

        return ResponseEntity.ok(
                new ApiResponse<>(1, "Cities fetched successfully", cities, LocalDateTime.now())
        );
    }

    // Get City By ID
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<City>> getCityById(@PathVariable Integer id) {

        City city = cityService.getCityById(id);

        return ResponseEntity.ok(
                new ApiResponse<>(1, "City fetched successfully", city, LocalDateTime.now())
        );
    }

    // Update City
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<City>> updateById(
            @PathVariable Integer id,
            @Valid @RequestBody City city){

        City updatedCity = cityService.updateCity(id, city);

        return ResponseEntity.ok(
                new ApiResponse<>(1, "City updated successfully", updatedCity, LocalDateTime.now())
        );
    }

    // Delete City
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<String>> deleteId(@PathVariable Integer id){

        cityService.deleteCity(id);

        return ResponseEntity.ok(
                new ApiResponse<>(1, "City deleted successfully", null, LocalDateTime.now())
        );
    }
}