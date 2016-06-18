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
    public MachineLocation save(MachineLocation machineLocation) {
        if (machineLocation.newOject()){
            em.persist(machineLocation);
            return machineLocation;
        }else {
            return em.merge(machineLocation);
        }
    }

    @Override
    public boolean delete(int id) {
        return em.createNamedQuery(MachineLocation.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public MachineLocation get(int id) {
         return em.find(MachineLocation.class, id);
    }

    @Override
    public List<MachineLocation> getAll() {
        return em.createNamedQuery(MachineLocation.ALL_SORTED, MachineLocation.class).getResultList();
    }
}
