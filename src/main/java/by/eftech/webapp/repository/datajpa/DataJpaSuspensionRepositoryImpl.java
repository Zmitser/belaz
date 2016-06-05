package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.Suspension;
import by.eftech.webapp.repository.SuspensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaSuspensionRepositoryImpl implements SuspensionRepository{


    private static final Sort SORT_NAME  = new Sort("name");
    @Autowired
    private ProxySuspensionRepository repository;


    @Override
    public Suspension save(Suspension suspension) {
        return repository.save(suspension);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != id;
    }

    @Override
    public Suspension get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<Suspension> getAll() {
        return repository.findAll(SORT_NAME);
    }
}
