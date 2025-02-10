package com.example.multipleDB.controller;

import com.example.multipleDB.model.primary.Hotel;
import com.example.multipleDB.model.secondary.Student;
import com.example.multipleDB.repository.primary.HotelRepository;
import com.example.multipleDB.repository.secondary.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MultipleDBController {

    private HotelRepository hotelRepository;
    private StudentRepository studentRepository;

    @Autowired
    public MultipleDBController(HotelRepository hotelRepository, StudentRepository studentRepository){
        this.hotelRepository = hotelRepository;
        this.studentRepository = studentRepository;
    }

    @GetMapping("/hotels")
    public ResponseEntity<List<Hotel>> getHotelList(){
        return new ResponseEntity<>(this.hotelRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudentList(){
        return new ResponseEntity<>(this.studentRepository.findAll(), HttpStatus.OK);
    }
}
