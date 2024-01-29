package com.river.msscbrewery.services.v2;

import java.util.UUID;

import com.river.msscbrewery.web.model.v2.BeerDtoV2;

/**
 * BeerServiceV2
 */
public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 savedNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteBeer(UUID beerid);

}
