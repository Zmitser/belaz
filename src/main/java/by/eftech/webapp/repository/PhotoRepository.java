package by.eftech.webapp.repository;


import java.util.List;

public interface PhotoRepository {

    Photo save(Photo photo);

    boolean delete(int id);

    Photo get(int id);

    List<Photo> getAll();
}
