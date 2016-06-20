package by.eftech.webapp.service;


import by.eftech.webapp.model.MiningMachinery;

import java.util.List;

public interface MiningMachineryService {

    MiningMachinery save(MiningMachinery truckMining);

    void delete(int id);

    MiningMachinery get(int id);

    void update(MiningMachinery truckMining);

    List<MiningMachinery> getAll();
}
