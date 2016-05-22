package by.eftech.webapp.model;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "truck_mining")
public class TruckMining extends BaseEntity implements Serializable {
    @Column(name = "product_id", nullable = false)
    @NotEmpty
    protected String productId;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "manufacturer_id")
    protected Manufacturer manufacturer;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "manufacturer_country_id")
    protected ManufacturerCountry country;

    @Column(name = "year", nullable = false)
    protected String year;

    @Column(name = "machine_condition_id", nullable = false, unique = false)
    @Enumerated(EnumType.ORDINAL)
    protected MachineCondition condition;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "machine_location_id")
    protected MachineLocation location;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "model_id")
    protected Model model;

    @Column(name = "payload_capacity")
    protected Integer payloadCapacity;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "engine_id")
    protected Engine engine;

    @Column(name = "power", nullable = false)
    @NotEmpty
    protected String power;


    @Column(name = "fuel_rate")
    protected Integer fuelRate;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "transmission_id")
    protected Transmission transmission;


    @Column(name = "torque", nullable = false)
    @NotEmpty
    protected String torque;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "suspension_id")
    protected Suspension suspension;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "brake_type_id")
    protected BrakeType brakeType;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "front_wheels_id")
    protected FrontWheels frontWheels;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "rear_wheels_id")
    protected RearWheels rearWheels;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "parking_brake_id")
    protected ParkingBrake parkingBrake;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "auxiliary_id")
    protected Auxiliary auxiliary;


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


    @Column(name = "price")
    protected Integer price;


    @Column(name = "application", nullable = false)
    @NotEmpty
    protected String application;


    @Column(name = "advantages", nullable = false)
    @NotEmpty
    protected String advantages;

    @Column(name = "complete_set", nullable = false)
    @NotEmpty
    protected String completeSet;

    @Column(name = "sold", nullable = false)
    protected Boolean sold;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "truck_mining_has_photo", joinColumns = {@JoinColumn(name = "truck_mining_id")},
            inverseJoinColumns = {@JoinColumn(name = "photo_id")})
    protected List<Photo> photo;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "truck_mining_has_video", joinColumns = {@JoinColumn(name = "truck_mining_id")},
            inverseJoinColumns = {@JoinColumn(name = "video_id")})
    protected List<Video> video;


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ManufacturerCountry getCountry() {
        return country;
    }

    public void setCountry(ManufacturerCountry country) {
        this.country = country;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public MachineCondition getCondition() {
        return condition;
    }

    public void setCondition(MachineCondition condition) {
        this.condition = condition;
    }

    public MachineLocation getLocation() {
        return location;
    }

    public void setLocation(MachineLocation location) {
        this.location = location;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Integer getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(Integer payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
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

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public String getTorque() {
        return torque;
    }

    public void setTorque(String torque) {
        this.torque = torque;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    public BrakeType getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(BrakeType brakeType) {
        this.brakeType = brakeType;
    }

    public FrontWheels getFrontWheels() {
        return frontWheels;
    }

    public void setFrontWheels(FrontWheels frontWheels) {
        this.frontWheels = frontWheels;
    }

    public RearWheels getRearWheels() {
        return rearWheels;
    }

    public void setRearWheels(RearWheels rearWheels) {
        this.rearWheels = rearWheels;
    }

    public ParkingBrake getParkingBrake() {
        return parkingBrake;
    }

    public void setParkingBrake(ParkingBrake parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public Auxiliary getAuxiliary() {
        return auxiliary;
    }

    public void setAuxiliary(Auxiliary auxiliary) {
        this.auxiliary = auxiliary;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getAdvantages() {
        return advantages;
    }

    public void setAdvantages(String advantages) {
        this.advantages = advantages;
    }

    public String getCompleteSet() {
        return completeSet;
    }

    public void setCompleteSet(String completeSet) {
        this.completeSet = completeSet;
    }

    public Boolean getSold() {
        return sold;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
    }

    public List<Photo> getPhoto() {
        return photo;
    }

    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }

    public List<Video> getVideo() {
        return video;
    }

    public void setVideo(List<Video> video) {
        this.video = video;
    }

    public TruckMining() {
    }

    public TruckMining(String productId,
                       Manufacturer manufacturer,
                       ManufacturerCountry country,
                       String year,
                       MachineCondition condition,
                       MachineLocation location,
                       Model model,
                       Integer payloadCapacity,
                       Engine engine,
                       String power,
                       Integer fuelRate,
                       Transmission transmission,
                       String torque,
                       Suspension suspension,
                       BrakeType brakeType,
                       FrontWheels frontWheels,
                       RearWheels rearWheels,
                       ParkingBrake parkingBrake,
                       Auxiliary auxiliary,
                       String turningRadius,
                       Integer length,
                       Integer width,
                       Integer height,
                       Integer operationalWeight,
                       Integer grossWeight,
                       Integer maxSpeed,
                       Integer price,
                       String application,
                       String advantages,
                       String completeSet,
                       Boolean sold,
                       List<Photo> photo,
                       List<Video> video) {
        this.productId = productId;
        this.manufacturer = manufacturer;
        this.country = country;
        this.year = year;
        this.condition = condition;
        this.location = location;
        this.model = model;
        this.payloadCapacity = payloadCapacity;
        this.engine = engine;
        this.power = power;
        this.fuelRate = fuelRate;
        this.transmission = transmission;
        this.torque = torque;
        this.suspension = suspension;
        this.brakeType = brakeType;
        this.frontWheels = frontWheels;
        this.rearWheels = rearWheels;
        this.parkingBrake = parkingBrake;
        this.auxiliary = auxiliary;
        this.turningRadius = turningRadius;
        this.length = length;
        this.width = width;
        this.height = height;
        this.operationalWeight = operationalWeight;
        this.grossWeight = grossWeight;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.application = application;
        this.advantages = advantages;
        this.completeSet = completeSet;
        this.sold = sold;
        this.photo = photo;
        this.video = video;
    }


    public TruckMining(Integer id,
                       String productId,
                       Manufacturer manufacturer,
                       ManufacturerCountry country,
                       String year,
                       MachineCondition condition,
                       MachineLocation location,
                       Model model,
                       Integer payloadCapacity,
                       Engine engine,
                       String power,
                       Integer fuelRate,
                       Transmission transmission,
                       String torque,
                       Suspension suspension,
                       BrakeType brakeType,
                       FrontWheels frontWheels,
                       RearWheels rearWheels,
                       ParkingBrake parkingBrake,
                       Auxiliary auxiliary,
                       String turningRadius,
                       Integer length,
                       Integer width,
                       Integer height,
                       Integer operationalWeight,
                       Integer grossWeight,
                       Integer maxSpeed,
                       Integer price,
                       String application,
                       String advantages,
                       String completeSet,
                       Boolean sold,
                       List<Photo> photo,
                       List<Video> video) {
        super(id);
        this.productId = productId;
        this.manufacturer = manufacturer;
        this.country = country;
        this.year = year;
        this.condition = condition;
        this.location = location;
        this.model = model;
        this.payloadCapacity = payloadCapacity;
        this.engine = engine;
        this.power = power;
        this.fuelRate = fuelRate;
        this.transmission = transmission;
        this.torque = torque;
        this.suspension = suspension;
        this.brakeType = brakeType;
        this.frontWheels = frontWheels;
        this.rearWheels = rearWheels;
        this.parkingBrake = parkingBrake;
        this.auxiliary = auxiliary;
        this.turningRadius = turningRadius;
        this.length = length;
        this.width = width;
        this.height = height;
        this.operationalWeight = operationalWeight;
        this.grossWeight = grossWeight;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.application = application;
        this.advantages = advantages;
        this.completeSet = completeSet;
        this.sold = sold;
        this.photo = photo;
        this.video = video;
    }
}
