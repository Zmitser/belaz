package by.eftech.webapp.repository.jpa;

import by.eftech.webapp.model.DumpTrucksCrossCountryCapacity;
import by.eftech.webapp.repository.DumpTrucksCrossCountryCapacityRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional(readOnly = true)
@Repository
public class JpaDumpTrucksCrossCountryCapacityImpl implements DumpTrucksCrossCountryCapacityRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public DumpTrucksCrossCountryCapacity save(DumpTrucksCrossCountryCapacity brakeType) {
        if (brakeType.newOject()) {
            em.persist(brakeType);
            return brakeType;
        } else {
            return em.merge(brakeType);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(DumpTrucksCrossCountryCapacity.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public DumpTrucksCrossCountryCapacity get(int id) {
        return em.find(DumpTrucksCrossCountryCapacity.class, id);
    }

    @Override
    public List<DumpTrucksCrossCountryCapacity> getAll() {
        return em.createNamedQuery(DumpTrucksCrossCountryCapacity.ALL_SORTED, DumpTrucksCrossCountryCapacity.class).getResultList();
    }
}
