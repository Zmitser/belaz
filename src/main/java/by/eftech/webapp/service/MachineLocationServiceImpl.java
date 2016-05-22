package by.eftech.webapp.service;


import by.eftech.webapp.model.MachineLocation;
import by.eftech.webapp.repository.MachineLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MachineLocationServiceImpl implements MachineLocationService {

    @Autowired
    private MachineLocationRepository repository;

    @Override
    public MachineLocation save(MachineLocation machineLocation) {
        return repository.save(machineLocation);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public MachineLocation get(int id) {
        return repository.findOne(id);
    }

    @Override
    public void update(MachineLocation machineLocation) {
        repository.save(machineLocation);
    }

    @Override
    public List<MachineLocation> getAll() {
        return repository.findAll();
    }
}
