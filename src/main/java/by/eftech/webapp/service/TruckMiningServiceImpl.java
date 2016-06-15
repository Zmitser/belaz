package by.eftech.webapp.service;

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
        return repository.get(id);
    }

    @Override
    public void update(TruckMining truckMining) {
        repository.save(truckMining);
    }

    @Override
    public List<TruckMining> getAll() {
        return repository.getAll();
    }

    @Override
    public Iterable<TruckMining> findTruckMiningFilteredList(List<Integer> manufacturer,
                                                             List<Integer> manufacturerCountry,
                                                             List<Integer> machineLocation,
                                                             List<Integer> series,
                                                             List<Integer> engine,
                                                             List<Integer> suspension,
                                                             List<Integer> transmission,
                                                             List<Integer> brakeType,
                                                             List<Integer> frontWheel,
                                                             List<Integer> rearWheel,
                                                             List<Integer> parkingBrake,
                                                             List<Integer> auxiliary) {
        return repository.getFilteredList(manufacturer,
                manufacturerCountry,
                machineLocation,
                series,
                engine,
                suspension,
                transmission,
                brakeType,
                frontWheel,
                rearWheel,
                parkingBrake,
                auxiliary);

    }
}
