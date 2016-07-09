package by.eftech.webapp.service.impl;


import by.eftech.webapp.model.FrontWheels;
import by.eftech.webapp.repository.FrontWheelsRepository;
import by.eftech.webapp.service.FrontWheelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrontWheelsServiceImpl implements FrontWheelsService {

    @Autowired
    private FrontWheelsRepository repository;

    @Override
    public List<FrontWheels> getAll() {
        return repository.getAll();
    }
}
