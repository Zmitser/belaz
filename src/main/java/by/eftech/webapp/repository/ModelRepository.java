package by.eftech.webapp.repository;


import java.util.List;

public interface ModelRepository {

    Model save(Model manufacturerCountry);

    boolean delete(int id);

    Model get(int id);

    List<Model> getAll();
}
