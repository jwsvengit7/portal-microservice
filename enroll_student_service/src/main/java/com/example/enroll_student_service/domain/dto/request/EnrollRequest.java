
package com.example.enroll_student_service.domain.dto.request;
import com.example.enroll_student_service.domain.constants.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EnrollRequest {
    private String userId;
    private Double amount;
    private Date date;
    private Status status;
}
