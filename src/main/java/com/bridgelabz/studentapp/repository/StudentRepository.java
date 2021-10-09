package com.bridgelabz.studentapp.repository;

import com.bridgelabz.studentapp.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    Optional<StudentEntity> findByFirstName(String firstName);
}
