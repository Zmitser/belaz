package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.Model;
import by.eftech.webapp.repository.ModelRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional(readOnly = true)
@Repository
public class JpaModelRepositoryImpl implements ModelRepository{

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Model> getAll() {
        return em.createNamedQuery(Model.ALL_SORTED, Model.class).getResultList();
    }
}
