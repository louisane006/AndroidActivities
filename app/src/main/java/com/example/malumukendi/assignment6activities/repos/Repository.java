package com.example.malumukendi.assignment6activities.repos;

import java.util.Set;

/**
 * Created by louisane Malu on images4/20/2016.
 */
public interface Repository<E, ID> {

    E findById(ID id);

    E save(E entity);

    E update(E entity);

    E delete(E entity);

    Set<E> findAll();

    int deleteAll();

    boolean insertData(String email, String password, String name, String surname);
}
