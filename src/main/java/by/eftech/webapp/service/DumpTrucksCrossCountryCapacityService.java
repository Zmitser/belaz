package by.eftech.webapp.service;


import by.eftech.webapp.model.DumpTrucksCrossCountryCapacity;

import java.util.List;

public interface DumpTrucksCrossCountryCapacityService {
    DumpTrucksCrossCountryCapacity save(DumpTrucksCrossCountryCapacity machineLocation);

    void delete(int id);

    DumpTrucksCrossCountryCapacity get(int id);

    void update(DumpTrucksCrossCountryCapacity truckMining);

    List<DumpTrucksCrossCountryCapacity> getAll();
}
