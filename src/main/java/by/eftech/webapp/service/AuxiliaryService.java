package by.eftech.webapp.service;


import java.util.List;

public interface AuxiliaryService {

    Auxiliary save(Auxiliary truckMining);

    void delete(int id);

    Auxiliary get(int id);

    void update(Auxiliary auxiliary);

    List<Auxiliary> getAll();
}
