package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Engine.DELETE, query = "DELETE from Engine e WHERE e.id=:id"),
        @NamedQuery(name = Engine.ALL_SORTED, query = "SELECT e FROM Engine e ORDER BY e.name"),
})
public class Engine {
    private Integer id;
    private String name;
    private List<MiningMachinery> miningMachineries;;


    public static final String DELETE = "Engine.delete";
    public static final String ALL_SORTED = "Engine.getAllSorted";

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

        Engine engine = (Engine) o;

        if (id != null ? !id.equals(engine.id) : engine.id != null) return false;
        if (name != null ? !name.equals(engine.name) : engine.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }



    @OneToMany(mappedBy = "engine")
    public List<MiningMachinery> getMiningMachineries() {
        return miningMachineries;
    }

    public void setMiningMachineries(List<MiningMachinery> miningMachineries) {
        this.miningMachineries = miningMachineries;
    }


    public boolean newOject() {
        return (this.id == null);
    }

    public Engine(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Engine(String name) {
        this.name = name;
    }

    public Engine() {
    }
}
