package com.example.malumukendi.assignment6activities.factoriesTest;

import com.example.malumukendi.assignment6activities.domain.Computer;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by louisane Malu on images4/23/2016.
 */
public class ComputerFactoryTest {
    Computer comp;
    Computer newComp;
    @Test
    public void createTest(){
        comp = new Computer.Builder().identification((long) 213015889).name("Accer").code("42365").price(5000).build();
        Assert.assertEquals(comp.getName() , "Accer");
    }
    @Test
    public void updateTest() {
        newComp = new Computer.Builder().identification((long) 2130158454).name("HP").build();
        Assert.assertEquals(newComp.getName(), "HP");
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
}
