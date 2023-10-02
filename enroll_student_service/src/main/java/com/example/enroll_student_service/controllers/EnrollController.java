package com.example.enroll_student_service.controllers;

import com.example.enroll_student_service.domain.dto.request.EnrollRequest;
import com.example.enroll_student_service.domain.dto.response.ApiResponse;
import com.example.enroll_student_service.service.abtraction.EnrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/enroll")
@RequiredArgsConstructor
public class EnrollController {
    private final EnrollService enrollService;

    @PostMapping("/enroll")
    public ResponseEntity<ApiResponse<Boolean>> enroll(@RequestBody EnrollRequest enrollRequest){
        ApiResponse<Boolean> apiResponse = new ApiResponse<>(enrollService.appply(enrollRequest));
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
