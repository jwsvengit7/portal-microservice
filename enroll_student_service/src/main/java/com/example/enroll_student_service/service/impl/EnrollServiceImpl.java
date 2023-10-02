package com.example.enroll_student_service.service.impl;

import com.example.enroll_student_service.domain.dto.request.EnrollRequest;
import com.example.enroll_student_service.service.abtraction.EnrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnrollServiceImpl implements EnrollService {
    @Override
    public Boolean appply(EnrollRequest enrollRequest) {
        return null;
    }
}
