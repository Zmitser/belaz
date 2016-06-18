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
        @AssociationOverride(name = "model",  joinColumns = {@JoinColumn(name = "model_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "machineCondition",  joinColumns = {@JoinColumn(name = "machine_condition_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "manufacturerCountry",  joinColumns = {@JoinColumn(name = "manufacturer_country_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "manufacturer",  joinColumns = {@JoinColumn(name = "manufacturer_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "engine",  joinColumns = {@JoinColumn(name = "engine_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "transmission",  joinColumns = {@JoinColumn(name = "transmission_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "suspension",  joinColumns = {@JoinColumn(name = "suspension_id", referencedColumnName = "id", nullable = false)}),
})
public class TruckMining extends MiningMachinery{
    private String fuelRate;
    private String torque;;
    private Auxiliary auxiliary;
    private BrakeType brakeType;
    private FrontWheels frontWheels;
    private RearWheels rearWheels;
    private ParkingBrake parkingBrake;
    private List<Video> videos;
    private List<Photo> photos;




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
        super(id, productId, year, payloadCapacity, power, turningRadius, length, width, height, operationalWeight, grossWeight, maxSpeed, price, application, advantages, completeSet, sold, engine, transmission, suspension, machineCondition, machineLocation, manufacturer, manufacturerCountry, model);
        this.fuelRate = fuelRate;
        this.torque = torque;
        this.auxiliary = auxiliary;
        this.brakeType = brakeType;
        this.frontWheels = frontWheels;
        this.parkingBrake = parkingBrake;
        this.photos = photos;
        this.rearWheels = rearWheels;
        this.videos = videos;
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
        super(productId, year, payloadCapacity, power, turningRadius, length, width, height, operationalWeight, grossWeight, maxSpeed, price, application, advantages, completeSet, sold, engine, transmission, suspension, machineCondition, machineLocation, manufacturer, manufacturerCountry, model);
        this.fuelRate = fuelRate;
        this.torque = torque;
        this.auxiliary = auxiliary;
        this.brakeType = brakeType;
        this.frontWheels = frontWheels;
        this.parkingBrake = parkingBrake;
        this.photos = photos;
        this.rearWheels = rearWheels;
        this.videos = videos;
    }


}
