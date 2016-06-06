package com.example.malumukendi.assignment6activities.factories;

import com.example.malumukendi.assignment6activities.domain.Customer;

/**
 * Created by louisane Malu on images4/images2/2016.
 */
public class CustomerFactory {
    public static Customer cust(String num, String name, String surname){
        return new Customer.Builder()
                .custNum(num)
                .name(name)
                .surname(surname)
                .build();
    }
}
