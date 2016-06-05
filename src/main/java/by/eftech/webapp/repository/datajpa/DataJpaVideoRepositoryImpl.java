package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.Video;
import by.eftech.webapp.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaVideoRepositoryImpl implements VideoRepository{

    private static final Sort SORT_NAME  = new Sort("name");
    @Autowired
    private ProxyVideoRepository repository;

    @Override
    public Video save(Video video) {
        return repository.save(video);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    @Override
    public Video get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<Video> getAll() {
        return repository.findAll(SORT_NAME);
    }
}
