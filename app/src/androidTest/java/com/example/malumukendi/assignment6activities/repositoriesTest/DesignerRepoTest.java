package com.example.malumukendi.assignment6activities.repositoriesTest;

import android.test.AndroidTestCase;

import com.example.malumukendi.assignment6activities.domain.Designer;
import com.example.malumukendi.assignment6activities.repos.DesignerRepo;
import com.example.malumukendi.assignment6activities.repos.Impl.DesignerRepoImpl;

import junit.framework.Assert;

import java.util.Set;

/**
 * Created by louisane Malu on images4/images2/2016.
 */
public class DesignerRepoTest extends AndroidTestCase {
    private static final String TAG="DESIGNER TEST";
    private Long id;

    public void testCreateReadUpdateDelete() throws Exception {
        DesignerRepo repo = new DesignerRepoImpl(this.getContext());
        // CREATE
        Designer createEntity = new Designer.Builder()
                .name("Samsung")
                .surname("Malu")
                .taskNumber("5000")
                .build();
        Designer insertedEntity = repo.save(createEntity);
        id=insertedEntity.getIdentification();
        Assert.assertNotNull(TAG+" CREATE",insertedEntity);

        //READ ALL
        Set<Designer> designer = repo.findAll();
        Assert.assertTrue(TAG+" READ ALL",designer.size()>0);

        //READ ENTITY
        Designer entity = repo.findById(id);
        Assert.assertNotNull(TAG+" READ ENTITY",entity);

        //UPDATE ENTITY
        Designer updateEntity = new Designer.Builder()
                .name("Emily")
                .build();
        repo.update(updateEntity);
        Designer newEntity = repo.findById(id);
        Assert.assertEquals(TAG+ " UPDATE ENTITY","Samsung",newEntity.getName());

        // DELETE ENTITY
        repo.delete(entity);
        Designer deletedEntity = repo.findById(id);
        Assert.assertNull(TAG+" DELETE",deletedEntity);

    }
}
