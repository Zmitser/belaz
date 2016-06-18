package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.ManufacturerCountry;
import by.eftech.webapp.repository.ManufacturerCountryRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional(readOnly = true)
@Repository
public class JpaManufacturerCountryRepositoryImpl implements ManufacturerCountryRepository {
    @PersistenceContext
    private EntityManager em;


    @Override
    @Transactional
    public ManufacturerCountry save(ManufacturerCountry manufacturerCountry) {
        if (manufacturerCountry.newOject()){
            em.persist(manufacturerCountry);
            return manufacturerCountry;
        }else {
            return em.merge(manufacturerCountry);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(ManufacturerCountry.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public ManufacturerCountry get(int id) {
        return em.find(ManufacturerCountry.class, id);
    }

    @Override
    public List<ManufacturerCountry> getAll() {
        return em.createNamedQuery(ManufacturerCountry.ALL_SORTED, ManufacturerCountry.class).getResultList();
    }
}
