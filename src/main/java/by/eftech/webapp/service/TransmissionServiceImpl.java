package by.eftech.webapp.service;

import by.eftech.webapp.model.Transmission;
import by.eftech.webapp.repository.TransmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransmissionServiceImpl implements TransmissionService {

    @Autowired
    private TransmissionRepository repository;

    @Override
    public Transmission save(Transmission transmission) {
        return repository.save(transmission);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public Transmission get(int id) {
        return repository.findOne(id);
    }

    @Override
    public void update(Transmission transmission) {
repository.save(transmission);
    }

    @Override
    public List<Transmission> getAll() {
        return repository.findAll();
    }
}
