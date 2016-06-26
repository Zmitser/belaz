package by.eftech.webapp.repository.jpa;


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
    public List<MachineCondition> getAll() {
        return em.createNamedQuery(MachineCondition.ALL_SORTED, MachineCondition.class).getResultList();
    }
}
