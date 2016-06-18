package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "truck_mining", schema = "belaz")
@NamedQueries({
        @NamedQuery(name = TruckMining.DELETE, query = "DELETE from TruckMining t WHERE t.id=:id"),
        @NamedQuery(name = TruckMining.ALL_SORTED, query = "SELECT t FROM TruckMining t ORDER BY t.model.name"),
})
@AssociationOverrides({
        @AssociationOverride(name = "model", joinColumns = {@JoinColumn(name = "model_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "manufacturer", joinColumns = {@JoinColumn(name = "manufacturer_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "engine", joinColumns = {@JoinColumn(name = "engine_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "transmission", joinColumns = {@JoinColumn(name = "transmission_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "suspension", joinColumns = {@JoinColumn(name = "suspension_id", referencedColumnName = "id", nullable = false)}),
})
public class TruckMining extends MiningMachinery {
    private String fuelRate;
    private String torque;
    ;
    private Auxiliary auxiliary;
    private BrakeType brakeType;
    private FrontWheels frontWheels;
    private RearWheels rearWheels;
    private ParkingBrake parkingBrake;
    private List<Video> videos;
    private List<Photo> photos;
    private String productId;
    private Integer payloadCapacity;
    private String turningRadius;
    private Integer operationalWeight;
    private Integer grossWeight;
    private Integer maxSpeed;
    private String completeSet;
    private MachineCondition machineCondition;
    private MachineLocation machineLocation;
    private ManufacturerCountry manufacturerCountry;


    public static final String DELETE = "TruckMining.delete";
    public static final String ALL_SORTED = "TruckMining.getAllSorted";

    @Basic
    @Column(name = "fuel_rate")
    public String getFuelRate() {
        return fuelRate;
    }

    public void setFuelRate(String fuelRate) {
        this.fuelRate = fuelRate;
    }

    @Basic
    @Column(name = "torque")
    public String getTorque() {
        return torque;
    }

    public void setTorque(String torque) {
        this.torque = torque;
    }


    @ManyToOne
    @JoinColumn(name = "auxiliary_id", referencedColumnName = "id", nullable = false)
    public Auxiliary getAuxiliary() {
        return auxiliary;
    }

    public void setAuxiliary(Auxiliary auxiliary) {
        this.auxiliary = auxiliary;
    }

    @ManyToOne
    @JoinColumn(name = "brake_type_id", referencedColumnName = "id", nullable = false)
    public BrakeType getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(BrakeType brakeType) {
        this.brakeType = brakeType;
    }

    @ManyToOne
    @JoinColumn(name = "front_wheels_id", referencedColumnName = "id", nullable = false)
    public FrontWheels getFrontWheels() {
        return frontWheels;
    }

    public void setFrontWheels(FrontWheels frontWheels) {
        this.frontWheels = frontWheels;
    }

    @ManyToOne
    @JoinColumn(name = "rear_wheels_id", referencedColumnName = "id", nullable = false)
    public RearWheels getRearWheels() {
        return rearWheels;
    }

    public void setRearWheels(RearWheels rearWheels) {
        this.rearWheels = rearWheels;
    }

    @ManyToOne
    @JoinColumn(name = "parking_brake_id", referencedColumnName = "id", nullable = false)
    public ParkingBrake getParkingBrake() {
        return parkingBrake;
    }

    public void setParkingBrake(ParkingBrake parkingBrake) {
        this.parkingBrake = parkingBrake;
    }


    @ManyToMany(mappedBy = "truckMinings", fetch = FetchType.EAGER)
    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    @ManyToMany(mappedBy = "truckMinings", fetch = FetchType.EAGER)
    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }


    public TruckMining(Integer id,
                       String productId,
                       String year,
                       Integer payloadCapacity,
                       String power,
                       String fuelRate,
                       String torque,
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
                       Auxiliary auxiliary,
                       BrakeType brakeType,
                       Engine engine,
                       FrontWheels frontWheels,
                       MachineCondition machineCondition,
                       MachineLocation machineLocation,
                       Manufacturer manufacturer,
                       ManufacturerCountry manufacturerCountry,
                       Model model,
                       ParkingBrake parkingBrake, List<Photo> photos,
                       RearWheels rearWheels,
                       Suspension suspension,
                       Transmission transmission,
                       List<Video> videos) {
        super(id, year, power, length, width, height, price, application, advantages, sold, engine, transmission, suspension, manufacturer, model);
        this.fuelRate = fuelRate;
        this.torque = torque;
        this.auxiliary = auxiliary;
        this.brakeType = brakeType;
        this.frontWheels = frontWheels;
        this.parkingBrake = parkingBrake;
        this.photos = photos;
        this.rearWheels = rearWheels;
        this.videos = videos;
        this.productId = productId;
        this.payloadCapacity = payloadCapacity;
        this.turningRadius = turningRadius;
        this.operationalWeight = operationalWeight;
        this.grossWeight = grossWeight;
        this.maxSpeed = maxSpeed;
        this.completeSet = completeSet;


        this.machineCondition = machineCondition;
        this.machineLocation = machineLocation;
        this.manufacturerCountry = manufacturerCountry;
    }

    public TruckMining() {
    }

    public TruckMining(String productId,
                       String year,
                       Integer payloadCapacity,
                       String power,
                       String fuelRate,
                       String torque,
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
                       Auxiliary auxiliary,
                       BrakeType brakeType,
                       Engine engine,
                       FrontWheels frontWheels,
                       MachineCondition machineCondition,
                       MachineLocation machineLocation,
                       Manufacturer manufacturer,
                       ManufacturerCountry manufacturerCountry,
                       Model model,
                       ParkingBrake parkingBrake,
                       List<Photo> photos,
                       RearWheels rearWheels,
                       Suspension suspension,
                       Transmission transmission,
                       List<Video> videos) {
        super(year, power, length, width, height, price, application, advantages, sold, engine, transmission, suspension, manufacturer, model);
        this.fuelRate = fuelRate;
        this.torque = torque;
        this.auxiliary = auxiliary;
        this.brakeType = brakeType;
        this.frontWheels = frontWheels;
        this.parkingBrake = parkingBrake;
        this.photos = photos;
        this.rearWheels = rearWheels;
        this.videos = videos;
        this.productId = productId;
        this.payloadCapacity = payloadCapacity;
        this.turningRadius = turningRadius;
        this.operationalWeight = operationalWeight;
        this.grossWeight = grossWeight;
        this.maxSpeed = maxSpeed;
        this.completeSet = completeSet;


        this.machineCondition = machineCondition;
        this.machineLocation = machineLocation;
        this.manufacturerCountry = manufacturerCountry;
    }

    @Basic
    @Column(name = "product_id")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "payload_capacity")
    public Integer getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(Integer payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Basic
    @Column(name = "turning_radius")
    public String getTurningRadius() {
        return turningRadius;
    }

    public void setTurningRadius(String turningRadius) {
        this.turningRadius = turningRadius;
    }

    @Basic
    @Column(name = "operational_weight")
    public Integer getOperationalWeight() {
        return operationalWeight;
    }

    public void setOperationalWeight(Integer operationalWeight) {
        this.operationalWeight = operationalWeight;
    }

    @Basic
    @Column(name = "gross_weight")
    public Integer getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(Integer grossWeight) {
        this.grossWeight = grossWeight;
    }

    @Basic
    @Column(name = "max_speed")
    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Basic
    @Column(name = "complete_set")
    public String getCompleteSet() {
        return completeSet;
    }

    public void setCompleteSet(String completeSet) {
        this.completeSet = completeSet;
    }


    @ManyToOne
    @JoinColumn(name = "manufacturer_country_id", referencedColumnName = "id", nullable = false)
    public ManufacturerCountry getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(ManufacturerCountry manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    @ManyToOne
    @JoinColumn(name = "machine_condition_id", referencedColumnName = "id", nullable = false)
    public MachineCondition getMachineCondition() {
        return machineCondition;
    }

    public void setMachineCondition(MachineCondition machineCondition) {
        this.machineCondition = machineCondition;
    }

    @ManyToOne
    @JoinColumn(name = "machine_location_id", referencedColumnName = "id", nullable = false)
    public MachineLocation getMachineLocation() {
        return machineLocation;
    }

    public void setMachineLocation(MachineLocation machineLocation) {
        this.machineLocation = machineLocation;
    }
}
