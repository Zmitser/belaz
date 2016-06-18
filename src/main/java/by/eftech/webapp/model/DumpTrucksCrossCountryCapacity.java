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
        @AssociationOverride(name = "model",  joinColumns = {@JoinColumn(name = "model_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "machineCondition",  joinColumns = {@JoinColumn(name = "machine_condition_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "manufacturerCountry",  joinColumns = {@JoinColumn(name = "manufacturer_country_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "manufacturer",  joinColumns = {@JoinColumn(name = "manufacturer_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "engine",  joinColumns = {@JoinColumn(name = "engine_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "transmission",  joinColumns = {@JoinColumn(name = "transmission_id", referencedColumnName = "id", nullable = false)}),
        @AssociationOverride(name = "suspension",  joinColumns = {@JoinColumn(name = "suspension_id", referencedColumnName = "id", nullable = false)}),
})
public class DumpTrucksCrossCountryCapacity extends MiningMachinery{
    private Integer truck;
    private Integer loadingHeight;
    private String frame;
    private String fordingDepth;
    private String climableSlopes;
    private WheelArrangement wheelArrangement;;
    private List<Video> videos;
    private List<Photo> photos;

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

    @ManyToMany(mappedBy = "dumpTrucksCrossCountryCapacity")
    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}
