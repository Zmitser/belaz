package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.SellerOrder;
import by.eftech.webapp.repository.SellerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaSellerOrderRepositoryImpl implements SellerOrderRepository{

    private static final Sort SORT_FULLNAME = new Sort("fullname");

    @Autowired
    private ProxyOrderRepository repository;


    @Override
    public SellerOrder save(SellerOrder order) {
        return repository.save(order);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) !=0 ;
    }

    @Override
    public SellerOrder get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<SellerOrder> getAll() {
        return repository.findAll(SORT_FULLNAME);
    }
}
