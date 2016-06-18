package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.Photo;
import by.eftech.webapp.model.RearWheels;
import by.eftech.webapp.repository.RearWheelsRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional(readOnly = true)
@Repository
public class JpaRearWheelsRepositoryImpl implements RearWheelsRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public RearWheels save(RearWheels rearWheels) {
        if (rearWheels.newOject()){
            em.persist(rearWheels);
            return rearWheels;
        }else {
            return em.merge(rearWheels);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(Photo.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public RearWheels get(int id) {
        return em.find(RearWheels.class, id);
    }

    @Override
    public List<RearWheels> getAll() {
        return em.createNamedQuery(RearWheels.ALL_SORTED, RearWheels.class).getResultList();
    }
}
