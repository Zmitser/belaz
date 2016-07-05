package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Auxiliary.DELETE, query = "DELETE from Auxiliary a WHERE a.id=:id"),
        @NamedQuery(name = Auxiliary.ALL_SORTED, query = "SELECT a FROM Auxiliary a ORDER BY a.name"),
})
@Data
@NoArgsConstructor
public class Auxiliary {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "auxiliary")
    private List<TruckMining> truckMinings;
    public static final String DELETE = "Auxiliary.delete";
    public static final String ALL_SORTED = "Auxiliary.getAllSorted";
    public void setTruckMinings(List<TruckMining> truckMinings) {
        this.truckMinings = truckMinings;
    }
    public boolean newOject() {
        return (id == null);
    }
    public Auxiliary(String name) {
        this.name = name;
    }



}
