package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.FrontWheels;
import by.eftech.webapp.repository.FrontWheelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaFrontWheelsRepositoryImpl implements FrontWheelsRepository {

    private static final Sort SORT_NAME  = new Sort("name");
    @Autowired
    private ProxyFrontWheelsRepository repository;

    @Override
    public FrontWheels save(FrontWheels frontWheels) {
        return repository.save(frontWheels);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    @Override
    public FrontWheels get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<FrontWheels> getAll() {
        return repository.findAll(SORT_NAME);
    }
}
