package com.example.enroll_student_service.exception.handler;

import com.example.enroll_student_service.domain.dto.response.ApiResponse;
import com.example.enroll_student_service.exception.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHadler {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ApiResponse<GlobalExceptionResponse>> studentNotFound(StudentNotFoundException e){
        GlobalExceptionResponse globalExceptionResponse = GlobalExceptionResponse.builder()
                .message(e.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .time(LocalDateTime.now())
                .build();
        ApiResponse<GlobalExceptionResponse> apiResponse = new ApiResponse<>(globalExceptionResponse);
        return new ResponseEntity<>(apiResponse,HttpStatus.NOT_FOUND);

    }
}
