package by.eftech.webapp.service;


import java.util.List;

public interface RearWheelsService {

    RearWheels save(RearWheels truckMining);

    void delete(int id);

    RearWheels get(int id);

    void update(RearWheels truckMining);

    List<RearWheels> getAll();
}
