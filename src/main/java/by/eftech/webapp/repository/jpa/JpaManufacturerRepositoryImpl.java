package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.Manufacturer;
import by.eftech.webapp.repository.ManufacturerRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional(readOnly = true)
@Repository
public class JpaManufacturerRepositoryImpl implements ManufacturerRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public Manufacturer save(Manufacturer manufacturer) {
        if (manufacturer.newOject()){
            em.persist(manufacturer);
            return manufacturer;
        }else {
            return em.merge(manufacturer);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(Manufacturer.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public Manufacturer get(int id) {
        return em.find(Manufacturer.class, id);
    }

    @Override
    public List<Manufacturer> getAll() {
        return em.createNamedQuery(Manufacturer.ALL_SORTED, Manufacturer.class).getResultList();
    }
}
