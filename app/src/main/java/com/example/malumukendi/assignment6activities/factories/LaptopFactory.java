package com.example.malumukendi.assignment6activities.factories;

import com.example.malumukendi.assignment6activities.domain.Laptop;

/**
 * Created by louisane Malu on images4/images2/2016.
 */
public class LaptopFactory {
    public static Laptop l(String n, String c, double p){
        return new Laptop.Builder()
                .name(n)
                .code(c)
                .price(p)
                .build();
    }
}
