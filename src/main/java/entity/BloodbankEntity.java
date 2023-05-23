package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "bloodbank")
public class BloodbankEntity {
    @Basic
    @Column(name = "name", unique = true, nullable = false, length = 150)
    private String name;

    @Basic
    @Column(name = "city", nullable = false, length = 60)
    private String city;

    @Basic
    @Column(name = "street", nullable = false, length = 100)
    private String street;

    @Basic
    @Column(name = "zip", nullable = false, length = 40)
    private String zip;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @OneToMany(mappedBy = "workplace", cascade = CascadeType.ALL)
    private List<EmployeeEntity> employees;

    @OneToMany(mappedBy = "storedIn", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<BloodEntity> bloods;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BloodbankEntity{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                ", id=" + id +
                '}';
    }
}
