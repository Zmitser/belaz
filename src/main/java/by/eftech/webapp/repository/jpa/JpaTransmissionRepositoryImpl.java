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
    public List<Transmission> getAll() {
        return em.createNamedQuery(Transmission.ALL_SORTED, Transmission.class).getResultList();
    }
}
