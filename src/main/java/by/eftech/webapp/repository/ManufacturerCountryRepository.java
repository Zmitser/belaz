package by.eftech.webapp.repository;


import java.util.List;

public interface ManufacturerCountryRepository {
    ManufacturerCountry save(ManufacturerCountry manufacturerCountry);

    boolean delete(int id);

    ManufacturerCountry get(int id);

    List<ManufacturerCountry> getAll();
}
