package by.eftech.webapp.repository;


import by.eftech.webapp.model.DumpTrucksCrossCountryCapacity;

import java.util.List;

public interface DumpTrucksCrossCountryCapacityRepository {

    DumpTrucksCrossCountryCapacity save(DumpTrucksCrossCountryCapacity brakeType);

    boolean delete(int id);

    DumpTrucksCrossCountryCapacity get(int id);

    List<DumpTrucksCrossCountryCapacity> getAll();
}
