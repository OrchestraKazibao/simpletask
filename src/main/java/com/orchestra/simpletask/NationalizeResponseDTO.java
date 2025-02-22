package com.orchestra.simpletask;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class NationalizeResponseDTO {
    private String name;
    @JsonProperty("country")
    private List<CountryDTO> countries;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<CountryDTO> getCountries() {
        return countries;
    }

    public void setCountries(final List<CountryDTO> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "NationalizeResponseDTO{" + "name='" + name + '\'' + ", countries=" + countries + '}';
    }
}