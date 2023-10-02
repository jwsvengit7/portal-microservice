package com.student.studentservice.domain.repository;

import com.student.studentservice.domain.entity.IdentityManager;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IdentityRepository extends MongoRepository<IdentityManager,String> {
}
