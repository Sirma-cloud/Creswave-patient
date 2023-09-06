package sirma.example.Creswave.model;

import jakarta.persistence.*;

@Entity(name = "Patient")
@Table(
        name = "patient",
        uniqueConstraints = {
                @UniqueConstraint(name = "patient_identification_number_unique", columnNames = "identification_number")
        }
)
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String middleName;
    @Column(nullable = false)
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Enum.IdentificationType identificationType;
    @Column(name = "identification_number", nullable = false)
    private String identificationNumber;

    public Patient(String firstName, String middleName, String lastName, Enum.IdentificationType identificationType, String identificationNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.identificationType = identificationType;
        this.identificationNumber = identificationNumber;
    }

    public Patient() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Enum.IdentificationType getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(Enum.IdentificationType identificationType) {
        this.identificationType = identificationType;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identificationType=" + identificationType +
                ", identificationNumber='" + identificationNumber + '\'' +
                '}';
    }
}