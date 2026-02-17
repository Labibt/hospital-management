package com.example.hospital_management;

import com.example.hospital_management.dto.BloodGroupCountResponse;
import com.example.hospital_management.entity.BloodGroup;
import com.example.hospital_management.entity.Patient;
import com.example.hospital_management.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.hospital_management.repository.PatientRepository;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class PatientTests {
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository(){
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);
    }

    @Test
    public void testTransactionMethods(){
//        Patient patient = patientService.getPatientById(1L);
//        System.out.println(patient);

        //List<Patient> patientList = patientRepository.findByBirthDateOrEmail(LocalDate.of(1990, 1, 1), "alice.smith@example.com");

//        List<Patient> patientList = patientRepository.findByBloodGroup(BloodGroup.A_POSITIVE);
//        for(Patient patient: patientList){
//            System.out.println(patient);
//        }

//        int rowsUpdated = patientRepository.updateNameWithId(1L, "labibs");
//        System.out.println("Rows updated: " + rowsUpdated);

        List<BloodGroupCountResponse> bloodGroupList = patientRepository.bloodGroupCount();
        for(BloodGroupCountResponse bloodGroupCountResponse: bloodGroupList){
            System.out.println(bloodGroupCountResponse);
        }
    }


}
