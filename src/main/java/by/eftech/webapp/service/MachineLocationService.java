package by.eftech.webapp.service;


import java.util.List;

public interface MachineLocationService {

    MachineLocation save(MachineLocation machineLocation);

    void delete(int id);

    MachineLocation get(int id);

    void update(MachineLocation truckMining);

    List<MachineLocation> getAll();
}
