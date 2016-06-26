package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.FrontWheels;
import by.eftech.webapp.repository.FrontWheelsRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional(readOnly = true)
@Repository
public class JpaFrontWheelsRepositoryImpl implements FrontWheelsRepository{

    @PersistenceContext
    private EntityManager em;



    @Override
    public List<FrontWheels> getAll() {
        return em.createNamedQuery(FrontWheels.ALL_SORTED, FrontWheels.class).getResultList();
    }
}
