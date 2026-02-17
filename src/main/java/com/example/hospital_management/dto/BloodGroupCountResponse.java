package com.example.hospital_management.dto;

import com.example.hospital_management.entity.BloodGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BloodGroupCountResponse {
    private BloodGroup bloodGroup;
    private long count;
}
