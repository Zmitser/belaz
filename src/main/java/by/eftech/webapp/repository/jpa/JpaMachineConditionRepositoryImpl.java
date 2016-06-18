package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.FrontWheels;
import by.eftech.webapp.model.MachineCondition;
import by.eftech.webapp.repository.MachineConditionRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional(readOnly = true)
@Repository
public class JpaMachineConditionRepositoryImpl implements MachineConditionRepository{

    @PersistenceContext
    private EntityManager em;


    @Override
    @Transactional
    public MachineCondition save(MachineCondition condition) {
        if (condition.newOject()){
            em.persist(condition);
            return condition;
        }else {
            return em.merge(condition);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(FrontWheels.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public MachineCondition get(int id) {
        return em.find(MachineCondition.class, id);
    }

    @Override
    public List<MachineCondition> getAll() {
        return em.createNamedQuery(MachineCondition.ALL_SORTED, MachineCondition.class).getResultList();
    }
}
