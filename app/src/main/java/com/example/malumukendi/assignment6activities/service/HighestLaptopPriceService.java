package com.example.malumukendi.assignment6activities.service;

import android.content.Intent;
import android.os.IBinder;

import com.example.malumukendi.assignment6activities.domain.Laptop;

import java.util.List;

/**
 * Created by Malu.Mukendi on 2016-05-07.
 */
public interface HighestLaptopPriceService {

    IBinder onBind(Intent intent);

    Laptop highestCost(List<Laptop> work);
}
