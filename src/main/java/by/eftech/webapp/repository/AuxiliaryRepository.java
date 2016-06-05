package by.eftech.webapp.repository;


import by.eftech.webapp.model.Auxiliary;

import java.util.List;

public interface AuxiliaryRepository {

    Auxiliary save(Auxiliary auxiliary);

    boolean delete(int id);

    Auxiliary get(int id);

    List<Auxiliary> getAll();

}
