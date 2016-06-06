package com.example.malumukendi.assignment6activities.factories;

import com.example.malumukendi.assignment6activities.domain.SmartScreen;

/**
 * Created by louisane Malu on images4/images2/2016.
 */
public class SmartScreenFactory {
    public static SmartScreen s(String n, String c, double p){
        return new SmartScreen.Builder()
                .name(n)
                .code(c)
                .costPrice(p)
                .build();
    }
}
