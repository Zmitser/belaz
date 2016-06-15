package by.eftech.webapp.repository;


import java.util.List;

public interface SellerOrderRepository {

    SellerOrder save(SellerOrder manufacturerCountry);

    boolean delete(int id);

    SellerOrder get(int id);

    List<SellerOrder> getAll();
}
