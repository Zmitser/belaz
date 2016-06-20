package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;


@Entity
@NamedQueries({
        @NamedQuery(name = Item.DELETE, query = "DELETE from Item i WHERE i.id=:id"),
        @NamedQuery(name = Item.ALL_SORTED, query = "SELECT i FROM Item i ORDER BY i.quantity"),
})
public class Item {
    private Integer id;
    private Integer quantity;
    private MiningMachinery miningMachinery;
    private List<SellerOrder> orders;

    public static final String DELETE = "JpaItemRepositoryImpl.delete";
    public static final String ALL_SORTED = "JpaItemRepositoryImpl.getAllSorted";

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (id != null ? !id.equals(item.id) : item.id != null) return false;
        if (quantity != null ? !quantity.equals(item.quantity) : item.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "mining machinery_id", referencedColumnName = "id", nullable = false)
    public MiningMachinery getMiningMachinery() {
        return miningMachinery;
    }

    public void setMiningMachinery(MiningMachinery miningMachinery) {
        this.miningMachinery = miningMachinery;
    }

    @ManyToMany
    @JoinTable(name = "order_has_item", schema = "belaz", joinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false))
    public List<SellerOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<SellerOrder> orders) {
        this.orders = orders;
    }


    public boolean newOject() {
        return (this.id == null);
    }

    public Item(Integer id, Integer quantity, MiningMachinery truckMining) {
        this.id = id;
        this.quantity = quantity;
        this.miningMachinery = truckMining;
    }

    public Item(Integer quantity, MiningMachinery truckMining) {
        this.quantity = quantity;
        this.miningMachinery = truckMining;
    }

    public Item() {
    }
}
