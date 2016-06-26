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
    public List<WheelArrangement> getAll() {
        return em.createNamedQuery(WheelArrangement.ALL_SORTED, WheelArrangement.class).getResultList();
    }
}
