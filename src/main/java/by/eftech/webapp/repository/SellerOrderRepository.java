package by.eftech.webapp.repository;


import by.eftech.webapp.model.SellerOrder;

import java.util.List;

public interface SellerOrderRepository {
    List<SellerOrder> getAll();
    SellerOrder save(SellerOrder order);
}
