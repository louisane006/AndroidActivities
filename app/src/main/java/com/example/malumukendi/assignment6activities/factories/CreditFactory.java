package com.example.malumukendi.assignment6activities.factories;

import com.example.malumukendi.assignment6activities.domain.Credit;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class CreditFactory {
    public static Credit credit(double amt, String n){
        return new Credit.Builder()
                .amount(amt)
                .name(n)
                .build();
    }
}