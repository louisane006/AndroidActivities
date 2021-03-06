package com.example.malumukendi.assignment6activities.repositoriesTest;

import android.test.AndroidTestCase;

import com.example.malumukendi.assignment6activities.domain.Parts;
import com.example.malumukendi.assignment6activities.domain.Shop;
import com.example.malumukendi.assignment6activities.repos.Impl.ShopRepoImpl;
import com.example.malumukendi.assignment6activities.repos.ShopRepo;

import junit.framework.Assert;

import java.util.List;
import java.util.Set;

/**
 * Created by louisane Malu on images4/images2/2016.
 */
public class ShopRepoTest extends AndroidTestCase {
    private static final String TAG = "SHOP TEST";
    private Long id;
    List<Parts> part;

    public void testCreateReadUpdateDelete() throws Exception {
        ShopRepo repo = new ShopRepoImpl(this.getContext());
        // CREATE
        Shop createEntity = new Shop.Builder()
                .address("406, Protea Place, Plumstead")
                .size(500.22)
                .part(part)
                .build();
        Shop insertedEntity = repo.save(createEntity);
        id = insertedEntity.getIdentification();
        Assert.assertNotNull(TAG + " CREATE", insertedEntity);

        //READ ALL
        Set<Shop> screen = repo.findAll();
        Assert.assertTrue(TAG + " READ ALL", screen.size() > 0);

        //READ ENTITY
        Shop entity = repo.findById(id);
        Assert.assertNotNull(TAG + " READ ENTITY", entity);

        //UPDATE ENTITY
        Shop updateEntity = new Shop.Builder()
                .size(800.22)
                .build();
        repo.update(updateEntity);
        Shop newEntity = repo.findById(id);
        Assert.assertEquals(TAG + " UPDATE ENTITY", 500.22, newEntity.getSize());

        // DELETE ENTITY
        repo.delete(entity);
        Shop deletedEntity = repo.findById(id);
        Assert.assertNull(TAG + " DELETE", deletedEntity);

    }
}
