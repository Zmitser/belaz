package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.Series;
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
    @Transactional
    public Suspension save(Suspension suspension) {
        if (suspension.newOject()){
            em.persist(suspension);
            return suspension;
        }else {
            return em.merge(suspension);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(Series.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public Suspension get(int id) {
        return em.find(Suspension.class, id);
    }

    @Override
    public List<Suspension> getAll() {
        return em.createNamedQuery(Suspension.ALL_SORTED, Suspension.class).getResultList();
    }
}
