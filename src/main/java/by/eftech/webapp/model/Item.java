package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Lenovo on 15.06.2016.
 */
@Entity
public class Item {
    private Integer id;
    private Integer quantity;
    private MiningMachinery miningMachinery;
    private List<Order> orders;

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
    @JoinTable(name = "order_has_item", catalog = "", schema = "belaz", joinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false))
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
