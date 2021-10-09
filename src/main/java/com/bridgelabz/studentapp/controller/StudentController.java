package com.bridgelabz.studentapp.controller;


import com.bridgelabz.studentapp.entity.StudentEntity;
import com.bridgelabz.studentapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {


    @Autowired
    private StudentRepository studentRepository;



    @RequestMapping(value = "save/students", method = RequestMethod.POST)
    public Optional<StudentEntity> students(@RequestBody StudentEntity studentEntity) {
        studentRepository.save(studentEntity);
        return studentRepository.findById(1);
    }

}
