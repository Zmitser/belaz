package by.eftech.webapp.service;


import by.eftech.webapp.model.TruckMining;

import java.util.List;

public interface TruckMiningService {
    TruckMining save(TruckMining truckMining);

    void delete(int id);

    TruckMining get(int id);

    void update(TruckMining truckMining);

    List<TruckMining> getAll();
}
