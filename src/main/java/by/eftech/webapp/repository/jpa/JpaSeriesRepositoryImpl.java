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
    public List<Series> getAll() {
        return em.createNamedQuery(Series.ALL_SORTED, Series.class).getResultList();
    }
}
