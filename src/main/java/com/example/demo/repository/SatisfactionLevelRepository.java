package com.example.demo.repository;

import com.example.demo.model.SatisfactionLevel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface SatisfactionLevelRepository extends JpaRepository<SatisfactionLevel, LocalDate> {
}
