package by.eftech.webapp.repository;


import by.eftech.webapp.model.FrontWheels;

import java.util.List;

public interface FrontWheelsRepository {

    FrontWheels save(FrontWheels brakeType);

    boolean delete(int id);

    FrontWheels get(int id);

    List<FrontWheels> getAll();
}
