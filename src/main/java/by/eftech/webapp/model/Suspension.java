package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Suspension.DELETE, query = "DELETE from Suspension s WHERE s.id=:id"),
        @NamedQuery(name = Suspension.ALL_SORTED, query = "SELECT s FROM Suspension s ORDER BY s.name"),
})
public class Suspension {
    private Integer id;
    private String name;
    private List<MiningMachinery> miningMachineries;



    public static final String DELETE = "Suspension.delete";
    public static final String ALL_SORTED = "Suspension.getAllSorted";

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

        Suspension that = (Suspension) o;

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


    @OneToMany(mappedBy = "suspension")
    public List<MiningMachinery> getMiningMachineries() {
        return miningMachineries;
    }

    public void setMiningMachineries(List<MiningMachinery> miningMachineries) {
        this.miningMachineries = miningMachineries;
    }


    public boolean newOject() {
        return (this.id == null);
    }
    public Suspension(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Suspension(String name) {
        this.name = name;
    }

    public Suspension() {
    }
}
