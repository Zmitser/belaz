package by.eftech.webapp.service;


import by.eftech.webapp.model.TruckMining;

import java.util.List;

public interface TruckMiningService {
    TruckMining save(TruckMining truckMining);

    List<TruckMining> getAll();

    void delete(int id);

    TruckMining get(int id);

    void update(TruckMining truckMining);

    public Iterable<TruckMining> findTruckMiningFilteredList(Integer[] manufacturer,
                                                             Integer[] manufacturerCountry,
                                                             Integer[] machineLocation,
                                                             Integer[] series,
                                                             Integer[] engineId,
                                                             Integer[] suspensionId,
                                                             Integer[] transmissionId,
                                                             Integer[] brakeTypeId,
                                                             Integer[] frontWheelId,
                                                             Integer[] rearWheelId,
                                                             Integer[] parkingBrakeId,
                                                             Integer[] auxiliaryId);
}
