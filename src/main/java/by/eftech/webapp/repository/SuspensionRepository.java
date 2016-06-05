package by.eftech.webapp.repository;


import by.eftech.webapp.model.Suspension;

import java.util.List;

public interface SuspensionRepository {

    Suspension save(Suspension suspension);

    boolean delete(int id);

    Suspension get(int id);

    List<Suspension> getAll();
}
