package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.WheelArrangement;
import by.eftech.webapp.repository.WheelArrangementRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional(readOnly = true)
@Repository
public class JpaWheelArrangementRepositoryImpl implements WheelArrangementRepository{

    @PersistenceContext
    private EntityManager em;


    @Override
    @Transactional
    public WheelArrangement save(WheelArrangement brakeType) {
        if (brakeType.newOject()) {
            em.persist(brakeType);
            return brakeType;
        } else {
            return em.merge(brakeType);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(WheelArrangement.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public WheelArrangement get(int id) {
        return em.find(WheelArrangement.class, id);
    }

    @Override
    public List<WheelArrangement> getAll() {
        return em.createNamedQuery(WheelArrangement.ALL_SORTED, WheelArrangement.class).getResultList();
    }
}
