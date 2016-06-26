package by.eftech.webapp.repository.jpa;

import by.eftech.webapp.model.MachineLocation;
import by.eftech.webapp.repository.MachineLocationRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional(readOnly = true)
@Repository
public class JpaMachineLocationRepositoryImpl implements MachineLocationRepository{

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<MachineLocation> getAll() {
        return em.createNamedQuery(MachineLocation.ALL_SORTED, MachineLocation.class).getResultList();
    }
}
