package by.eftech.webapp.repository;


import java.util.List;

public interface VideoRepository {


    Video save(Video video);

    boolean delete(int id);

    Video get(int id);

    List<Video> getAll();
}
