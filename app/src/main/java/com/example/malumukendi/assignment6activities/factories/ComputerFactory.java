package com.example.malumukendi.assignment6activities.factories;

import com.example.malumukendi.assignment6activities.domain.Computer;

/**
 * Created by louisane Malu on images4/images2/2016.
 */
public class ComputerFactory {

    public static Computer comp(String n, String c, double p){
        return new Computer.Builder()
                .code(c)
                .name(n)
                .price(p)
                .build();
    }
}
