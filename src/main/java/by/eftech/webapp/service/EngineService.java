package by.eftech.webapp.service;


import by.eftech.webapp.model.Engine;

import java.util.List;

public interface EngineService {

    Engine save(Engine truckMining);

    void delete(int id);

    Engine get(int id);

    void update(Engine truckMining);

    List<Engine> getAll();
}
