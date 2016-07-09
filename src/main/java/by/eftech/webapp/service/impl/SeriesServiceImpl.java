package by.eftech.webapp.service.impl;

import by.eftech.webapp.model.Series;
import by.eftech.webapp.repository.SeriesRepository;
import by.eftech.webapp.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesServiceImpl implements SeriesService {

    @Autowired
    private SeriesRepository repository;



    @Override
    public List<Series> getAll() {
        return repository.getAll();
    }
}
