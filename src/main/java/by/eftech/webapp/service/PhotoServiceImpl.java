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
    public List<Photo> getAll() {
        return repository.getAll();
    }
}
