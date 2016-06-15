package by.eftech.webapp.service;

import by.eftech.webapp.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    @Autowired
    private ManufacturerRepository repository;

    @Override
    public Manufacturer save(Manufacturer manufacturer) {
        return repository.save(manufacturer);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public Manufacturer get(int id) {
        return repository.get(id);
    }

    @Override
    public void update(Manufacturer manufacturer) {
        repository.save(manufacturer);
    }

    @Override
    public List<Manufacturer> getAll() {
        return repository.getAll();
    }
}
