package by.eftech.webapp.service;


import by.eftech.webapp.model.Manufacturer;
import by.eftech.webapp.model.MiningMachinery;

import javax.validation.constraints.Min;
import java.util.List;

public interface MiningMachineryService {

    MiningMachinery save(MiningMachinery truckMining);

    void delete(int id);

    MiningMachinery get(int id);

    void update(MiningMachinery truckMining);

    List<MiningMachinery> getAll();
}
