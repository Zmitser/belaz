package by.eftech.webapp.repository;


import by.eftech.webapp.model.MiningMachinery;

import java.util.List;

public interface MiningMachineryRepository {


    MiningMachinery save(MiningMachinery brakeType);

    boolean delete(int id);

    MiningMachinery get(int id);

    List<MiningMachinery> getAll();
}
