package by.eftech.webapp.repository;


import by.eftech.webapp.model.SellerOrder;

import java.util.List;

public interface SellerOrderRepository {

    SellerOrder save(SellerOrder manufacturerCountry);

    boolean delete(int id);

    SellerOrder get(int id);

    List<SellerOrder> getAll();
}
