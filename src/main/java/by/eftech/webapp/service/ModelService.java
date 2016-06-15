package by.eftech.webapp.service;


import java.util.List;

public interface ModelService {


    Model save(Model truckMining);

    void delete(int id);

    Model get(int id);

    void update(Model truckMining);

    List<Model> getAll();
}
