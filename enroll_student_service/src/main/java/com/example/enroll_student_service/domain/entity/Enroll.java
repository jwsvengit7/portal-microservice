package com.example.enroll_student_service.domain.entity;

import com.example.enroll_student_service.domain.constants.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "enroll")
public class Enroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String timeApply;
    private String userId;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Double amount;
}
