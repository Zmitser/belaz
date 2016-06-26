package by.eftech.webapp.service;

import by.eftech.webapp.model.SellerOrder;
import by.eftech.webapp.repository.SellerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private SellerOrderRepository repository;


    @Override
    public SellerOrder save(SellerOrder order) {
        return repository.save(order);
    }


    @Override
    public List<SellerOrder> getAll() {
        return repository.getAll();
    }
}
