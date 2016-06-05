package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.ManufacturerCountry;
import by.eftech.webapp.repository.ManufacturerCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaManufacturerCountryRepositoryImpl implements ManufacturerCountryRepository{

    private static final Sort SORT_NAME  = new Sort("name");
    @Autowired
    private ProxyManufacturerCountryRepository repository;

    @Override
    public ManufacturerCountry save(ManufacturerCountry manufacturerCountry) {
        return repository.save(manufacturerCountry);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    @Override
    public ManufacturerCountry get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<ManufacturerCountry> getAll() {
        return repository.findAll(SORT_NAME);
    }
}
