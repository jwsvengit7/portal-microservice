package com.student.studentservice.domain.entity;

import com.student.studentservice.config.CascadeSave;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    private String id;
    private String email;
    private String fullName;
    private String password;
    @DBRef
    @CascadeSave
    private IdentityManager identityManager;
    private String profileUrl;


}
