package by.eftech.webapp.service;


import by.eftech.webapp.model.Video;
import by.eftech.webapp.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoRepository repository;


    @Override
    public Video save(Video video) {
        return repository.save(video);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public Video get(int id) {
        return repository.get(id);
    }

    @Override
    public void update(Video video) {
        repository.save(video);
    }

    @Override
    public List<Video> getAll() {
        return repository.getAll();
    }
}
