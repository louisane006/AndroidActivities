package com.example.malumukendi.assignment6activities.factoriesTest;

import com.example.malumukendi.assignment6activities.domain.Cashier;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by louisane Malu on images4/23/2016.
 */
public class CashierFactoryTest {
    Cashier cashier;
    Cashier newCashier;
    @Test
    public void createTest(){
        cashier = new Cashier.Builder().identification((long) 10000).name("Karen").surname("Thomas").build();
        Assert.assertEquals(cashier.getSurname() , "Thomas");
    }
    @Test
    public void updateTest() {
        newCashier = new Cashier.Builder("10000").surname("Smith").build();
        Assert.assertEquals(newCashier.getSurname(), "Smith");
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
}
