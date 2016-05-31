package com.example.malumukendi.assignment6activities.factories;

import com.example.malumukendi.assignment6activities.domain.Parts;
import com.example.malumukendi.assignment6activities.domain.Shop;

import java.util.List;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class ShopFactory {
    public static Shop shop(double n, String a, List<Parts> part){
        return new Shop.Builder()
                .size(n)
                .address(a)
                .part(part)
                .build();
    }
}
