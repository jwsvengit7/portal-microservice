package com.service.authservice.domain.repository;


import com.service.authservice.domain.entity.token.JwtToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface JwtTokenRepository extends JpaRepository<JwtToken,Integer> {
    Optional<JwtToken> findByToken(String token);


    @Query(value = "DELETE FROM jwttoken WHERE id =?1",nativeQuery = true)
    JwtToken deleteToken(Long id);

}