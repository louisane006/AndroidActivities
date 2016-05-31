package com.example.malumukendi.assignment6activities.service.serviceImpl;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import com.example.malumukendi.assignment6activities.domain.Designer;
import com.example.malumukendi.assignment6activities.repos.DesignerRepo;
import com.example.malumukendi.assignment6activities.service.TotalDesignerInventionService;

/**
 * Created by Malu.Mukendi on 2016-05-07.
 */
public class TotalDesignerInventionServiceImpl extends Designer implements TotalDesignerInventionService {

    public DesignerRepo repo;
    private final IBinder localBinder = new ActivateServiceLocalBinder();
    public TotalDesignerInventionServiceImpl() {
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return localBinder;
    }
    public class ActivateServiceLocalBinder extends Binder {
        public TotalDesignerInventionServiceImpl getService() {
            return TotalDesignerInventionServiceImpl.this;
        }
    }
    @Override
    public double totalCost(Designer designer) {
        return designer.getFrame().getPrice() +  designer.getBrochure().getPrice();


    }
}
