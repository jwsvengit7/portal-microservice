package com.student.studentservice.domain.dto.response;

import com.student.studentservice.domain.entity.IdentityManager;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
    private String fullName;
    private String email;
    private String password;
    private IdentityResponse identityResponse;
}
