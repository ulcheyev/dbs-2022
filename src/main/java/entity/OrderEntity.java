package entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "order_")
public class OrderEntity {

    @EmbeddedId
    private BloodEntityPK pk;


    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("donorsId")
    @JoinColumns({
            @JoinColumn(name = "donorId", referencedColumnName = "donorId"),
            @JoinColumn(name = "dateOfCollection", referencedColumnName = "dateOfCollection")
    })
    private BloodEntity blood;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospitalName", referencedColumnName = "name")
    private HospitalEntity hospital;


    @Column(name = "orderDate")
    private Date orderDate;

    public BloodEntityPK getPk() {
        return pk;
    }

    public void setPk(BloodEntityPK pk) {
        this.pk = pk;
    }

    public BloodEntity getBlood() {
        return blood;
    }

    public void setBlood(BloodEntity blood) {
        this.blood = blood;
    }

    public HospitalEntity getHospital() {
        return hospital;
    }

    public void setHospital(HospitalEntity hospital) {
        this.hospital = hospital;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
