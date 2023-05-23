package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "patient")
public class PatientEntity extends PersonEntity {

    @Id
    @Column(name = "patientId", unique = true, nullable = false)
    private int patientId;

    @Column(name = "bloodGroup", nullable = false)
    private int patientBloodGroup;

    @ManyToMany
    @JoinTable(
            name = "hospitalHasPatients",
            joinColumns = @JoinColumn(name = "hospitalName"),
            inverseJoinColumns = @JoinColumn(name = "patientId")
    )
    private List<HospitalEntity> hospitals;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getPatientBloodGroup() {
        return patientBloodGroup;
    }

    public void setPatientBloodGroup(int patientBloodGroup) {
        this.patientBloodGroup = patientBloodGroup;
    }

    public List<HospitalEntity> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<HospitalEntity> hospitals) {
        this.hospitals = hospitals;
    }
}