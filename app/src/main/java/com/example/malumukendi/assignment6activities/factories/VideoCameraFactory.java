package com.example.malumukendi.assignment6activities.factories;

import com.example.malumukendi.assignment6activities.domain.VideoCamera;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class  VideoCameraFactory {
    public static VideoCamera vc(String n, String cd, double p){
        return new VideoCamera.Builder()
                .name(n)
                .code(cd)
                .costPrice(p)
                .build();
    }
}

