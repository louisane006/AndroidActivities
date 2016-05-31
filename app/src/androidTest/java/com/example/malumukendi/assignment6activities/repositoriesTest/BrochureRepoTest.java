package com.example.malumukendi.assignment6activities.repositoriesTest;

import android.test.AndroidTestCase;

import com.example.malumukendi.assignment6activities.domain.Brochure;
import com.example.malumukendi.assignment6activities.domain.Customer;
import com.example.malumukendi.assignment6activities.domain.Designer;
import com.example.malumukendi.assignment6activities.repos.BrochureRepo;
import com.example.malumukendi.assignment6activities.repos.Impl.BrochureRepoImpl;

import junit.framework.Assert;

import java.util.Set;

/**
 * Created by louisane Malu on 4/2/2016.
 */
public class BrochureRepoTest extends AndroidTestCase {
    private static final String TAG="SETTINGS TEST";
    private Long id;
    Customer cust;
    Designer des;

    public void testCreateReadUpdateDelete() throws Exception {
        BrochureRepo repo = new BrochureRepoImpl(this.getContext());
        // CREATE
        Brochure createEntity = new Brochure.Builder()
                .desc("TM100")
                .price(200.00)
                .build();
        Brochure insertedEntity = repo.save(createEntity);
        id=insertedEntity.getId();
        Assert.assertNotNull(TAG+" CREATE",insertedEntity);

        //READ ALL
        Set<Brochure> brochure = repo.findAll();
        Assert.assertTrue(TAG+" READ ALL",brochure.size()>0);

        //READ ENTITY
        Brochure entity = repo.findById(id);
        Assert.assertNotNull(TAG+" READ ENTITY",entity);

        //UPDATE ENTITY
        Brochure updateEntity = new Brochure.Builder()
                .copy(entity)
                .price(500)
                .build();
        repo.update(updateEntity);
        Brochure newEntity = repo.findById(id);
        Assert.assertEquals(TAG+ " UPDATE ENTITY",500.00,newEntity.getPrice());

        // DELETE ENTITY
        repo.delete(updateEntity);
        Brochure deletedEntity = repo.findById(id);
        Assert.assertNull(TAG+" DELETE",deletedEntity);

    }
}
