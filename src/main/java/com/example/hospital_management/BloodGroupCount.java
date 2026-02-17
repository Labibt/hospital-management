package com.example.hospital_management;

import com.example.hospital_management.entity.BloodGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BloodGroupCount {
    private BloodGroup bloodGroup;
    private long count;
}
