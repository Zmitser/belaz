package by.eftech.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "machine_location")
public class MachineLocation extends NamedEntity implements Serializable {

    public MachineLocation() {
    }

    public MachineLocation(String name) {
        super(name);
    }

    public MachineLocation(Integer id, String name) {
        super(id, name);
    }
}
