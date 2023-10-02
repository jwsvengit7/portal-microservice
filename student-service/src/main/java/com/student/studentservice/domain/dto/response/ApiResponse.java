package com.student.studentservice.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class ApiResponse<T> {
    private String message;
    private T data;

    public ApiResponse(T data){
        this.data=data;
        this.message = "Api recieved";
    }
}
