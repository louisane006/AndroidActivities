package com.example.malumukendi.assignment6activities.service.brandService.impl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.example.malumukendi.assignment6activities.conf.databases.GlobalContext;
import com.example.malumukendi.assignment6activities.domain.Brand;
import com.example.malumukendi.assignment6activities.repos.BrandRepo;
import com.example.malumukendi.assignment6activities.repos.Impl.BrandRepoImpl;
import com.example.malumukendi.assignment6activities.service.brandService.BrandService;
import java.util.Set;

/**
 * Created by Malu.Mukendi on 2016-05-31.
 */
public class BrandServiceImpl extends Service implements BrandService {

    BrandRepo repo;
    private static BrandServiceImpl service = null;

    public BrandServiceImpl()
    {
        repo = new BrandRepoImpl(GlobalContext.getAppContext());
    }
    private final IBinder localBinder = new BookServiceLocalBinder();

    public static BrandServiceImpl getInstance() {
        if (service == null)
            service = new BrandServiceImpl();
        return service;
    }
    @Override
    public boolean duplicateCheck(String title) {
        Set<Brand> brands;
        brands =   repo.findAll();

        for (Brand brand : brands)
        {
            if (brand.getDescription().trim().equalsIgnoreCase(title))
                return true;

        }
        return false;
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return localBinder;
    }

    public class BookServiceLocalBinder extends Binder {
        public BrandServiceImpl getService() {
            return BrandServiceImpl.this;
        }
    }
}
