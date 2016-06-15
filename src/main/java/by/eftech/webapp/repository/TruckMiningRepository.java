package by.eftech.webapp.repository;


import java.util.List;

public interface TruckMiningRepository {


    TruckMining save(TruckMining truckMining);

    boolean delete(int id);

    TruckMining get(int id);

    List<TruckMining> getAll();

    Iterable<TruckMining> getFilteredList(List<Integer> manufacturer,
                                          List<Integer> manufacturerCountry,
                                          List<Integer> machineLocation,
                                          List<Integer> series,
                                          List<Integer> engine,
                                          List<Integer> suspension,
                                          List<Integer> transmission,
                                          List<Integer> brakeType,
                                          List<Integer> frontWheel,
                                          List<Integer> rearWheel,
                                          List<Integer> parkingBrake,
                                          List<Integer> auxiliary);
}
