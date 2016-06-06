package com.example.malumukendi.assignment6activities.servicesTest;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.test.AndroidTestCase;

import com.example.malumukendi.assignment6activities.conf.databases.GlobalContext;
import com.example.malumukendi.assignment6activities.domain.Brand;
import com.example.malumukendi.assignment6activities.domain.Brochure;
import com.example.malumukendi.assignment6activities.domain.Customer;
import com.example.malumukendi.assignment6activities.domain.Designer;
import com.example.malumukendi.assignment6activities.factories.BrandFactory;
import com.example.malumukendi.assignment6activities.repos.BrandRepo;
import com.example.malumukendi.assignment6activities.repos.Impl.BrandRepoImpl;
import com.example.malumukendi.assignment6activities.service.brandService.BrandService;
import com.example.malumukendi.assignment6activities.service.brandService.impl.BrandServiceImpl;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Malu.Mukendi on 2016-05-08.
 */
public class BrandServiceTest extends AndroidTestCase {
    private static final String TAG="BRAND TEST1";
    private Long id;
    private BrandServiceImpl brandService;
    private boolean isBound;
    private Brand brand;
    Designer designer;
    Customer customer;
    Brochure brochure;

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
    BrandService b = new BrandServiceImpl();
    @Override
    public void setUp() throws Exception {
        super.setUp();
        Intent intent = new Intent(this.getContext(), BrandServiceImpl.class);
        GlobalContext.context = this.getContext();
        brandService = BrandServiceImpl.getInstance();
        GlobalContext.getAppContext().bindService(intent, connection, Context.BIND_AUTO_CREATE);
    }
    @Test
    public void testCrossValidation() throws Exception {

        BrandRepo repo = new BrandRepoImpl(this.getContext());
        brand = new Brand.Builder().designer(designer).description("CI1000").id((long) 2000).customer(customer).build();
        brochure = new Brochure.Builder().desc("TM100").designer(designer).customer(customer).id((long) 10000).build();
        customer = new Customer.Builder().identification((long) 1020300).name("Sarah").surname("Smith").build();
        Brand b = BrandFactory.brand(customer, "CI1000", 2000, designer);
        Long id;
        // CREATE
        Brand createEntity = new Brand.Builder()
                .description("CI1000")
                .price(2000)
                .build();
        Brand insertedEntity = repo.save(createEntity);
        id = insertedEntity.getId();
        Assert.assertNotNull(TAG + " CREATE", insertedEntity);
        assertEquals(brand.getDescription(), "CI1000");
    }
}
