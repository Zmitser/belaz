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
    public List<Manufacturer> getAll() {
        return em.createNamedQuery(Manufacturer.ALL_SORTED, Manufacturer.class).getResultList();
    }
}
