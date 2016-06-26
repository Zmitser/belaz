package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.BrakeType;
import by.eftech.webapp.repository.BrakeTypeRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;



@Transactional(readOnly = true)
@Repository
public class JpaBrakeTypeRepositoryImpl implements BrakeTypeRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<BrakeType> getAll() {
        return em.createNamedQuery(BrakeType.ALL_SORTED, BrakeType.class).getResultList();
    }
}
