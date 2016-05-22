package by.eftech.webapp.service;

import by.eftech.webapp.model.ParkingBrake;

import java.util.List;

public interface ParkingBrakeService {

    ParkingBrake save(ParkingBrake truckMining);

    void delete(int id);

    ParkingBrake get(int id);

    void update(ParkingBrake truckMining);

    List<ParkingBrake> getAll();
}
