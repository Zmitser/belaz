package by.eftech.webapp.repository;


import java.util.List;

public interface RearWheelsRepository {

    RearWheels save(RearWheels manufacturerCountry);

    boolean delete(int id);

    RearWheels get(int id);

    List<RearWheels> getAll();
}
