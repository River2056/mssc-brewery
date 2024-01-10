package com.river.msscbrewery.services;

import java.util.UUID;

import com.river.msscbrewery.web.model.BeerDto;

/**
 * BeerService
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
