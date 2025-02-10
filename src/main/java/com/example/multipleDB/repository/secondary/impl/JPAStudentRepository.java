package com.example.multipleDB.repository.secondary.impl;

import com.example.multipleDB.model.secondary.Student;
import com.example.multipleDB.repository.secondary.StudentRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JPAStudentRepository implements StudentRepository {

    @PersistenceContext(unitName = "secondary")
    private EntityManager entityManager;

    @Override
    public List<Student> findAll() {
        return this.entityManager.createQuery("FROM Student ", Student.class)
                .getResultList();
    }
}
