package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Photo.DELETE, query = "DELETE from Photo v WHERE v.id=:id"),
        @NamedQuery(name = Photo.ALL_SORTED, query = "SELECT v FROM Photo v ORDER BY v.name"),
})
@Data
@NoArgsConstructor
public class Photo {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @ManyToMany
    @JoinTable(name = "dump_trucks_cross_country_capacity_has_photo",
            schema = "belaz", joinColumns = @JoinColumn(name = "photo_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "dump_trucks_cross_country_capacity_id", referencedColumnName = "id", nullable = false))
    private List<DumpTrucksCrossCountryCapacity> dumpTrucksCrossCountryCapacity;
    @ManyToMany
    @JoinTable(name = "truck_mining_has_photo", schema = "belaz",
            joinColumns = @JoinColumn(name = "photo_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "truck_mining_id", referencedColumnName = "id", nullable = false))
    private List<TruckMining> truckMinings;
    public static final String DELETE = "Photo.delete";
    public static final String ALL_SORTED = "Photo.getAllSorted";
    public boolean newOject() {
        return (this.id == null);
    }
    public Photo(String name) {
        this.name = name;
    }

}
