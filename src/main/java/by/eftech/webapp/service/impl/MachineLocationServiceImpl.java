package by.eftech.webapp.service.impl;


import by.eftech.webapp.model.MachineLocation;
import by.eftech.webapp.repository.MachineLocationRepository;
import by.eftech.webapp.service.MachineLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MachineLocationServiceImpl implements MachineLocationService {

    @Autowired
    private MachineLocationRepository repository;


    @Override
    public List<MachineLocation> getAll() {
        return repository.getAll();
    }
}
