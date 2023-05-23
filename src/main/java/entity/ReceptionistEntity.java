package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.eclipse.persistence.annotations.CascadeOnDelete;

import java.util.List;

@Entity
@Table(name = "receptionist")
@CascadeOnDelete
public class ReceptionistEntity extends EmployeeEntity {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "receptionistId")
    private List<DonorEntity> donorsRegistered;

    public List<DonorEntity> getDonorsRegistered() {
        return donorsRegistered;
    }

    public void setDonorsRegistered(List<DonorEntity> donorsRegistered) {
        this.donorsRegistered = donorsRegistered;
    }
}
