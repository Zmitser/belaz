package by.eftech.webapp.service;


import by.eftech.webapp.model.Video;
import by.eftech.webapp.model.WheelArrangement;

import java.util.List;

public interface WheelArrangementService {

    WheelArrangement save(WheelArrangement truckMining);

    void delete(int id);

    WheelArrangement get(int id);

    void update(WheelArrangement truckMining);

    List<WheelArrangement> getAll();
}
