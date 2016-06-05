package by.eftech.webapp.service;

import by.eftech.webapp.model.Photo;
import by.eftech.webapp.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoRepository repository;

    @Override
    public Photo save(Photo photo) {
        return repository.save(photo);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Photo get(int id) {
        return repository.get(id);
    }

    @Override
    public void update(Photo photo) {
        repository.save(photo);
    }

    @Override
    public List<Photo> getAll() {
        return repository.getAll();
    }
}
