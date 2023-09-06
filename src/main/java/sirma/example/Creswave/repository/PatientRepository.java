package sirma.example.Creswave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sirma.example.Creswave.model.Patient;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
//    Optional<Patient> findPatientBy(Long id);

}
