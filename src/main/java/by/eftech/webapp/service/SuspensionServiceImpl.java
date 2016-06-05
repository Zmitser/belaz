package by.eftech.webapp.service;

import by.eftech.webapp.model.Suspension;
import by.eftech.webapp.repository.SuspensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuspensionServiceImpl implements SuspensionService {

    @Autowired
    private SuspensionRepository repository;

    @Override
    public Suspension save(Suspension suspension) {
        return repository.save(suspension);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public Suspension get(int id) {
        return repository.get(id);
    }

    @Override
    public void update(Suspension suspension) {
        repository.save(suspension);
    }

    @Override
    public List<Suspension> getAll() {
        return repository.getAll();
    }
}
