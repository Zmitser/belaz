package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.Engine;
import by.eftech.webapp.repository.EngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaEngineRepositoryImpl implements EngineRepository{


    private static final Sort SORT_NAME  = new Sort("name");
    @Autowired
    private ProxyEngineRepository repository;



    @Override
    public Engine save(Engine engine) {
        return repository.save(engine);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    @Override
    public Engine get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<Engine> getAll() {
        return repository.findAll(SORT_NAME);
    }
}
