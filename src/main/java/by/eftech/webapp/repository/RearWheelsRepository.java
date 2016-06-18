package by.eftech.webapp.repository;


import by.eftech.webapp.model.RearWheels;

import java.util.List;

public interface RearWheelsRepository {

    RearWheels save(RearWheels manufacturerCountry);

    boolean delete(int id);

    RearWheels get(int id);

    List<RearWheels> getAll();
}
