package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.repository.FrontWheelsRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional(readOnly = true)
@Repository
public class JpaFrontWheelsRepositoryImpl implements FrontWheelsRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public FrontWheels save(FrontWheels frontWheels) {
        if (frontWheels.newOject()){
            em.persist(frontWheels);
            return frontWheels;
        }else {
            return em.merge(frontWheels);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(FrontWheels.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public FrontWheels get(int id) {
        return em.find(FrontWheels.class, id);
    }

    @Override
    public List<FrontWheels> getAll() {
        return em.createNamedQuery(FrontWheels.ALL_SORTED, FrontWheels.class).getResultList();
    }
}
