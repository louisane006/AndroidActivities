package com.example.malumukendi.assignment6activities.domain;

import java.io.Serializable;

/**
 * Created by louisane Malu on images3/28/2016.
 */
public interface Task extends Serializable{
    double cost();

    double price(int unitPrice, double jobDone);
}
