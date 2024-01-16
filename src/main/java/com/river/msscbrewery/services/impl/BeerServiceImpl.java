package com.river.msscbrewery.services.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.river.msscbrewery.services.BeerService;
import com.river.msscbrewery.web.model.BeerDto;

import lombok.extern.slf4j.Slf4j;

/**
 * BeerServiceImpl
 */
@Slf4j
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

    @Override
    public BeerDto savedNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // TODO impl a update method
        log.info("updating a beer record, {}", beerDto.toString());
    }

    @Override
    public void deleteBeer(UUID beerid) {
        // TODO impl a delete method
        log.info("deleting a beer: {}", beerid.toString());
    }
}
