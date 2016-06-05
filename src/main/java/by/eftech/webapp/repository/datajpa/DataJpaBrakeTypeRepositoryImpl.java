package by.eftech.webapp.repository.datajpa;


import by.eftech.webapp.model.BrakeType;
import by.eftech.webapp.repository.BrakeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaBrakeTypeRepositoryImpl implements BrakeTypeRepository{

    private static final Sort SORT_NAME  = new Sort("name");
    @Autowired
    private ProxyBrakeTypeRepository repository;

    @Override
    public BrakeType save(BrakeType brakeType) {
        return repository.save(brakeType);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    @Override
    public BrakeType get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<BrakeType> getAll() {
        return repository.findAll(SORT_NAME);
    }
}
