package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.Item;
import by.eftech.webapp.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaItemRepositoryImpl implements ItemRepository{


    private static final Sort SORT_QUANTITY  = new Sort("quantity");
    @Autowired
    private ProxyItemRepository repository;

    @Override
    public Item save(Item item) {
        return repository.save(item);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    @Override
    public Item get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<Item> getAll() {
        return repository.findAll(SORT_QUANTITY);
    }
}
