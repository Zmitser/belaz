package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.Engine;
import by.eftech.webapp.repository.EngineRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional(readOnly = true)
@Repository
public class JpaEngineRepositoryImpl implements EngineRepository{

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Engine> getAll() {
        return em.createNamedQuery(Engine.ALL_SORTED, Engine.class).getResultList();
    }
}
