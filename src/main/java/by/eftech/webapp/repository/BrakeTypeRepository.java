package by.eftech.webapp.repository;


import java.util.List;

public interface BrakeTypeRepository {


    BrakeType save(BrakeType brakeType);

    boolean delete(int id);

    BrakeType get(int id);

    List<BrakeType> getAll();
}
