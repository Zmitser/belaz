package by.eftech.webapp.service;


import by.eftech.webapp.model.FrontWheels;
import by.eftech.webapp.repository.FrontWheelsRepository;
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
