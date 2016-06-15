package by.eftech.webapp.repository;


import java.util.List;

public interface SuspensionRepository {

    Suspension save(Suspension suspension);

    boolean delete(int id);

    Suspension get(int id);

    List<Suspension> getAll();
}
