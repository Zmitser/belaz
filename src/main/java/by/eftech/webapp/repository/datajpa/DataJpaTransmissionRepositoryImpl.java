package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.Transmission;
import by.eftech.webapp.repository.TransmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaTransmissionRepositoryImpl implements TransmissionRepository{

    private static final Sort SORT_NAME  = new Sort("name");
    @Autowired
    private ProxyTransmissionRepository repository;

    @Override
    public Transmission save(Transmission transmission) {
        return repository.save(transmission);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    @Override
    public Transmission get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<Transmission> getAll() {
        return repository.findAll(SORT_NAME);
    }
}
