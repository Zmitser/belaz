package by.eftech.webapp.service;


import by.eftech.webapp.model.FrontWheels;

import java.util.List;

public interface FrontWheelsService {

    FrontWheels save(FrontWheels truckMining);

    void delete(int id);

    FrontWheels get(int id);

    void update(FrontWheels truckMining);

    List<FrontWheels> getAll();
}
