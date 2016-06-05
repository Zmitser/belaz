package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.Model;
import by.eftech.webapp.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaModelRepositoryImpl implements ModelRepository{

    private static final Sort SORT_NAME  = new Sort("name");
    @Autowired
    private ProxyModelRepository repository;


    @Override
    public Model save(Model model) {
        return repository.save(model);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    @Override
    public Model get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<Model> getAll() {
        return repository.findAll(SORT_NAME);
    }
}
