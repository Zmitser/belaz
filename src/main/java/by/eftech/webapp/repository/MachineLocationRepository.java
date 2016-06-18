package by.eftech.webapp.repository;


import by.eftech.webapp.model.MachineLocation;

import java.util.List;

public interface MachineLocationRepository {

    MachineLocation save(MachineLocation machineLocation);

    boolean delete(int id);

    MachineLocation get(int id);

    List<MachineLocation> getAll();
}
