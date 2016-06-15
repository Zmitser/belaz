package by.eftech.webapp.repository;


import java.util.List;

public interface EngineRepository {

    Engine save(Engine brakeType);

    boolean delete(int id);

    Engine get(int id);

    List<Engine> getAll();
}
