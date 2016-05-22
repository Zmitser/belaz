package by.eftech.webapp.service;


import by.eftech.webapp.model.ParkingBrake;
import by.eftech.webapp.repository.ParkingBrakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingBrakeServiceImpl implements ParkingBrakeService {
    @Autowired
    private ParkingBrakeRepository repository;

    @Override
    public ParkingBrake save(ParkingBrake parkingBrake) {
        return repository.save(parkingBrake);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public ParkingBrake get(int id) {
        return repository.findOne(id);
    }

    @Override
    public void update(ParkingBrake parkingBrake) {
        repository.save(parkingBrake);
    }

    @Override
    public List<ParkingBrake> getAll() {
        return repository.findAll();
    }
}
