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
    public List<ManufacturerCountry> getAll() {
        return em.createNamedQuery(ManufacturerCountry.ALL_SORTED, ManufacturerCountry.class).getResultList();
    }
}
