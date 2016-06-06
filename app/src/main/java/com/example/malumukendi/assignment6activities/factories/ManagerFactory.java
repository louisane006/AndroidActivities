package com.example.malumukendi.assignment6activities.factories;

import com.example.malumukendi.assignment6activities.domain.Manager;

/**
 * Created by louisane Malu on images4/images2/2016.
 */
public class ManagerFactory {
    public static Manager man(String n, String snm, String t){
        return new Manager.Builder()
                .name(n)
                .surname(snm)
                .taskNum(t)
                .build();
    }
}
