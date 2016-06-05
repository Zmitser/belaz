package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.Manufacturer;
import by.eftech.webapp.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaManufacturerRepositoryImpl implements ManufacturerRepository{

    private static final Sort SORT_NAME  = new Sort("name");
    @Autowired
    private ProxyManufacturerRepository repository;

    @Override
    public Manufacturer save(Manufacturer manufacturer) {
        return repository.save(manufacturer);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    @Override
    public Manufacturer get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<Manufacturer> getAll() {
        return repository.findAll(SORT_NAME);
    }
}
