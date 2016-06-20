package by.eftech.webapp.repository;


import by.eftech.webapp.model.DumpTrucksCrossCountryCapacity;
import by.eftech.webapp.model.WheelArrangement;

import java.util.List;

public interface WheelArrangementRepository {

    WheelArrangement save(WheelArrangement brakeType);

    boolean delete(int id);

    WheelArrangement get(int id);

    List<WheelArrangement> getAll();
}
