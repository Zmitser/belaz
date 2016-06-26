package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.Photo;
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
    public List<Photo> getAll() {
        return em.createNamedQuery(Photo.ALL_SORTED, Photo.class).getResultList();
    }
}
