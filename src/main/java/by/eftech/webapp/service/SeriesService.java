package by.eftech.webapp.service;


import by.eftech.webapp.model.Series;

import java.util.List;

public interface SeriesService {

    Series save(Series truckMining);

    void delete(int id);

    Series get(int id);

    void update(Series truckMining);

    List<Series> getAll();
}
