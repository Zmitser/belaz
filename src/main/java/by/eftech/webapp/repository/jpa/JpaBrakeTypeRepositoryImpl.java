package by.eftech.webapp.repository.jpa;


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
    @Transactional
    public BrakeType save(BrakeType brakeType) {
        if (brakeType.newOject()){
            em.persist(brakeType);
            return brakeType;
        }else {
            return em.merge(brakeType);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(BrakeType.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public BrakeType get(int id) {
        return em.find(BrakeType.class, id);
    }

    @Override
    public List<BrakeType> getAll() {
        return em.createNamedQuery(BrakeType.ALL_SORTED, BrakeType.class).getResultList();
    }
}
