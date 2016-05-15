package by.eftech.webapp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "brakes")
public class Brakes extends BaseEntity implements Serializable{

    @Column(name = "type")
    protected String type;

    @Column(name = "front_wheels")
    protected  String frontWheels;

    @Column(name = "rear_wheels")
    protected String rearWheels;

    @Column(name = "parking_brake")
    protected String parkingBrake;

    @Column(name = "auxiliary")
    protected String auxiliary;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrontWheels() {
        return frontWheels;
    }

    public void setFrontWheels(String frontWheels) {
        this.frontWheels = frontWheels;
    }

    public String getRearWheels() {
        return rearWheels;
    }

    public void setRearWheels(String rearWheels) {
        this.rearWheels = rearWheels;
    }

    public String getParkingBrake() {
        return parkingBrake;
    }

    public void setParkingBrake(String parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public String getAuxiliary() {
        return auxiliary;
    }

    public void setAuxiliary(String auxiliary) {
        this.auxiliary = auxiliary;
    }

    public Brakes() {
    }

    public Brakes(Integer id, String type, String frontWheels, String rearWheels, String parkingBrake, String auxiliary) {
        super(id);
        this.type = type;
        this.frontWheels = frontWheels;
        this.rearWheels = rearWheels;
        this.parkingBrake = parkingBrake;
        this.auxiliary = auxiliary;
    }

    public Brakes(String type, String frontWheels, String rearWheels, String parkingBrake, String auxiliary) {
        this.type = type;
        this.frontWheels = frontWheels;
        this.rearWheels = rearWheels;
        this.parkingBrake = parkingBrake;
        this.auxiliary = auxiliary;
    }
}
