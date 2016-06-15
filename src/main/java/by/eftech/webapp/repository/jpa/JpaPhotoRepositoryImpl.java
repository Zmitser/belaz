package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.repository.PhotoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional(readOnly = true)
@Repository
public class JpaPhotoRepositoryImpl implements PhotoRepository{

    @PersistenceContext
    private EntityManager em;


    @Override
    @Transactional
    public Photo save(Photo photo) {
        if (photo.newOject()){
            em.persist(photo);
            return photo;
        }else {
            return em.merge(photo);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(Photo.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public Photo get(int id) {
        return em.find(Photo.class, id);
    }

    @Override
    public List<Photo> getAll() {
        return em.createNamedQuery(Photo.ALL_SORTED, Photo.class).getResultList();
    }
}
