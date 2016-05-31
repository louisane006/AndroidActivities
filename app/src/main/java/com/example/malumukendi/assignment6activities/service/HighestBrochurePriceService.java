package com.example.malumukendi.assignment6activities.service;

import com.example.malumukendi.assignment6activities.domain.Brochure;

import java.util.List;

/**
 * Created by Malu.Mukendi on 2016-05-07.
 */
public interface HighestBrochurePriceService {

    Brochure highestCost(List<Brochure> works);
}
