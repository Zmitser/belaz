package by.eftech.webapp.model;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "truck_mining")
public class TruckMining extends BaseEntity implements Serializable {

    @Column(name = "power", nullable = false)
    @NotEmpty
    protected String power;


    @Column(name = "payload_capacity")
    protected Integer payloadCapacity;

    @Column(name = "fuel_rate")
    protected Integer fuelRate;

    @Column(name = "torque", nullable = false)
    @NotEmpty
    protected String torque;

    @Column(name = "turning_radius", nullable = false)
    @NotEmpty
    protected String turningRadius;

    @Column(name = "length")
    protected Integer length;

    @Column(name = "width")
    protected Integer width;

    @Column(name = "height")
    protected Integer height;

    @Column(name = "operational_weight")
    protected Integer operationalWeight;

    @Column(name = "gross_weight")
    protected Integer grossWeight;

    @Column(name = "max_speed")
    protected Integer maxSpeed;

    @Column(name = "application", nullable = false)
    @NotEmpty
    protected String application;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "truck_mining_has_photo", joinColumns = {@JoinColumn(name = "truck_mining_id")},
            inverseJoinColumns = {@JoinColumn(name = "photo_id")})
    protected List<Photo> photo;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "model_id")
    protected Model model;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "transmission_id")
    protected Transmission transmission;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "engine_id")
    protected Engine engine;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "suspension_id")
    protected Suspension suspension;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "brake_id")
    protected Brakes brakes;


    public List<Photo> getPhoto() {
        return photo;
    }

    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Integer getFuelRate() {
        return fuelRate;
    }

    public void setFuelRate(Integer fuelRate) {
        this.fuelRate = fuelRate;
    }

    public String getTorque() {
        return torque;
    }

    public void setTorque(String torque) {
        this.torque = torque;
    }

    public String getTurningRadius() {
        return turningRadius;
    }

    public void setTurningRadius(String turningRadius) {
        this.turningRadius = turningRadius;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getOperationalWeight() {
        return operationalWeight;
    }

    public void setOperationalWeight(Integer operationalWeight) {
        this.operationalWeight = operationalWeight;
    }

    public Integer getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(Integer grossWeight) {
        this.grossWeight = grossWeight;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public void setBrakes(Brakes brakes) {
        this.brakes = brakes;
    }

    public Integer getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(Integer payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public TruckMining() {
    }

    public TruckMining(String power,
                       Integer payloadCapacity,
                       Integer fuelRate,
                       String torque,
                       String turningRadius,
                       Integer length,
                       Integer width,
                       Integer height,
                       Integer operationalWeight,
                       Integer grossWeight,
                       Integer maxSpeed,
                       String application,
                       List<Photo> photo,
                       Model model,
                       Transmission transmission,
                       Engine engine,
                       Suspension suspension,
                       Brakes brakes) {
        this.power = power;
        this.payloadCapacity = payloadCapacity;
        this.fuelRate = fuelRate;
        this.torque = torque;
        this.turningRadius = turningRadius;
        this.length = length;
        this.width = width;
        this.height = height;
        this.operationalWeight = operationalWeight;
        this.grossWeight = grossWeight;
        this.maxSpeed = maxSpeed;
        this.application = application;
        this.photo = photo;
        this.model = model;
        this.transmission = transmission;
        this.engine = engine;
        this.suspension = suspension;
        this.brakes = brakes;
    }

    public TruckMining(Integer id,
                       String power,
                       Integer payloadCapacity,
                       Integer fuelRate,
                       String torque,
                       String turningRadius,
                       Integer length,
                       Integer width,
                       Integer height,
                       Integer operationalWeight,
                       Integer grossWeight,
                       Integer maxSpeed,
                       String application,
                       List<Photo> photo,
                       Model model,
                       Transmission transmission,
                       Engine engine,
                       Suspension suspension,
                       Brakes brakes) {
        super(id);
        this.power = power;
        this.payloadCapacity = payloadCapacity;
        this.fuelRate = fuelRate;
        this.torque = torque;
        this.turningRadius = turningRadius;
        this.length = length;
        this.width = width;
        this.height = height;
        this.operationalWeight = operationalWeight;
        this.grossWeight = grossWeight;
        this.maxSpeed = maxSpeed;
        this.application = application;
        this.photo = photo;
        this.model = model;
        this.transmission = transmission;
        this.engine = engine;
        this.suspension = suspension;
        this.brakes = brakes;
    }
}
