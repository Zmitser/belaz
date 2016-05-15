package by.eftech.webapp.service;

import by.eftech.webapp.model.TruckMining;
import by.eftech.webapp.repository.TruckMiningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckMiningServiceImpl implements TruckMiningService {

    @Autowired
    private TruckMiningRepository repository;

    @Override
    public TruckMining save(TruckMining truckMining) {
        return repository.save(truckMining);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public TruckMining get(int id) {
        return  repository.findOne(id);
    }

    @Override
    public void update(TruckMining truckMining) {
        repository.save(truckMining);
    }

    @Override
    public List<TruckMining> getAll() {
        return repository.findAll();
    }
}
