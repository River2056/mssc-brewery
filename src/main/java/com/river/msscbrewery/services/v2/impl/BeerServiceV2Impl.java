package com.river.msscbrewery.services.v2.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.river.msscbrewery.services.v2.BeerServiceV2;
import com.river.msscbrewery.web.model.v2.BeerDtoV2;
import com.river.msscbrewery.web.model.v2.BeerStyleEnum;

import lombok.extern.slf4j.Slf4j;

/**
 * BeerServiceV2Impl
 */
@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public BeerDtoV2 savedNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        // TODO impl a update method
        log.info("updating a beer record, {}", beerDto.toString());
    }

    @Override
    public void deleteBeer(UUID beerid) {
        // TODO impl a delete method
        log.info("deleting a beer: {}", beerid.toString());
    }
}
