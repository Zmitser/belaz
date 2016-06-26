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
    public List<ParkingBrake> getAll() {
        return repository.getAll();
    }
}
