package by.eftech.webapp.service;


import by.eftech.webapp.model.SellerOrder;

import java.util.List;

public interface OrderService {

    SellerOrder save(SellerOrder item);

    void delete(int id);

    SellerOrder get(int id);

    void update(SellerOrder order);

    List<SellerOrder> getAll();
}
