package com.example.malumukendi.assignment6activities.factories;

import com.example.malumukendi.assignment6activities.domain.Ipad;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class IpadFactory {
    public static Ipad i(String n, String c, double p){
        return new Ipad.Builder()
                .name(n)
                .code(c)
                .costPrice(p)
                .build();
    }
}
