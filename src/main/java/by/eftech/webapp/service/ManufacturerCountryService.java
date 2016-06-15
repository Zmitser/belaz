package by.eftech.webapp.service;


import java.util.List;

public interface ManufacturerCountryService {

    ManufacturerCountry save(ManufacturerCountry manufacturerCountry);

    void delete(int id);

    ManufacturerCountry get(int id);

    void update(ManufacturerCountry truckMining);

    List<ManufacturerCountry> getAll();
}
