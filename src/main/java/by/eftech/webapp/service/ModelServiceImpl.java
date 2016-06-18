package by.eftech.webapp.service;


import by.eftech.webapp.model.Model;
import by.eftech.webapp.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelRepository repository;

    @Override
    public Model save(Model model) {
        return repository.save(model);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public Model get(int id) {
        return repository.get(id);
    }

    @Override
    public void update(Model model) {
        repository.save(model);
    }

    @Override
    public List<Model> getAll() {
        return repository.getAll();
    }
}
