package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "manufacturer_country", schema = "belaz")
@NamedQueries({
        @NamedQuery(name = ManufacturerCountry.DELETE, query = "DELETE from ManufacturerCountry m WHERE m.id=:id"),
        @NamedQuery(name = ManufacturerCountry.ALL_SORTED, query = "SELECT m FROM ManufacturerCountry m ORDER BY m.name"),
})
@Data
@NoArgsConstructor
public class ManufacturerCountry {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "manufacturerCountry")
    private List<TruckMining> truckMinings;
    @OneToMany(mappedBy = "manufacturerCountry")
    private List<DumpTrucksCrossCountryCapacity> dumpTrucksCrossCountryCapacities;
    public static final String DELETE = "ManufacturerCountry.delete";
    public static final String ALL_SORTED = "ManufacturerCountry.getAllSorted";
    public boolean newOject() {
        return (this.id == null);
    }
    public ManufacturerCountry(String name) {
        this.name = name;
    }


}
