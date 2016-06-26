package by.eftech.webapp.service;

import by.eftech.webapp.model.Item;
import by.eftech.webapp.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("itemServiceImpl")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository repository;

    @Override
    public List<Item> getAll() {
        return repository.getAll();
    }
}
