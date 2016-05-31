package com.example.malumukendi.assignment6activities.repositoriesTest;

import android.test.AndroidTestCase;

import com.example.malumukendi.assignment6activities.domain.Invoice;
import com.example.malumukendi.assignment6activities.repos.Impl.InvoiceRepoImpl;
import com.example.malumukendi.assignment6activities.repos.InvoiceRepo;

import junit.framework.Assert;

import java.util.Set;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class InvoiceRepoTest extends AndroidTestCase {
    private static final String TAG="INVOICE TEST";
    private Long id;

    public void testCreateReadUpdateDelete() throws Exception {
        InvoiceRepo repo = new InvoiceRepoImpl(this.getContext());
        // CREATE
        Invoice createEntity = new Invoice.Builder()
                .invoiceNum(1200)
                .amount(2000)
                .build();
        Invoice insertedEntity = repo.save(createEntity);
        id=insertedEntity.getIdentification();
        Assert.assertNotNull(TAG+" CREATE",insertedEntity);

        //READ ALL
        Set<Invoice>invoice = repo.findAll();
        Assert.assertTrue(TAG+" READ ALL",invoice.size()>0);

        //READ ENTITY
        Invoice entity = repo.findById(id);
        Assert.assertNotNull(TAG+" READ ENTITY",entity);

        //UPDATE ENTITY
        Invoice updateEntity = new Invoice.Builder()
                .invoiceNum(4500)
                .build();
        repo.update(updateEntity);
        Invoice newEntity = repo.findById(id);
        Assert.assertEquals(TAG+ " UPDATE ENTITY",1200,newEntity.getInvoiceNum());

        // DELETE ENTITY
        repo.delete(entity);
        Invoice deletedEntity = repo.findById(id);
        Assert.assertNull(TAG+" DELETE",deletedEntity);
    }
}
