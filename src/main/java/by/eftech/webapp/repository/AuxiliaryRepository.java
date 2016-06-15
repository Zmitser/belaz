package by.eftech.webapp.repository;


import java.util.List;

public interface AuxiliaryRepository {

    Auxiliary save(Auxiliary auxiliary);

    boolean delete(int id);

    Auxiliary get(int id);

    List<Auxiliary> getAll();

}
