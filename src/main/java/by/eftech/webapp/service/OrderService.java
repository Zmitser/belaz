package by.eftech.webapp.service;


import by.eftech.webapp.model.Order;

import java.util.List;

public interface OrderService {

    Order save(Order item);

    void delete(int id);

    Order get(int id);

    void update(Order order);

    List<Order> getAll();
}
