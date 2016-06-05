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
    @Transactional
    public Model save(Model model) {
        if (model.newOject()){
            em.persist(model);
            return model;
        }else {
            return em.merge(model);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(Model.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public Model get(int id) {
        return em.find(Model.class, id);
    }

    @Override
    public List<Model> getAll() {
        return em.createNamedQuery(Model.ALL_SORTED, Model.class).getResultList();
    }
}
