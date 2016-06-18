package by.eftech.webapp.repository;


import by.eftech.webapp.model.Engine;

import java.util.List;

public interface EngineRepository {

    Engine save(Engine brakeType);

    boolean delete(int id);

    Engine get(int id);

    List<Engine> getAll();
}
