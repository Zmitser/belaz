package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.FrontWheels;
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
    @Transactional
    public Item save(Item item) {
        if (item.newOject()){
            em.persist(item);
            return item;
        }else {
            return em.merge(item);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(FrontWheels.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public Item get(int id) {
        return em.find(Item.class, id);
    }

    @Override
    public List<Item> getAll() {
        return em.createNamedQuery(Item.ALL_SORTED, Item.class).getResultList();
    }
}
