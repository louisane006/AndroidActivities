package com.example.malumukendi.assignment6activities.factories;

import com.example.malumukendi.assignment6activities.domain.Brochure;
import com.example.malumukendi.assignment6activities.domain.Customer;
import com.example.malumukendi.assignment6activities.domain.Designer;

/**
 * Created by louisane Malu on images4/images2/2016.
 */
public class BrochureFactory {
    public static Brochure brochure(Customer cust, String d, String n, double p, Designer des) {
        return new Brochure.Builder()
                .designer(des)
                .desc(d)
                .customer(cust)
                .price(p)
                .build();

    }
}