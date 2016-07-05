package by.eftech.webapp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "dump_trucks_cross_country_capacity", schema = "belaz")
@NamedQueries({
        @NamedQuery(name = DumpTrucksCrossCountryCapacity.DELETE, query = "DELETE from DumpTrucksCrossCountryCapacity t WHERE t.id=:id"),
        @NamedQuery(name = DumpTrucksCrossCountryCapacity.ALL_SORTED, query = "SELECT t FROM DumpTrucksCrossCountryCapacity t ORDER BY t.model.name"),
        @NamedQuery(name = DumpTrucksCrossCountryCapacity.ALL_SORTED_BY_DATE, query = "SELECT t FROM DumpTrucksCrossCountryCapacity t ORDER BY t.date DESC "),
})
@AssociationOverrides({
        @AssociationOverride(name = "model", joinColumns = {@JoinColumn(name = "model_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "manufacturer", joinColumns = {@JoinColumn(name = "manufacturer_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "engine", joinColumns = {@JoinColumn(name = "engine_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "transmission", joinColumns = {@JoinColumn(name = "transmission_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "suspension", joinColumns = {@JoinColumn(name = "suspension_id", referencedColumnName = "id", nullable = false)}),
})
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class DumpTrucksCrossCountryCapacity extends MiningMachinery {

    @Basic
    @Column(name = "truck")
    private Integer truck;
    @Basic
    @Column(name = "loading_height")
    private Integer loadingHeight;
    @Basic
    @Column(name = "frame")
    private String frame;
    @Basic
    @Column(name = "fording_depth")
    private String fordingDepth;
    @Basic
    @Column(name = "climable_slopes")
    private String climableSlopes;
    @ManyToOne
    @JoinColumn(name = "wheel_arrangement_id", referencedColumnName = "id", nullable = false)
    private WheelArrangement wheelArrangement;
    @Basic
    @Column(name = "product_id")
    private String productId;
    @ManyToMany(mappedBy = "dumpTrucksCrossCountryCapacity")
    private List<Video> videos;
    @ManyToMany(mappedBy = "dumpTrucksCrossCountryCapacity", fetch = FetchType.EAGER)
    private List<Photo> photos;
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
    @ManyToOne
    @JoinColumn(name = "machine_condition_id", referencedColumnName = "id", nullable = false)
    private MachineCondition machineCondition;
    @ManyToOne
    @JoinColumn(name = "machine_location_id", referencedColumnName = "id", nullable = false)
    private MachineLocation machineLocation;
    @ManyToOne
    @JoinColumn(name = "manufacturer_country_id", referencedColumnName = "id", nullable = false)
    private ManufacturerCountry manufacturerCountry;

    public DumpTrucksCrossCountryCapacity(String year, String power, Integer length,
                                          Integer width, Integer height, Integer price, String application,
                                          String advantages, Boolean sold, Engine engine, Transmission transmission,
                                          Suspension suspension, Manufacturer manufacturer,
                                          Model model, Integer truck, Integer loadingHeight, String frame,
                                          String fordingDepth, String climableSlopes,
                                          WheelArrangement wheelArrangement, String productId,
                                          List<Video> videos, List<Photo> photos, Integer payloadCapacity,
                                          String turningRadius, Integer operationalWeight, Integer grossWeight,
                                          Integer maxSpeed, String completeSet, MachineCondition machineCondition,
                                          MachineLocation machineLocation, ManufacturerCountry manufacturerCountry) {
        super(year, power, length, width, height, price, application, advantages, sold, engine,
                transmission, suspension, manufacturer, model);
        this.truck = truck;
        this.loadingHeight = loadingHeight;
        this.frame = frame;
        this.fordingDepth = fordingDepth;
        this.climableSlopes = climableSlopes;
        this.wheelArrangement = wheelArrangement;
        this.productId = productId;
        this.videos = videos;
        this.photos = photos;
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

    public static final String DELETE = "DumpTrucksCrossCountryCapacityUtil.delete";
    public static final String ALL_SORTED = "DumpTrucksCrossCountryCapacityUtil.getAllSorted";
    public static final String ALL_SORTED_BY_DATE = "DumpTrucksCrossCountryCapacityUtil.getAllSortedByDate";

}
