package com.example.multipleDB.repository.primary.impl;

import com.example.multipleDB.model.primary.Hotel;
import com.example.multipleDB.repository.primary.HotelRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JPAHotelRepository implements HotelRepository {

    private EntityManager entityManager;

    @Autowired
    public JPAHotelRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Hotel> findAll() {
        return this.entityManager.createQuery("FROM Hotel ", Hotel.class)
                .getResultList();
    }
}
