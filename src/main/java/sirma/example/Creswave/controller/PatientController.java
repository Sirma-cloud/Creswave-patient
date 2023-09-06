package sirma.example.Creswave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sirma.example.Creswave.model.Patient;
import sirma.example.Creswave.repository.PatientRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    // Getting all patients
    @GetMapping("/all/patient")
    public ResponseEntity<List<Patient>> getAllPatients() {
        List<Patient> patients = patientRepository.findAll();
        return ResponseEntity.ok(patients);
    }

    // Add a new patient
    @PostMapping("/create/patient")
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) {
        Patient savedPatient = patientRepository.save(patient);
        return ResponseEntity.ok(savedPatient);
    }

    // Update patient details
    @PutMapping("/update/patient/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable Long id, @RequestBody Patient updatedPatient) {
        Optional<Patient> existingPatient = patientRepository.findById(id);
        if (existingPatient.isPresent()) {
            Patient patient = existingPatient.get();
            // Update patient details here
            patient.setFirstName(updatedPatient.getFirstName());
            patient.setMiddleName(updatedPatient.getMiddleName());
            patient.setLastName(updatedPatient.getLastName());
            patient.setIdentificationType(updatedPatient.getIdentificationType());
            patient.setIdentificationNumber(updatedPatient.getIdentificationNumber());

            Patient savedPatient = patientRepository.save(patient);
            return ResponseEntity.ok(savedPatient);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

