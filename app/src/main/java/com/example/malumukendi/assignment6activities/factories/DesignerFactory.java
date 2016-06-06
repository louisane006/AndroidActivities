package com.example.malumukendi.assignment6activities.factories;

import com.example.malumukendi.assignment6activities.domain.Designer;

/**
 * Created by louisane Malu on images4/images2/2016.
 */
public class DesignerFactory {
    public static Designer des(String n, String snm, String t){
        return new Designer.Builder()
                .name(n)
                .surname(snm)
                .taskNumber(t)
                .build();
    }
}
