package by.eftech.webapp.repository.jpa;


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

    @Transactional
    @Override
    public Video save(Video video) {
        if (video.newOject()){
            em.persist(video);
            return video;
        }else {
            return em.merge(video);
        }
    }
    @Transactional
    @Override
    public boolean delete(int id) {
        return em.createNamedQuery(Video.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public Video get(int id) {
        return em.find(Video.class, id);
    }

    @Override
    public List<Video> getAll() {
        return em.createNamedQuery(Video.ALL_SORTED, Video.class).getResultList();
    }
}
