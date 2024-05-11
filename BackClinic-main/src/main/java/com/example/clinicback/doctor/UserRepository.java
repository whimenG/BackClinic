package com.example.clinicback.doctor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository {
    User findByUsername(String username);
}
