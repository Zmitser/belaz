package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.MachineCondition;
import by.eftech.webapp.repository.MachineConditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaMachineConditionRepositoryImpl implements MachineConditionRepository{

    private static final Sort SORT_NAME  = new Sort("quantity");
    @Autowired
    private ProxyMachineConditionRepository repository;

    @Override
    public MachineCondition save(MachineCondition item) {
        return repository.save(item);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    @Override
    public MachineCondition get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<MachineCondition> getAll() {
        return repository.findAll(SORT_NAME);
    }
}
