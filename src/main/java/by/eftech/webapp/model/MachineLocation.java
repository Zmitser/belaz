package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "machine_location", schema = "belaz")
@NamedQueries({
        @NamedQuery(name = MachineLocation.DELETE, query = "DELETE from MachineLocation l WHERE l.id=:id"),
        @NamedQuery(name = MachineLocation.ALL_SORTED, query = "SELECT l FROM MachineLocation l ORDER BY l.name"),
})
@Data
@NoArgsConstructor
public class MachineLocation {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "machine_location_id", nullable = false)
    private DumpTrucksCrossCountryCapacity dumpTrucksCrossCountryCapacity;
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "machine_location_id", nullable = false)
    private TruckMining truckMinings;
    public static final String DELETE = "MachineLocation.delete";
    public static final String ALL_SORTED = "MachineLocation.getAllSorted";
    public boolean newOject() {
        return (this.id == null);
    }
    public MachineLocation(String name) {
        this.name = name;
    }



}
