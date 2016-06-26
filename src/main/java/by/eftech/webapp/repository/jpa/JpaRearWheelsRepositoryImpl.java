package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.RearWheels;
import by.eftech.webapp.repository.RearWheelsRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional(readOnly = true)
@Repository
public class JpaRearWheelsRepositoryImpl implements RearWheelsRepository{

    @PersistenceContext
    private EntityManager em;



    @Override
    public List<RearWheels> getAll() {
        return em.createNamedQuery(RearWheels.ALL_SORTED, RearWheels.class).getResultList();
    }
}
