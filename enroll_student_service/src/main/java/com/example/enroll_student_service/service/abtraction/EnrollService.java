package com.example.enroll_student_service.service.abtraction;

import com.example.enroll_student_service.domain.dto.request.EnrollRequest;

public interface EnrollService {
    Boolean  appply(EnrollRequest enrollRequest);
}
