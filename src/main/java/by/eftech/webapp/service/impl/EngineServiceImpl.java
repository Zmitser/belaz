package by.eftech.webapp.service.impl;


import by.eftech.webapp.model.Engine;
import by.eftech.webapp.repository.EngineRepository;
import by.eftech.webapp.service.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineServiceImpl implements EngineService {

    @Autowired
    private EngineRepository repository;


    @Override
    public List<Engine> getAll() {
        return repository.getAll();
    }
}
