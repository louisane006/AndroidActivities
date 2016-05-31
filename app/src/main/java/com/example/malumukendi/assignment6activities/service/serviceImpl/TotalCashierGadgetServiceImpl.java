package com.example.malumukendi.assignment6activities.service.serviceImpl;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import com.example.malumukendi.assignment6activities.domain.Cashier;
import com.example.malumukendi.assignment6activities.domain.Customer;
import com.example.malumukendi.assignment6activities.repos.CashierRepo;
import com.example.malumukendi.assignment6activities.service.TotalCashierGadgetService;

/**
 * Created by Malu.Mukendi on 2016-05-07.
 */
public class TotalCashierGadgetServiceImpl extends Cashier implements TotalCashierGadgetService{

    private final IBinder localBinder = new ActivateServiceLocalBinder();
    private CashierRepo repo;

    public  TotalCashierGadgetServiceImpl() {

    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return localBinder;
    }
    public class ActivateServiceLocalBinder extends Binder {
        public TotalCashierGadgetServiceImpl getService() {
            return TotalCashierGadgetServiceImpl.this;
        }
    }
    @Override
    public Customer totalCost(Cashier cashier) {
        return cashier.getCustomer();
    }
}
