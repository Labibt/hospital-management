package com.example.hospital_management.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@Table(
        uniqueConstraints = {
            @UniqueConstraint(name = "unique_name_birthdate", columnNames = {"name", "birth_date"})
        },
        indexes = {
            @Index(name = "idx_birth_date", columnList = "birth_date"),
        }
)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private LocalDate birthDate;

    @Column(unique = true, nullable = false)
    private String email;

    private String gender;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;
}
