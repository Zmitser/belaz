package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.MachineLocation;
import by.eftech.webapp.repository.MachineLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaMachineLocationRepositoryImpl implements MachineLocationRepository{

    private static final Sort SORT_NAME  = new Sort("name");
    @Autowired
    private ProxyMachineLocationRepository repository;


    @Override
    public MachineLocation save(MachineLocation machineLocation) {
        return repository.save(machineLocation);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    @Override
    public MachineLocation get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<MachineLocation> getAll() {
        return repository.findAll(SORT_NAME);
    }
}
