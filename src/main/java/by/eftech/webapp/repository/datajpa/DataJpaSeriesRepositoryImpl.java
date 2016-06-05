package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.Series;
import by.eftech.webapp.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaSeriesRepositoryImpl implements SeriesRepository{


    private static final Sort SORT_NAME  = new Sort("name");
    @Autowired
    private ProxySeriesRepository repository;

    @Override
    public Series save(Series series) {
        return repository.save(series);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    @Override
    public Series get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<Series> getAll() {
        return repository.findAll(SORT_NAME);
    }
}
