package by.eftech.webapp.service;


import java.util.List;

public interface SuspensionService {

    Suspension save(Suspension truckMining);

    void delete(int id);

    Suspension get(int id);

    void update(Suspension truckMining);

    List<Suspension> getAll();
}
