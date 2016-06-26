package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.Item;
import by.eftech.webapp.repository.ItemRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional(readOnly = true)
@Repository
public class JpaItemRepositoryImpl implements ItemRepository{

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Item> getAll() {
        return em.createNamedQuery(Item.ALL_SORTED, Item.class).getResultList();
    }
}
