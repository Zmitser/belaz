package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Model.DELETE, query = "DELETE from Model m WHERE m.id=:id"),
        @NamedQuery(name = Model.ALL_SORTED, query = "SELECT m FROM Model m ORDER BY m.name"),
})
@Data
@NoArgsConstructor
public class Model {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "series_id", referencedColumnName = "id", nullable = false)
    private Series series;
    @OneToMany(mappedBy = "model")
    private List<MiningMachinery> miningMachineries;
    public static final String DELETE = "Model.delete";
    public static final String ALL_SORTED = "Model.getAllSorted";
    public boolean newOject() {
        return (this.id == null);
    }
    public Model(String name, Series series) {
        this.name = name;
        this.series = series;
    }
}
