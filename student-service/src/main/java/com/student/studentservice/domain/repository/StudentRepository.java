package com.student.studentservice.domain.repository;

import com.student.studentservice.domain.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student,String> {
    Student findStudentById(String id);


    Optional<Student> findStudentByEmailAndPassword(String email,String password);
    Optional<Student> findStudentByEmail(String email);

    List<Student> findAllByIdentityManager_Classes(String classes);
}
