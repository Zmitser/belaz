package by.eftech.webapp.service;

import by.eftech.webapp.model.Manufacturer;

import java.util.List;

public interface ManufacturerService {
    Manufacturer save(Manufacturer truckMining);

    void delete(int id);

    Manufacturer get(int id);

    void update(Manufacturer truckMining);

    List<Manufacturer> getAll();
}
