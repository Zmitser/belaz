package by.eftech.webapp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "truck_mining", schema = "belaz")
@NamedQueries({
        @NamedQuery(name = TruckMining.DELETE, query = "DELETE from TruckMining t WHERE t.id=:id"),
        @NamedQuery(name = TruckMining.ALL_SORTED, query = "SELECT t FROM TruckMining t ORDER BY t.model.name"),
        @NamedQuery(name = TruckMining.ALL_SORTED_BY_DATE, query = "SELECT t FROM TruckMining t ORDER BY t.date DESC "),
})
@AssociationOverrides({
        @AssociationOverride(name = "model", joinColumns = {@JoinColumn(name = "model_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "manufacturer", joinColumns = {@JoinColumn(name = "manufacturer_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "engine", joinColumns = {@JoinColumn(name = "engine_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "transmission", joinColumns = {@JoinColumn(name = "transmission_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "suspension", joinColumns = {@JoinColumn(name = "suspension_id", referencedColumnName = "id", nullable = false)}),
})
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TruckMining extends MiningMachinery {
    @Basic
    @Column(name = "fuel_rate")
    private String fuelRate;
    @Basic
    @Column(name = "torque")
    private String torque;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "auxiliary_id", referencedColumnName = "id", nullable = false)
    private Auxiliary auxiliary;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "brake_type_id", referencedColumnName = "id", nullable = false)
    private BrakeType brakeType;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "front_wheels_id", referencedColumnName = "id", nullable = false)
    private FrontWheels frontWheels;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rear_wheels_id", referencedColumnName = "id", nullable = false)
    private RearWheels rearWheels;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parking_brake_id", referencedColumnName = "id", nullable = false)
    private ParkingBrake parkingBrake;
    @ManyToMany(mappedBy = "truckMinings", fetch = FetchType.EAGER)
    private List<Video> videos;
    @ManyToMany(mappedBy = "truckMinings", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Photo> photos;
    @Basic
    @Column(name = "product_id")
    private String productId;
    @Basic
    @Column(name = "payload_capacity")
    private Integer payloadCapacity;
    @Basic
    @Column(name = "turning_radius")
    private String turningRadius;
    @Basic
    @Column(name = "operational_weight")
    private Integer operationalWeight;
    @Basic
    @Column(name = "gross_weight")
    private Integer grossWeight;
    @Basic
    @Column(name = "max_speed")
    private Integer maxSpeed;
    @Basic
    @Column(name = "complete_set")
    private String completeSet;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "machine_condition_id", referencedColumnName = "id", nullable = false)
    private MachineCondition machineCondition;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "machine_location_id", referencedColumnName = "id", nullable = false)
    private MachineLocation machineLocation;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manufacturer_country_id", referencedColumnName = "id", nullable = false)
    private ManufacturerCountry manufacturerCountry;
    public static final String DELETE = "TruckMining.delete";
    public static final String ALL_SORTED = "TruckMining.getAllSorted";
    public static final String ALL_SORTED_BY_DATE = "TruckMining.getAllSortedByDate";
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

}
