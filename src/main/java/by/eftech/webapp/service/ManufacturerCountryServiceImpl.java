package by.eftech.webapp.service;


import by.eftech.webapp.repository.ManufacturerCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerCountryServiceImpl implements ManufacturerCountryService {

    @Autowired
    private ManufacturerCountryRepository repository;

    @Override
    public ManufacturerCountry save(ManufacturerCountry manufacturerCountry) {
        return repository.save(manufacturerCountry);
    }

    @Override
    public void delete(int id) {

        repository.delete(id);
    }

    @Override
    public ManufacturerCountry get(int id) {
        return repository.get(id);
    }

    @Override
    public void update(ManufacturerCountry manufacturerCountry) {
        repository.save(manufacturerCountry);
    }

    @Override
    public List<ManufacturerCountry> getAll() {
        return repository.getAll();
    }
}
