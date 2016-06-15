package by.eftech.webapp.service;


import by.eftech.webapp.repository.EngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineServiceImpl implements EngineService {

    @Autowired
    private EngineRepository repository;

    @Override
    public Engine save(Engine engine) {
        return repository.save(engine);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public Engine get(int id) {

        return repository.get(id);
    }

    @Override
    public void update(Engine engine) {
        repository.save(engine);
    }

    @Override
    public List<Engine> getAll() {
        return repository.getAll();
    }
}
