package com.student.studentservice.domain.dto.request;

import com.student.studentservice.domain.dto.response.IdentityResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequest {
    private String fullName;
    private String email;
    private String password;
    private IdentityResponse identityResponse;

}
