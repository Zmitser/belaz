package by.eftech.webapp.service;

import by.eftech.webapp.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository repository;
    @Override
    public Item save(Item item) {
        return repository.save(item);
    }

    @Override
    public void delete(int id) {
            repository.delete(id);
    }

    @Override
    public Item get(int id) {
        return repository.get(id);
    }

    @Override
    public void update(Item item) {
            repository.save(item);
    }

    @Override
    public List<Item> getAll() {
        return repository.getAll();
    }
}
