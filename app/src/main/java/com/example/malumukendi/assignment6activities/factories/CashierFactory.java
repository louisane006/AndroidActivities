package com.example.malumukendi.assignment6activities.factories;

import com.example.malumukendi.assignment6activities.domain.Cashier;

/**
 * Created by louisane Malu on images4/images2/2016.
 */
public class CashierFactory {
        public static Cashier cashier( String n, String snm, String t){
                return new Cashier.Builder()
                        .name(n)
                        .surname(snm)
                        .taskNum(t)
                        .build();
        }
}