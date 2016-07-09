package by.eftech.webapp.service.impl;

import by.eftech.webapp.model.RearWheels;
import by.eftech.webapp.repository.RearWheelsRepository;
import by.eftech.webapp.service.RearWheelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RearWheelsServiceImpl implements RearWheelsService {

    @Autowired
    private RearWheelsRepository repository;


    @Override
    public List<RearWheels> getAll() {
        return repository.getAll();
    }
}
