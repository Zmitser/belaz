package by.eftech.webapp.service.impl;


import by.eftech.webapp.model.ManufacturerCountry;
import by.eftech.webapp.repository.ManufacturerCountryRepository;
import by.eftech.webapp.service.ManufacturerCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerCountryServiceImpl implements ManufacturerCountryService {

    @Autowired
    private ManufacturerCountryRepository repository;


    @Override
    public List<ManufacturerCountry> getAll() {
        return repository.getAll();
    }
}
