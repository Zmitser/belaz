package by.eftech.webapp.service;


import by.eftech.webapp.model.DumpTrucksCrossCountryCapacity;
import by.eftech.webapp.repository.DumpTrucksCrossCountryCapacityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DumpTrucksCrossCountryCapacityServiceImpl implements DumpTrucksCrossCountryCapacityService {


    @Autowired
    private DumpTrucksCrossCountryCapacityRepository repository;

    @Override
    public DumpTrucksCrossCountryCapacity save(DumpTrucksCrossCountryCapacity machineLocation) {
        return repository.save(machineLocation);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public DumpTrucksCrossCountryCapacity get(int id) {
        return repository.get(id);
    }

    @Override
    public void update(DumpTrucksCrossCountryCapacity truckMining) {
        repository.save(truckMining);
    }

    @Override
    public List<DumpTrucksCrossCountryCapacity> getAll() {
        return repository.getAll();
    }
}