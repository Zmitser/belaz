package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "wheel_arrangement", schema = "belaz")
@NamedQueries({
        @NamedQuery(name = WheelArrangement.DELETE, query = "DELETE from WheelArrangement v WHERE v.id=:id"),
        @NamedQuery(name = WheelArrangement.ALL_SORTED, query = "SELECT v FROM WheelArrangement v ORDER BY v.name"),
})
public class WheelArrangement {
    private Integer id;
    private String name;
    private List<DumpTrucksCrossCountryCapacity> dumpTrucksCapacity;


    public static final String DELETE = "WheelArrangement.delete";
    public static final String ALL_SORTED = "WheelArrangement.getAllSorted";

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WheelArrangement that = (WheelArrangement) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "wheelArrangement")
    public List<DumpTrucksCrossCountryCapacity> getDumpTrucksCapacity() {
        return dumpTrucksCapacity;
    }

    public void setDumpTrucksCapacity(List<DumpTrucksCrossCountryCapacity> dumpTrucksCapacity) {
        this.dumpTrucksCapacity = dumpTrucksCapacity;
    }
    public boolean newOject() {
        return (this.id == null);
    }

    public WheelArrangement(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public WheelArrangement(String name) {
        this.name = name;
    }

    public WheelArrangement() {
    }

}
