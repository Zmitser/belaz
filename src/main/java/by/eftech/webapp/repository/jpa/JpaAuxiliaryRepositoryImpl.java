package by.eftech.webapp.repository.jpa;

import by.eftech.webapp.repository.AuxiliaryRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional(readOnly = true)
@Repository
public class JpaAuxiliaryRepositoryImpl implements AuxiliaryRepository {


    @PersistenceContext
    private EntityManager em;


    @Override
    @Transactional
    public Auxiliary save(Auxiliary auxiliary) {
        if (auxiliary.newOject()) {
            em.persist(auxiliary);
            return auxiliary;
        } else {
            return em.merge(auxiliary);
        }

    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(Auxiliary.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public Auxiliary get(int id) {
        return em.find(Auxiliary.class, id);
    }

    @Override
    public List<Auxiliary> getAll() {
        return em.createNamedQuery(Auxiliary.ALL_SORTED, Auxiliary.class).getResultList();
    }
}
