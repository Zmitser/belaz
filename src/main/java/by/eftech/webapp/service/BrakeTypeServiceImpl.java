package by.eftech.webapp.service;


import by.eftech.webapp.repository.BrakeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrakeTypeServiceImpl implements BrakeTypeService {

    @Autowired
    private BrakeTypeRepository repository;

    @Override
    public BrakeType save(BrakeType brakeType) {
        return repository.save(brakeType);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public BrakeType get(int id) {
        return repository.get(id);
    }

    @Override
    public void update(BrakeType brakeType) {
        repository.save(brakeType);
    }

    @Override
    public List<BrakeType> getAll() {
        return repository.getAll();
    }
}
