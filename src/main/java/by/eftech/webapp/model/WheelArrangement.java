package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Lenovo on 15.06.2016.
 */
@Entity
@Table(name = "wheel_arrangement", schema = "belaz", catalog = "")
public class WheelArrangement {
    private Integer id;
    private String name;
    private List<DumpTrucksCrossCountryCapacity> dumpTrucksCapacity;

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
}
