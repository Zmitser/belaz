package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.Video;
import by.eftech.webapp.repository.VideoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Transactional(readOnly = true)
@Repository

public class JpaVideoRepositoryImpl  implements VideoRepository{

    @PersistenceContext
    private EntityManager em;



    @Override
    public List<Video> getAll() {
        return em.createNamedQuery(Video.ALL_SORTED, Video.class).getResultList();
    }
}
