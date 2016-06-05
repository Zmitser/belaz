package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.Auxiliary;
import by.eftech.webapp.repository.AuxiliaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaAuxiliaryRepositoryImpl implements AuxiliaryRepository{

    private static final Sort SORT_NAME  = new Sort("name");

    @Autowired
    private ProxyAuxiliaryRepository repository;


    @Override
    public Auxiliary save(Auxiliary auxiliary) {
        return repository.save(auxiliary);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    @Override
    public Auxiliary get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<Auxiliary> getAll() {
        return repository.findAll(SORT_NAME);
    }
}
