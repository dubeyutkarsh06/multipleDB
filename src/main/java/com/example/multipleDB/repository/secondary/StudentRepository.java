package com.example.multipleDB.repository.secondary;

import com.example.multipleDB.model.secondary.Student;

import java.util.List;

public interface StudentRepository {
    public List<Student> findAll();
}
