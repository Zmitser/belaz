package by.eftech.webapp.service;


import java.util.List;

public interface VideoService {

    Video save(Video truckMining);

    void delete(int id);

    Video get(int id);

    void update(Video truckMining);

    List<Video> getAll();
}
