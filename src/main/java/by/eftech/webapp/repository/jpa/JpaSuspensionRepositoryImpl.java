package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.Suspension;
import by.eftech.webapp.repository.SuspensionRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;



@Transactional(readOnly = true)
@Repository
public class JpaSuspensionRepositoryImpl implements SuspensionRepository{

    @PersistenceContext
    private EntityManager em;



    @Override
    public List<Suspension> getAll() {
        return em.createNamedQuery(Suspension.ALL_SORTED, Suspension.class).getResultList();
    }
}
