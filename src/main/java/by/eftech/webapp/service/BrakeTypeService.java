package by.eftech.webapp.service;

import java.util.List;


public interface BrakeTypeService {

    BrakeType save(BrakeType truckMining);

    void delete(int id);

    BrakeType get(int id);

    void update(BrakeType brakeType);

    List<BrakeType> getAll();
}
