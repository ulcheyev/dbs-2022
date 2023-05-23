package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "hospital")
public class HospitalEntity {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "zip")
    private String zip;

    @ManyToMany(mappedBy = "hospitals")
    private List<PatientEntity> patients;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
