package com.bridgelabz.studentapp.service;

import com.bridgelabz.studentapp.entity.StudentEntity;
import com.bridgelabz.studentapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<StudentEntity> students() {
        return studentRepository.findAll();
    }

    public StudentEntity getStudentById(int id) {
        Optional<StudentEntity> studentEntity = studentRepository.findById(id);
        if(studentEntity.isPresent()) {
            return studentEntity.get();
        }
        return null;
    }

    public StudentEntity getStudentByName(String name) {
        Optional<StudentEntity> studentEntity = studentRepository.findByFirstName(name);
        if(studentEntity.isPresent()) {
            return studentEntity.get();
        }
        return null;
    }

    public StudentEntity addStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    public StudentEntity updateStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    public String deleteStudent(int id) {
        Optional<StudentEntity> studentEntity = studentRepository.findById(id);
        if (studentEntity.isPresent()) {
            studentRepository.delete(studentEntity.get());
            return "Record deleted successfully";
        }
        return "Record does not exists with this id : " + id;
    }
}
