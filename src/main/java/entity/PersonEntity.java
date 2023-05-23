package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "person")
@Inheritance(strategy = InheritanceType.JOINED)
public class PersonEntity {

    @Id
    @Basic
    @Column(name = "documentid")
    private int documentid;

    @Basic
    @Column(name = "email", unique = true, nullable = false, length = 100)
    private String email;

    @Basic
    @Column(name = "firstname", length = 100)
    private String firstname;

    @Basic
    @Column(name = "lastname", length = 100)
    private String lastname;

    @Basic
    @Column(name = "age")
    private short age;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person", cascade = CascadeType.ALL)
    private List<PhoneEntity> phoneNumbers;

    public List<PhoneEntity> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneEntity> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void addPhoneNumber(PhoneEntity phone) {
        this.phoneNumbers.add(phone);
    }

    public int getDocumentid() {
        return documentid;
    }

    public void setDocumentid(int documentid) {
        this.documentid = documentid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "documentid=" + documentid +
                ", email='" + email + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }


}
