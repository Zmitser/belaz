package by.eftech.webapp.repository;


import by.eftech.webapp.model.Photo;

import java.util.List;

public interface PhotoRepository {

    Photo save(Photo photo);

    boolean delete(int id);

    Photo get(int id);

    List<Photo> getAll();
}
