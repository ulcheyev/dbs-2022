package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "blood")
public class BloodEntity {
    @EmbeddedId
    private BloodEntityPK id;

    @MapsId("documentId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "donorId", referencedColumnName = "documentId")
    private DonorEntity donor;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "storedIn", referencedColumnName = "name", nullable = false)
    private BloodbankEntity storedIn;

    public BloodEntityPK getId() {
        return id;
    }

    public void setId(BloodEntityPK id) {
        this.id = id;
    }

    public DonorEntity getDonor() {
        return donor;
    }

    public void setDonor(DonorEntity donor) {
        this.donor = donor;
    }

    public BloodbankEntity getStoredIn() {
        return storedIn;
    }

    public void setStoredIn(BloodbankEntity storedIn) {
        this.storedIn = storedIn;
    }


}
