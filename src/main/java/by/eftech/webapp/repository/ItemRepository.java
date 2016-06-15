package by.eftech.webapp.repository;


import java.util.List;

public interface ItemRepository {

    Item save(Item item);

    boolean delete(int id);

    Item get(int id);

    List<Item> getAll();
}
