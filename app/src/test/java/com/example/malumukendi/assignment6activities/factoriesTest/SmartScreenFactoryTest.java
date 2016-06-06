package com.example.malumukendi.assignment6activities.factoriesTest;

import com.example.malumukendi.assignment6activities.domain.SmartScreen;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by louisane Malu on images4/images2/2016.
 */
public class SmartScreenFactoryTest {
    SmartScreen screen;
    SmartScreen newScreen;

    public SmartScreenFactoryTest() {
    }
    @Test
    public void createTest(){
        screen = new SmartScreen.Builder().id((long) 1020102010).name("Samsung").code("44500").costPrice(20000.00).build();
        Assert.assertEquals(screen.getName() , "Samsung");
    }
    @Test
    public void updateTest() {
        newScreen = new SmartScreen.Builder().name("LG").build();
        Assert.assertEquals(newScreen.getName(), "LG");
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
}
