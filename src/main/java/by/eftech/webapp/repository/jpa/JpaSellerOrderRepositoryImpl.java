package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.SellerOrder;
import by.eftech.webapp.repository.SellerOrderRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional(readOnly = true)
@Repository
public class JpaSellerOrderRepositoryImpl implements SellerOrderRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public SellerOrder save(SellerOrder order) {
        if (order.newOject()){
            em.persist(order);
            return order;
        }else {
            return em.merge(order);
        }
    }


    @Override
    public List<SellerOrder> getAll() {
        return em.createNamedQuery(SellerOrder.ALL_SORTED, SellerOrder.class).getResultList();
    }
}
