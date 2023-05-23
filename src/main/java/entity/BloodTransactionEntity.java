package entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "BloodTransaction")
public class BloodTransactionEntity {
    @EmbeddedId
    private BloodEntityPK pk;

    @MapsId("donorsId")
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "donorId1", referencedColumnName = "donorId"),
            @JoinColumn(name = "dateOfCollection1", referencedColumnName = "dateOfCollection")
    })
    private BloodEntity blood1;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patientId", referencedColumnName = "patientId", unique = true, nullable = false)
    private PatientEntity patient;

    @Column(name = "transactionDate")
    private Date transactionDate;

    public BloodEntityPK getPk() {
        return pk;
    }

    public void setPk(BloodEntityPK pk) {
        this.pk = pk;
    }

    public BloodEntity getBlood1() {
        return blood1;
    }

    public void setBlood1(BloodEntity blood1) {
        this.blood1 = blood1;
    }

    public PatientEntity getPatient() {
        return patient;
    }

    public void setPatient(PatientEntity patient) {
        this.patient = patient;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
