package com.example.enroll_student_service.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ApiResponse<T> {
    private String message;
    private T data;
    public ApiResponse(T data){
        this.data=data;
        this.message="Api Recieved";
    }

}
