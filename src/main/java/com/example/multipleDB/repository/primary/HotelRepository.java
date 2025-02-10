package com.example.multipleDB.repository.primary;

import com.example.multipleDB.model.primary.Hotel;

import java.util.List;

public interface HotelRepository {
    public List<Hotel> findAll();
}
