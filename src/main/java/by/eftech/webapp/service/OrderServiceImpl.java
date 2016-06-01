package by.eftech.webapp.service;

import by.eftech.webapp.model.Order;
import by.eftech.webapp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private OrderRepository repository;


    @Override
    public Order save(Order order) {
        return repository.save(order);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public Order get(int id) {
        return repository.findOne(id);
    }

    @Override
    public void update(Order order) {
        repository.save(order);
    }

    @Override
    public List<Order> getAll() {
        return repository.findAll();
    }
}
