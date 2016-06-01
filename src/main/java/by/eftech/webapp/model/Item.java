package by.eftech.webapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "item")
public class Item extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "truck_mining_id")
    private TruckMining truckMining;

    @Column(name = "quantity")
    private Integer quantity;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "items")
    private List<Order> orders;

    public Item() {
    }

    public TruckMining getTruckMining() {
        return truckMining;
    }

    public void setTruckMining(TruckMining truckMining) {
        this.truckMining = truckMining;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "truckMining=" + truckMining +
                ", quantity=" + quantity +
                '}';
    }

    public Item(TruckMining truckMining, Integer quantity) {
        this.truckMining = truckMining;
        this.quantity = quantity;
    }

    public Item(Integer id, TruckMining truckMining, Integer quantity) {
        super(id);
        this.truckMining = truckMining;
        this.quantity = quantity;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
