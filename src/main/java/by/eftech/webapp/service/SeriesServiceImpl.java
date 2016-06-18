package by.eftech.webapp.service;

import by.eftech.webapp.model.Series;
import by.eftech.webapp.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesServiceImpl implements SeriesService {

    @Autowired
    private SeriesRepository repository;

    @Override
    public Series save(Series series) {
        return repository.save(series);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public Series get(int id) {
        return repository.get(id);
    }

    @Override
    public void update(Series series) {
        repository.save(series);
    }

    @Override
    public List<Series> getAll() {
        return repository.getAll();
    }
}
