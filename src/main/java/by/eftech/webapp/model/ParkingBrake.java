package by.eftech.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "parking_brake")
public class ParkingBrake extends NamedEntity implements Serializable{

    public ParkingBrake() {

    }

    public ParkingBrake(String name) {
        super(name);
    }


    public ParkingBrake(Integer id, String name) {
        super(id, name);
    }
}
