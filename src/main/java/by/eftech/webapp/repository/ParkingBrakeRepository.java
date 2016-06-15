package by.eftech.webapp.repository;


import java.util.List;

public interface ParkingBrakeRepository {


    ParkingBrake save(ParkingBrake manufacturerCountry);

    boolean delete(int id);

    ParkingBrake get(int id);

    List<ParkingBrake> getAll();
}
