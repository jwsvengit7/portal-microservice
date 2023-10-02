package com.student.studentservice.service.interfaces;

import com.student.studentservice.domain.dto.request.StudentRequest;
import com.student.studentservice.domain.dto.response.StudentResponse;

public interface StudentService {

    StudentResponse createStudent(StudentRequest studentRequest);
    String deleteStudent(String id);
    Boolean findUser(String email,String password);
    StudentResponse getUser(String email);
}
