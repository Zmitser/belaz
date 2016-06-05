package by.eftech.webapp.repository;


import by.eftech.webapp.model.Transmission;

import java.util.List;

public interface TransmissionRepository {

    Transmission save(Transmission transmission);

    boolean delete(int id);

    Transmission get(int id);

    List<Transmission> getAll();
}
