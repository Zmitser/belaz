package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Video.DELETE, query = "DELETE from Video v WHERE v.id=:id"),
        @NamedQuery(name = Video.ALL_SORTED, query = "SELECT v FROM Video v ORDER BY v.name"),
})
@Data
@NoArgsConstructor
public class Video {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @ManyToMany
    @JoinTable(name = "dump_trucks_cross_country_capacity_has_video", schema = "belaz",
            joinColumns = @JoinColumn(name = "video_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "dump_trucks_cross_country_capacity_id", referencedColumnName = "id", nullable = false))
    private List<DumpTrucksCrossCountryCapacity> dumpTrucksCrossCountryCapacity;
    @ManyToMany
    @JoinTable(name = "truck_mining_has_video", schema = "belaz",
            joinColumns = @JoinColumn(name = "video_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "truck_mining_id", referencedColumnName = "id", nullable = false))
    private List<TruckMining> truckMinings;
    public static final String DELETE = "Video.delete";
    public static final String ALL_SORTED = "Video.getAllSorted";
    public boolean newOject() {
        return (this.id == null);
    }
    public Video(String name) {
        this.name = name;
    }

}
