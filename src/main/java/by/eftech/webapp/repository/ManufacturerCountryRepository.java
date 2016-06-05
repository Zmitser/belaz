package by.eftech.webapp.repository;


import by.eftech.webapp.model.ManufacturerCountry;

import java.util.List;

public interface ManufacturerCountryRepository {
    ManufacturerCountry save(ManufacturerCountry manufacturerCountry);

    boolean delete(int id);

    ManufacturerCountry get(int id);

    List<ManufacturerCountry> getAll();
}
