package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bloodCompatibility")
public class BloodCompatibilityEntity {

    @EmbeddedId
    private BloodEntityPK pk;

    @MapsId("donorsId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "donorId1", referencedColumnName = "donorId"),
            @JoinColumn(name = "dateOfCollection1", referencedColumnName = "dateOfCollection")
    })
    private BloodEntity blood1;


    @MapsId("donorsId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "donorId2", referencedColumnName = "donorId"),
            @JoinColumn(name = "dateOfCollection2", referencedColumnName = "dateOfCollection")
    })
    private BloodEntity blood2;

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

    public BloodEntity getBlood2() {
        return blood2;
    }

    public void setBlood2(BloodEntity blood2) {
        this.blood2 = blood2;
    }
}
