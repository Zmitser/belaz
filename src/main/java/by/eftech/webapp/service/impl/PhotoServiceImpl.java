package by.eftech.webapp.service.impl;

import by.eftech.webapp.model.Photo;
import by.eftech.webapp.repository.PhotoRepository;
import by.eftech.webapp.service.PhotoService;
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
