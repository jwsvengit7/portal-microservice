package com.service.authservice.model.dto.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse<K> {
    private K data;
    private String message;
    private LocalDate localDate;

    public ApiResponse(K data){
        this.data=data;
        this.localDate = LocalDate.now();
        this.message="API RECIEVED";
    }
}
