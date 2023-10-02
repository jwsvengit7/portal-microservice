package com.student.studentservice.domain.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "manager")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IdentityManager {
    @Id
    private String id;
    private String classes;
    private Integer age;
    private String studentId;


}
