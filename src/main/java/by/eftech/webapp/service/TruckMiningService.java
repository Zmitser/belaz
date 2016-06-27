package by.eftech.webapp.service;


import by.eftech.webapp.model.TruckMining;

import java.util.List;

public interface TruckMiningService {
    TruckMining save(TruckMining truckMining);

    List<TruckMining> getAll();

    void delete(int id);

    TruckMining get(int id);

    void update(TruckMining truckMining);
    List<TruckMining> getAllByDate();
    public Iterable<TruckMining> findTruckMiningFilteredList(List<Integer> manufacturer,
                                                             List<Integer> manufacturerCountry,
                                                             List<Integer> machineLocation,
                                                             List<Integer> series,
                                                             List<Integer> engineId,
                                                             List<Integer> suspensionId,
                                                             List<Integer> transmissionId,
                                                             List<Integer> brakeTypeId,
                                                             List<Integer> frontWheelId,
                                                             List<Integer> rearWheelId,
                                                             List<Integer> parkingBrakeId,
                                                             List<Integer> auxiliaryId);
}
