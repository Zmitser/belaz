package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Engine.DELETE, query = "DELETE from Engine e WHERE e.id=:id"),
        @NamedQuery(name = Engine.ALL_SORTED, query = "SELECT e FROM Engine e ORDER BY e.name"),
})
@Data
@NoArgsConstructor
public class Engine {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "engine")
    private List<MiningMachinery> miningMachineries;;

    public static final String DELETE = "Engine.delete";
    public static final String ALL_SORTED = "Engine.getAllSorted";

    public boolean newOject() {
        return (this.id == null);
    }

    public Engine(String name) {
        this.name = name;
    }

}
