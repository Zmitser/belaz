package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "truck_mining", schema = "belaz", catalog = "")
@NamedQueries({
        @NamedQuery(name = TruckMining.DELETE, query = "DELETE from TruckMining t WHERE t.id=:id"),
        @NamedQuery(name = TruckMining.ALL_SORTED, query = "SELECT t FROM TruckMining t ORDER BY t.model.name"),
})
public class TruckMining {
    private Integer id;
    private String productId;
    private String year;
    private Integer payloadCapacity;
    private String power;
    private String fuelRate;
    private String torque;
    private String turningRadius;
    private Integer length;
    private Integer width;
    private Integer height;
    private Integer operationalWeight;
    private Integer grossWeight;
    private Integer maxSpeed;
    private Integer price;
    private String application;
    private String advantages;
    private String completeSet;
    private Boolean sold;
    private Auxiliary auxiliary;
    private BrakeType brakeType;
    private Engine engine;
    private FrontWheels frontWheels;
    private MachineCondition machineCondition;
    private MachineLocation machineLocation;
    private Manufacturer manufacturer;
    private ManufacturerCountry manufacturerCountry;
    private Model model;
    private by.eftech.webapp.model.Item Item;
    private ParkingBrake parkingBrake;
    private List<Photo> photos;
    private RearWheels rearWheels;
    private Suspension suspension;
    private Transmission transmission;
    private List<Video> videos;


