package by.eftech.webapp.repository;


import by.eftech.webapp.model.Series;

import java.util.List;

public interface SeriesRepository {

    Series save(Series series);

    boolean delete(int id);

    Series get(int id);

    List<Series> getAll();
}
