package by.eftech.webapp.service;


import by.eftech.webapp.model.DumpTrucksCrossCountryCapacity;

import java.util.List;

public interface DumpTrucksCrossCountryCapacityService {
    DumpTrucksCrossCountryCapacity save(DumpTrucksCrossCountryCapacity machineLocation);

    void delete(int id);

    DumpTrucksCrossCountryCapacity get(int id);

    void update(DumpTrucksCrossCountryCapacity truckMining);

    List<DumpTrucksCrossCountryCapacity> getAll();

    Iterable<DumpTrucksCrossCountryCapacity> getFilteredList(List<Integer> manufacturer,
                                          List<Integer> manufacturerCountry,
                                          List<Integer> machineLocation,
                                          List<Integer> series,
                                          List<Integer> engine,
                                          List<Integer> suspension,
                                          List<Integer> transmission,
                                          List<Integer> wheelArrangement);
}
