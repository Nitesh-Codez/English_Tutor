package com.example.demoweb.repository;

import com.example.demoweb.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Quiz, Long> {
}
