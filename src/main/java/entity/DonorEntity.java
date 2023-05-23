package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "donor")
public class DonorEntity extends PersonEntity {

    @Column(name = "bloodGroup")
    private String donorBloodGroup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receptionistId", referencedColumnName = "employeeId", nullable = false)
    private ReceptionistEntity receptionistId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "donor", cascade = CascadeType.ALL)
    private List<BloodEntity> bloods;

    public String getDonorBloodGroup() {
        return donorBloodGroup;
    }

    public void setDonorBloodGroup(String donorBloodGroup) {
        this.donorBloodGroup = donorBloodGroup;
    }

    public ReceptionistEntity getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(ReceptionistEntity receptionistId) {
        this.receptionistId = receptionistId;
    }

    public List<BloodEntity> getBloods() {
        return bloods;
    }


    public void setBloods(List<BloodEntity> bloods) {
        this.bloods = bloods;
    }

    @Override
    public String toString() {
        return "DonorEntity{" +
                "donorBloodGroup='" + donorBloodGroup + '\'' +
                ", receptionistId=" + receptionistId +
                ", bloods=" + bloods +
                "} " + super.toString();
    }
}
