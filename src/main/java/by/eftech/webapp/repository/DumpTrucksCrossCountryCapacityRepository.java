package by.eftech.webapp.repository;


import by.eftech.webapp.model.DumpTrucksCrossCountryCapacity;

import java.util.List;

public interface DumpTrucksCrossCountryCapacityRepository {

    DumpTrucksCrossCountryCapacity save(DumpTrucksCrossCountryCapacity brakeType);

    boolean delete(int id);

    DumpTrucksCrossCountryCapacity get(int id);

    List<DumpTrucksCrossCountryCapacity> getAll();
    List<DumpTrucksCrossCountryCapacity> getAllByDate();


    Iterable<DumpTrucksCrossCountryCapacity> getFilteredList(List<Integer> manufacturer,
                                          List<Integer> manufacturerCountry,
                                          List<Integer> machineLocation,
                                          List<Integer> series,
                                          List<Integer> engine,
                                          List<Integer> suspension,
                                          List<Integer> transmission,
                                          List<Integer> wheelArrangement);
}
