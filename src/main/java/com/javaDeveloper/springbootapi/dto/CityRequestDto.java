package com.javaDeveloper.springbootapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CityRequestDto {

    @NotBlank(message = "City name is required")
    private String cityname;

    @NotNull(message = "Population is required")
    private Long population;
}