    public static final String DELETE = "TruckMining.delete";
    public static final String ALL_SORTED = "TruckMining.getAllSorted";


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "year")
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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
    @Column(name = "power")
    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

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

    @Basic
    @Column(name = "turning_radius")
    public String getTurningRadius() {
        return turningRadius;
    }

    public void setTurningRadius(String turningRadius) {
        this.turningRadius = turningRadius;
    }

    @Basic
    @Column(name = "length")
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Basic
    @Column(name = "width")
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Basic
    @Column(name = "height")
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
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
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "application")
    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }




    @Basic
    @Column(name = "advantages")
    public String getAdvantages() {
        return advantages;
    }

    public void setAdvantages(String advantages) {
        this.advantages = advantages;
    }

    @Basic
    @Column(name = "complete_set")
    public String getCompleteSet() {
        return completeSet;
    }

    public void setCompleteSet(String completeSet) {
        this.completeSet = completeSet;
    }

    @Basic
    @Column(name = "sold")
    public Boolean getSold() {
        return sold;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TruckMining that = (TruckMining) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (payloadCapacity != null ? !payloadCapacity.equals(that.payloadCapacity) : that.payloadCapacity != null)
            return false;
        if (power != null ? !power.equals(that.power) : that.power != null) return false;
        if (fuelRate != null ? !fuelRate.equals(that.fuelRate) : that.fuelRate != null) return false;
        if (torque != null ? !torque.equals(that.torque) : that.torque != null) return false;
        if (turningRadius != null ? !turningRadius.equals(that.turningRadius) : that.turningRadius != null)
            return false;
        if (length != null ? !length.equals(that.length) : that.length != null) return false;
        if (width != null ? !width.equals(that.width) : that.width != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        if (operationalWeight != null ? !operationalWeight.equals(that.operationalWeight) : that.operationalWeight != null)
            return false;
        if (grossWeight != null ? !grossWeight.equals(that.grossWeight) : that.grossWeight != null) return false;
        if (maxSpeed != null ? !maxSpeed.equals(that.maxSpeed) : that.maxSpeed != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (application != null ? !application.equals(that.application) : that.application != null) return false;
        if (advantages != null ? !advantages.equals(that.advantages) : that.advantages != null) return false;
        if (completeSet != null ? !completeSet.equals(that.completeSet) : that.completeSet != null) return false;
        if (sold != null ? !sold.equals(that.sold) : that.sold != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (payloadCapacity != null ? payloadCapacity.hashCode() : 0);
        result = 31 * result + (power != null ? power.hashCode() : 0);
        result = 31 * result + (fuelRate != null ? fuelRate.hashCode() : 0);
        result = 31 * result + (torque != null ? torque.hashCode() : 0);
        result = 31 * result + (turningRadius != null ? turningRadius.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (operationalWeight != null ? operationalWeight.hashCode() : 0);
        result = 31 * result + (grossWeight != null ? grossWeight.hashCode() : 0);
        result = 31 * result + (maxSpeed != null ? maxSpeed.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (application != null ? application.hashCode() : 0);
        result = 31 * result + (advantages != null ? advantages.hashCode() : 0);
        result = 31 * result + (completeSet != null ? completeSet.hashCode() : 0);
        result = 31 * result + (sold != null ? sold.hashCode() : 0);
        return result;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "auxiliary_id", referencedColumnName = "id", nullable = false)
    public Auxiliary getAuxiliary() {
        return auxiliary;
    }

    public void setAuxiliary(Auxiliary auxiliary) {
        this.auxiliary = auxiliary;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "brake_type_id", referencedColumnName = "id", nullable = false)
    public BrakeType getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(BrakeType brakeType) {
        this.brakeType = brakeType;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "engine_id", referencedColumnName = "id", nullable = false)
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "front_wheels_id", referencedColumnName = "id", nullable = false)
    public FrontWheels getFrontWheels() {
        return frontWheels;
    }

    public void setFrontWheels(FrontWheels frontWheels) {
        this.frontWheels = frontWheels;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "machine_condition_id", referencedColumnName = "id", nullable = false)
    public MachineCondition getMachineCondition() {
        return machineCondition;
    }

    public void setMachineCondition(MachineCondition machineCondition) {
        this.machineCondition = machineCondition;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "machine_location_id", referencedColumnName = "id", nullable = false)
    public MachineLocation getMachineLocation() {
        return machineLocation;
    }

    public void setMachineLocation(MachineLocation machineLocation) {
        this.machineLocation = machineLocation;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "manufacturer_id", referencedColumnName = "id", nullable = false)
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "manufacturer_country_id", referencedColumnName = "id", nullable = false)
    public ManufacturerCountry getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(ManufacturerCountry manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "model_id", referencedColumnName = "id", nullable = false)
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @OneToOne(mappedBy = "truckMining", fetch = FetchType.LAZY)
    public by.eftech.webapp.model.Item getItem() {
        return Item;
    }

    public void setItem(by.eftech.webapp.model.Item item) {
        Item = item;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "parking_brake_id", referencedColumnName = "id", nullable = false)
    public ParkingBrake getParkingBrake() {
        return parkingBrake;
    }

    public void setParkingBrake(ParkingBrake parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    @ManyToMany(mappedBy = "truckMinings", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "rear_wheels_id", referencedColumnName = "id", nullable = false)
    public RearWheels getRearWheels() {
        return rearWheels;
    }

    public void setRearWheels(RearWheels rearWheels) {
        this.rearWheels = rearWheels;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "suspension_id", referencedColumnName = "id", nullable = false)
    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "transmission_id", referencedColumnName = "id", nullable = false)
    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @ManyToMany(mappedBy = "truckMinings", cascade = CascadeType.ALL)
    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public boolean newOject() {
        return (this.id == null);
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
                       Model model, Item item,
                       ParkingBrake parkingBrake, List<Photo> photos,
                       RearWheels rearWheels,
                       Suspension suspension,
                       Transmission transmission,
                       List<Video> videos) {
        this.id = id;
        this.productId = productId;
        this.year = year;
        this.payloadCapacity = payloadCapacity;
        this.power = power;
        this.fuelRate = fuelRate;
        this.torque = torque;
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
        this.auxiliary = auxiliary;
        this.brakeType = brakeType;
        this.engine = engine;
        this.frontWheels = frontWheels;
        this.machineCondition = machineCondition;
        this.machineLocation = machineLocation;
        this.manufacturer = manufacturer;
        this.manufacturerCountry = manufacturerCountry;
        this.model = model;
        Item = item;
        this.parkingBrake = parkingBrake;
        this.photos = photos;
        this.rearWheels = rearWheels;
        this.suspension = suspension;
        this.transmission = transmission;
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
        this.productId = productId;
        this.year = year;
        this.payloadCapacity = payloadCapacity;
        this.power = power;
        this.fuelRate = fuelRate;
        this.torque = torque;
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
        this.auxiliary = auxiliary;
        this.brakeType = brakeType;
        this.engine = engine;
        this.frontWheels = frontWheels;
        this.machineCondition = machineCondition;
        this.machineLocation = machineLocation;
        this.manufacturer = manufacturer;
        this.manufacturerCountry = manufacturerCountry;
        this.model = model;
        this.parkingBrake = parkingBrake;
        this.photos = photos;
        this.rearWheels = rearWheels;
        this.suspension = suspension;
        this.transmission = transmission;
        this.videos = videos;
    }
}
