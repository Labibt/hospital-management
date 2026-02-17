package com.example.hospital_management.repository;

import com.example.hospital_management.entity.BloodGroup;
import com.example.hospital_management.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;


public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByBirthDateOrEmail(LocalDate birthDate, String email);

    List<Patient> findByBirthDateBetween(LocalDate startDate, LocalDate endDate);

    List<Patient> findByNameContaining(String query);

    @Query("select p from Patient p where p.bloodGroup = :bloodGroup")
    List<Patient> findByBloodGroup(@Param("bloodGroup") BloodGroup bloodGroup);
}
