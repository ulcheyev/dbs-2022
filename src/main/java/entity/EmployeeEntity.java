package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
@Inheritance(strategy = InheritanceType.JOINED)
public class EmployeeEntity extends PersonEntity {

    @Id
    @Column(name = "employeeid", unique = true, nullable = false)
    private int employeeId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "workplace", referencedColumnName = "name", nullable = false)
    private BloodbankEntity workplace;


    public int getEmployeeid() {
        return employeeId;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeId = employeeid;
    }

    public BloodbankEntity getWorkplace() {
        return workplace;
    }

    public void setWorkplace(BloodbankEntity workplace) {
        this.workplace = workplace;
    }


    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "employeeid=" + employeeId +
                ", workplace='" + workplace +
                '}';
    }
}
