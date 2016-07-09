package by.eftech.webapp.service.impl;

import by.eftech.webapp.model.Manufacturer;
import by.eftech.webapp.repository.ManufacturerRepository;
import by.eftech.webapp.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    @Autowired
    private ManufacturerRepository repository;


    @Override
    public List<Manufacturer> getAll() {
        return repository.getAll();
    }
}
