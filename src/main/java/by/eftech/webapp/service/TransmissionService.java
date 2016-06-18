package by.eftech.webapp.service;

import by.eftech.webapp.model.Transmission;

import java.util.List;

public interface TransmissionService {

    Transmission save(Transmission truckMining);

    void delete(int id);

    Transmission get(int id);

    void update(Transmission truckMining);

    List<Transmission> getAll();
}
