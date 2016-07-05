package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Transmission.DELETE, query = "DELETE from Transmission t WHERE t.id=:id"),
        @NamedQuery(name = Transmission.ALL_SORTED, query = "SELECT t FROM Transmission t ORDER BY t.name"),
})
@Data
@NoArgsConstructor
public class Transmission {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "transmission")
    private List<MiningMachinery> miningMachineries;
    public static final String DELETE = "Transmission.delete";
    public static final String ALL_SORTED = "Transmission.getAllSorted";
    public boolean newOject() {
        return (this.id == null);
    }
    public Transmission(String name) {
        this.name = name;
    }

}
