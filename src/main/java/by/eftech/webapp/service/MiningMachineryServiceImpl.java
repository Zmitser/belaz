package by.eftech.webapp.service;


import by.eftech.webapp.model.MiningMachinery;
import by.eftech.webapp.repository.MiningMachineryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MiningMachineryServiceImpl implements MiningMachineryService {

    @Autowired
    private MiningMachineryRepository repository;

    @Override
    public MiningMachinery save(MiningMachinery machineLocation) {
        return repository.save(machineLocation);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public MiningMachinery get(int id) {
        return repository.get(id);
    }

    @Override
    public void update(MiningMachinery truckMining) {
        repository.save(truckMining);
    }

    @Override
    public List<MiningMachinery> getAll() {
        return repository.getAll();
    }
}
