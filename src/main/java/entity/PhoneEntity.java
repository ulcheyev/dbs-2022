package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "phone")
public class PhoneEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person", referencedColumnName = "documentId", nullable = false)
    private PersonEntity person;

    @Basic
    @Column(name = "phone", length = 40)
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PhoneEntity{" +
                "id=" + id +
                ", person=" + person +
                ", phone='" + phone + '\'' +
                '}';
    }
}
