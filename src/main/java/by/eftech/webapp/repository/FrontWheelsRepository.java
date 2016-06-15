package by.eftech.webapp.repository;


import java.util.List;

public interface FrontWheelsRepository {

    FrontWheels save(FrontWheels brakeType);

    boolean delete(int id);

    FrontWheels get(int id);

    List<FrontWheels> getAll();
}
