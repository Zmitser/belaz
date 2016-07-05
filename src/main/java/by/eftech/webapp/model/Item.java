package by.eftech.webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Item.DELETE, query = "DELETE from Item i WHERE i.id=:id"),
        @NamedQuery(name = Item.ALL_SORTED, query = "SELECT i FROM Item i ORDER BY i.quantity"),
})
@Data
@NoArgsConstructor
public class Item {
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "quantity")
    private Integer quantity;
    @OneToOne
    @JoinColumn(name = "mining machinery_id", referencedColumnName = "id", nullable = false)
    private MiningMachinery miningMachinery;
    @ManyToMany
    @JoinTable(name = "order_has_item", schema = "belaz",
            joinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false))
    private List<SellerOrder> orders;
    public static final String DELETE = "JpaItemRepositoryImpl.delete";
    public static final String ALL_SORTED = "JpaItemRepositoryImpl.getAllSorted";
    public boolean newOject() {
        return (this.id == null);
    }
    public Item(Integer quantity, MiningMachinery truckMining) {
        this.quantity = quantity;
        this.miningMachinery = truckMining;
    }

}
