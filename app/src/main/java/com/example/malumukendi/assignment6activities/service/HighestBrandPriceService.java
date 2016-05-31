package com.example.malumukendi.assignment6activities.service;

import com.example.malumukendi.assignment6activities.domain.Brand;

import java.util.List;

/**
 * Created by Malu.Mukendi on 2016-05-04.
 */
public interface HighestBrandPriceService {

    Brand highestCost(List<Brand> b);
}

