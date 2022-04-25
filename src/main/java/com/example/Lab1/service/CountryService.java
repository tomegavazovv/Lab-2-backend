package com.example.Lab1.service;

import com.example.Lab1.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {

    List<Country> findAll();
    Optional<Country> findById(Long id);
    Optional<Country> save(Country country);



}