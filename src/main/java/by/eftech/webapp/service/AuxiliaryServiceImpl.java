package by.eftech.webapp.service;

import by.eftech.webapp.model.Auxiliary;
import by.eftech.webapp.repository.AuxiliaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuxiliaryServiceImpl implements AuxiliaryService {

    @Autowired
    private AuxiliaryRepository repository;


    @Override
    public Auxiliary save(Auxiliary auxiliary) {
        return repository.save(auxiliary);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public Auxiliary get(int id) {
        return repository.findOne(id);
    }

    @Override
    public void update(Auxiliary auxiliary) {
        repository.save(auxiliary);
    }

    @Override
    public List<Auxiliary> getAll() {
        return repository.findAll();
    }
}
