package by.eftech.webapp.service.impl;


import by.eftech.webapp.model.Model;
import by.eftech.webapp.repository.ModelRepository;
import by.eftech.webapp.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelRepository repository;


    @Override
    public List<Model> getAll() {
        return repository.getAll();
    }
}
