package by.eftech.webapp.service;


import java.util.List;

public interface PhotoService {
    Photo save(Photo truckMining);

    void delete(int id);

    Photo get(int id);

    void update(Photo truckMining);

    List<Photo> getAll();
}
