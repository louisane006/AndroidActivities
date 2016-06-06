package com.example.malumukendi.assignment6activities.repositoriesTest;

import android.test.AndroidTestCase;

import com.example.malumukendi.assignment6activities.domain.Cashier;
import com.example.malumukendi.assignment6activities.domain.Customer;
import com.example.malumukendi.assignment6activities.domain.Designer;
import com.example.malumukendi.assignment6activities.repos.CashierRepo;
import com.example.malumukendi.assignment6activities.repos.Impl.CashierRepoImpl;

import junit.framework.Assert;

import java.util.Set;

/**
 * Created by louisane Malu on images4/images2/2016.
 */
public class CashierRepoTest extends AndroidTestCase {
    private static final String TAG="SETTINGS TEST";
    private Long id;
    Customer cust;
    Designer des;

    public void testCreateReadUpdateDelete() throws Exception {
        CashierRepo repo = new CashierRepoImpl(this.getContext());
        // CREATE
        Cashier createEntity = new Cashier.Builder()
                .name("Karen")
                .surname("Smith")
                .taskNum("1000")
                .build();
        Cashier insertedEntity = repo.save(createEntity);
        id=insertedEntity.getIdentification();
        Assert.assertNotNull(TAG+" CREATE",insertedEntity);

        //READ ALL
        Set<Cashier> cashier = repo.findAll();
        Assert.assertTrue(TAG+" READ ALL",cashier.size()>0);

        //READ ENTITY
        Cashier entity = repo.findById(id);
        Assert.assertNotNull(TAG+" READ ENTITY",entity);

        //UPDATE ENTITY
        Cashier updateEntity = new Cashier.Builder()
                .surname("Thomas")
                .build();
        repo.update(updateEntity);
        Cashier newEntity = repo.findById(id);
        Assert.assertEquals(TAG+ " UPDATE ENTITY","Smith",newEntity.getSurname());

        // DELETE ENTITY
        repo.delete(entity);
        Cashier deletedEntity = repo.findById(id);
        Assert.assertNull(TAG+" DELETE",deletedEntity);

    }
}
