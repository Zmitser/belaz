package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "dump_trucks_cross_country_capacity", schema = "belaz")
@NamedQueries({
        @NamedQuery(name = DumpTrucksCrossCountryCapacity.DELETE, query = "DELETE from DumpTrucksCrossCountryCapacity t WHERE t.id=:id"),
        @NamedQuery(name = DumpTrucksCrossCountryCapacity.ALL_SORTED, query = "SELECT t FROM DumpTrucksCrossCountryCapacity t ORDER BY t.model.name"),
})
@AssociationOverrides({
        @AssociationOverride(name = "model", joinColumns = {@JoinColumn(name = "model_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "manufacturer", joinColumns = {@JoinColumn(name = "manufacturer_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "engine", joinColumns = {@JoinColumn(name = "engine_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "transmission", joinColumns = {@JoinColumn(name = "transmission_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "suspension", joinColumns = {@JoinColumn(name = "suspension_id", referencedColumnName = "id", nullable = false)}),
})
public class DumpTrucksCrossCountryCapacity extends MiningMachinery {
    private Integer truck;
    private Integer loadingHeight;
    private String frame;
    private String fordingDepth;
    private String climableSlopes;
    private WheelArrangement wheelArrangement;
    private String productId;
    private List<Video> videos;
    private List<Photo> photos;
    private Integer payloadCapacity;
    private String turningRadius;
    private Integer operationalWeight;
    private Integer grossWeight;
    private Integer maxSpeed;
    private String completeSet;
    private MachineCondition machineCondition;
    private MachineLocation machineLocation;
    private ManufacturerCountry manufacturerCountry;


    public static final String DELETE = "DumpTrucksCrossCountryCapacity.delete";
    public static final String ALL_SORTED = "DumpTrucksCrossCountryCapacity.getAllSorted";

    @Basic
    @Column(name = "truck")
    public Integer getTruck() {
        return truck;
    }

    public void setTruck(Integer truck) {
        this.truck = truck;
    }

    @Basic
    @Column(name = "loading_height")
    public Integer getLoadingHeight() {
        return loadingHeight;
    }

    public void setLoadingHeight(Integer loadingHeight) {
        this.loadingHeight = loadingHeight;
    }

    @Basic
    @Column(name = "frame")
    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    @Basic
    @Column(name = "fording_depth")
    public String getFordingDepth() {
        return fordingDepth;
    }

    public void setFordingDepth(String fordingDepth) {
        this.fordingDepth = fordingDepth;
    }

    @Basic
    @Column(name = "climable_slopes")
    public String getClimableSlopes() {
        return climableSlopes;
    }

    public void setClimableSlopes(String climableSlopes) {
        this.climableSlopes = climableSlopes;
    }


    @ManyToOne
    @JoinColumn(name = "wheel_arrangement_id", referencedColumnName = "id", nullable = false)
    public WheelArrangement getWheelArrangement() {
        return wheelArrangement;
    }

    public void setWheelArrangement(WheelArrangement wheelArrangement) {
        this.wheelArrangement = wheelArrangement;
    }

    @ManyToMany(mappedBy = "dumpTrucksCrossCountryCapacity")
    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    @ManyToMany(mappedBy = "dumpTrucksCrossCountryCapacity", fetch = FetchType.EAGER)
    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
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
