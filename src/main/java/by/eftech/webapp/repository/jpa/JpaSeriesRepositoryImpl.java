package by.eftech.webapp.repository.jpa;

import by.eftech.webapp.model.Series;
import by.eftech.webapp.repository.SeriesRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional(readOnly = true)
@Repository
public class JpaSeriesRepositoryImpl implements SeriesRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public Series save(Series series) {
        if (series.newOject()){
            em.persist(series);
            return series;
        }else {
            return em.merge(series);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(Series.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public Series get(int id) {
        return em.find(Series.class, id);
    }

    @Override
    public List<Series> getAll() {
        return em.createNamedQuery(Series.ALL_SORTED, Series.class).getResultList();
    }
}
