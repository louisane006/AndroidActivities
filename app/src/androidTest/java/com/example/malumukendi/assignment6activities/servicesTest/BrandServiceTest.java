package com.example.malumukendi.assignment6activities.servicesTest;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.test.AndroidTestCase;

import com.example.malumukendi.assignment6activities.conf.databases.GlobalContext;
import com.example.malumukendi.assignment6activities.service.customerService.impl.BrandServiceImpl;

/**
 * Created by Malu.Mukendi on 2016-05-08.
 */
public class BrandServiceTest extends AndroidTestCase {
    private static final String TAG="EMPLOYEE TEST1";
    private Long id;
    private BrandServiceImpl brandService;
    private boolean isBound;

    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            BrandServiceImpl.BookServiceLocalBinder binder
                    = (BrandServiceImpl.BookServiceLocalBinder) service;
            brandService = binder.getService();
            isBound = true;
        }
        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;
        }
    };
    @Override
    public void setUp() throws Exception {
        super.setUp();
        Intent intent = new Intent(this.getContext(), BrandServiceImpl.class);
        GlobalContext.context = this.getContext();
        brandService = BrandServiceImpl.getInstance();
        GlobalContext.getAppContext().bindService(intent, connection, Context.BIND_AUTO_CREATE);
    }
}
