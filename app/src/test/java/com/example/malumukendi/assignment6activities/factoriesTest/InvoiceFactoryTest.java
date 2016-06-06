package com.example.malumukendi.assignment6activities.factoriesTest;

import com.example.malumukendi.assignment6activities.domain.Cashier;
import com.example.malumukendi.assignment6activities.domain.Invoice;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by louisane Malu on images4/images2/2016.
 */
public class InvoiceFactoryTest {
    Invoice invoice;
    Invoice newInvoice;
    Cashier cashier;
    public InvoiceFactoryTest() {
    }
    @Test
    public void createTest(){
        invoice = new Invoice.Builder().identification((long) 41414141).invoiceNum(40500).cashier(cashier).amount(4500.00).build();
        Assert.assertEquals(invoice.getInvoiceNum() , 40500);
    }
    @Test
    public void updateTest() {
        newInvoice = new Invoice.Builder().invoiceNum(41500).build();
        Assert.assertEquals(newInvoice.getInvoiceNum(), 41500);
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
}
