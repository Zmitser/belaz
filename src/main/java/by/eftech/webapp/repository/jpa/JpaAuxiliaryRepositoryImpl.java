package by.eftech.webapp.repository.jpa;

import by.eftech.webapp.model.Auxiliary;
import by.eftech.webapp.repository.AuxiliaryRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional(readOnly = true)
@Repository
public class JpaAuxiliaryRepositoryImpl implements AuxiliaryRepository {


    @PersistenceContext
    private EntityManager em;



    @Override
    public List<Auxiliary> getAll() {
        return em.createNamedQuery(Auxiliary.ALL_SORTED, Auxiliary.class).getResultList();
    }
}
