package com.river.msscbrewery.services.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.river.msscbrewery.services.BeerService;
import com.river.msscbrewery.web.model.BeerDto;

/**
 * BeerServiceImpl
 */
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
