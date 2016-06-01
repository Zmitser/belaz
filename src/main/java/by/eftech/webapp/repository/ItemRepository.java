package by.eftech.webapp.repository;

import by.eftech.webapp.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ItemRepository extends JpaRepository<Item, Integer>{
}
