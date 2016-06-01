package by.eftech.webapp.service;

import by.eftech.webapp.model.Item;

import java.util.List;


public interface ItemService {

    Item save(Item item);

    void delete(int id);

    Item get(int id);

    void update(Item item);

    List<Item> getAll();
}
