package by.eftech.webapp.service;


import by.eftech.webapp.model.SellerOrder;

import java.util.List;

public interface OrderService {

    SellerOrder save(SellerOrder item);


    List<SellerOrder> getAll();
}
