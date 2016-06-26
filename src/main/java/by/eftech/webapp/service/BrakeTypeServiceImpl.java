package by.eftech.webapp.service;


import by.eftech.webapp.model.BrakeType;
import by.eftech.webapp.repository.BrakeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrakeTypeServiceImpl implements BrakeTypeService {

    @Autowired
    private BrakeTypeRepository repository;



    @Override
    public List<BrakeType> getAll() {
        return repository.getAll();
    }
}
