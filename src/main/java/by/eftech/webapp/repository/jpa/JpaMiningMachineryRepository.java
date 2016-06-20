package by.eftech.webapp.repository.jpa;

import by.eftech.webapp.model.MiningMachinery;
import by.eftech.webapp.repository.MiningMachineryRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional(readOnly = true)
@Repository
public class JpaMiningMachineryRepository implements MiningMachineryRepository {


    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public MiningMachinery save(MiningMachinery user) {
        if (user.newOject()){
            em.persist(user);
            return user;
        }else {
            return em.merge(user);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(MiningMachinery.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public MiningMachinery get(int id) {
        return em.find(MiningMachinery.class, id);
    }

    @Override
    public List<MiningMachinery> getAll() {
        return em.createNamedQuery(MiningMachinery.ALL_SORTED, MiningMachinery.class).getResultList();
    }
}
