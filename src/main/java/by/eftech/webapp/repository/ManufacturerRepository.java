package by.eftech.webapp.repository;

import by.eftech.webapp.model.Manufacturer;

import java.util.List;


public interface ManufacturerRepository {

    Manufacturer save(Manufacturer manufacturer);

    boolean delete(int id);

    Manufacturer get(int id);

    List<Manufacturer> getAll();
}
