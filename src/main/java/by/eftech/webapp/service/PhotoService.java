package by.eftech.webapp.service;


import by.eftech.webapp.model.Photo;

import java.util.List;

public interface PhotoService {
    Photo save(Photo truckMining);

    void delete(int id);

    Photo get(int id);

    void update(Photo truckMining);

    List<Photo> getAll();
}
