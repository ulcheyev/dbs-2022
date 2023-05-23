package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.eclipse.persistence.annotations.CascadeOnDelete;

@Entity
@Table(name = "bloodbankmanager")
@CascadeOnDelete
public class BloodBankManagerEntity extends EmployeeEntity {
}
