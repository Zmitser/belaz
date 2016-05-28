package by.eftech.webapp.utils;


import by.eftech.webapp.model.TruckMining;

public class Item {

    private TruckMining truckMining = new TruckMining();

    private Integer quantity;

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


}
