package com.student.studentservice.exception.handler;


import com.student.studentservice.domain.dto.response.ApiResponse;
import com.student.studentservice.exception.GlobalExceptionResponse;
import com.student.studentservice.exception.UserNotFoundException;
import com.student.studentservice.utils.DateUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;

@RestControllerAdvice
public class GlobalHandlerException {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ApiResponse<GlobalExceptionResponse>> apiResponseResponseEntity(UserNotFoundException e){
        GlobalExceptionResponse globalExceptionResponse = GlobalExceptionResponse.builder()
                .date(DateUtils.converted(LocalDate.now()))
                .message(e.getMessage())
                .statusCode(HttpStatus.NOT_FOUND.value())
                .build();
        ApiResponse<GlobalExceptionResponse> apiResponse = new ApiResponse<>(globalExceptionResponse);
        return new ResponseEntity<>(apiResponse,HttpStatus.NOT_FOUND);

    }


}
