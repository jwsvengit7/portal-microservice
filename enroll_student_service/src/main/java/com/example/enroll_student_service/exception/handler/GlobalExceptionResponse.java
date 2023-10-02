package com.example.enroll_student_service.exception.handler;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GlobalExceptionResponse {
    private String message;
    private LocalDateTime time;
    private int status;

}
