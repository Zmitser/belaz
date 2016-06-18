package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Model.DELETE, query = "DELETE from Model m WHERE m.id=:id"),
        @NamedQuery(name = Model.ALL_SORTED, query = "SELECT m FROM Model m ORDER BY m.name"),
})
public class Model {
    private Integer id;
    private String name;
    private Series series;
    private List<MiningMachinery> miningMachineries;


    public static final String DELETE = "Model.delete";
    public static final String ALL_SORTED = "Model.getAllSorted";

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

        Model model = (Model) o;

        if (id != null ? !id.equals(model.id) : model.id != null) return false;
        if (name != null ? !name.equals(model.name) : model.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "series_id", referencedColumnName = "id", nullable = false)
    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }


    @OneToMany(mappedBy = "model")
    public List<MiningMachinery> getMiningMachineries() {
        return miningMachineries;
    }

    public void setMiningMachineries(List<MiningMachinery> miningMachineries) {
        this.miningMachineries = miningMachineries;
    }


    public boolean newOject() {
        return (this.id == null);
    }

    public Model(String name, Integer id, Series series) {
        this.name = name;
        this.id = id;
        this.series = series;
    }

    public Model(String name, Series series) {
        this.name = name;
        this.series = series;
    }

    public Model() {
    }
}
