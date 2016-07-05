package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "wheel_arrangement", schema = "belaz")
@NamedQueries({
        @NamedQuery(name = WheelArrangement.DELETE, query = "DELETE from WheelArrangement v WHERE v.id=:id"),
        @NamedQuery(name = WheelArrangement.ALL_SORTED, query = "SELECT v FROM WheelArrangement v ORDER BY v.name"),
})
@Data
@NoArgsConstructor
public class WheelArrangement {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "wheelArrangement")
    private List<DumpTrucksCrossCountryCapacity> dumpTrucksCapacity;
    public static final String DELETE = "WheelArrangement.delete";
    public static final String ALL_SORTED = "WheelArrangement.getAllSorted";
    public WheelArrangement(String name) {
        this.name = name;
    }

}
