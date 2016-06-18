package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.Transmission;
import by.eftech.webapp.repository.TransmissionRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional(readOnly = true)
@Repository
public class JpaTransmissionRepositoryImpl implements TransmissionRepository{


    @PersistenceContext
    private EntityManager em;


    @Override
    @Transactional
    public Transmission save(Transmission transmission) {
        if (transmission.newOject()){
            em.persist(transmission);
            return transmission;
        }else {
            return em.merge(transmission);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(Transmission.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public Transmission get(int id) {
        return em.find(Transmission.class, id);
    }

    @Override
    public List<Transmission> getAll() {
        return em.createNamedQuery(Transmission.ALL_SORTED, Transmission.class).getResultList();
    }
}
