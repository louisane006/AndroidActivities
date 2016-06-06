package com.example.malumukendi.assignment6activities.factoriesTest;

import com.example.malumukendi.assignment6activities.domain.Brochure;
import com.example.malumukendi.assignment6activities.domain.Customer;
import com.example.malumukendi.assignment6activities.domain.Designer;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by louisane Malu on images4/23/2016.
 */
public class BrochureFactoryTest {
    Brochure brochure;
    Brochure newBrochure;
    Designer designer;
    Customer customer;
    @Test
    public void createTest(){
        brochure = new Brochure.Builder().desc("TM100").designer(designer).customer(customer).id((long) 10000).build();
        Assert.assertEquals(brochure.getDesigner() , designer);
    }
    @Test
    public void updateTest() {
        newBrochure = new Brochure.Builder().designer(designer).build();
        Assert.assertEquals(newBrochure.getDesigner(), designer);
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
}
