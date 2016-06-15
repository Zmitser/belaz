package by.eftech.webapp.service;


import java.util.List;

public interface SeriesService {

    Series save(Series truckMining);

    void delete(int id);

    Series get(int id);

    void update(Series truckMining);

    List<Series> getAll();
}
