package by.eftech.webapp.repository;


import java.util.List;

public interface MachineLocationRepository {

    MachineLocation save(MachineLocation machineLocation);

    boolean delete(int id);

    MachineLocation get(int id);

    List<MachineLocation> getAll();
}
