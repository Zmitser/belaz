package by.eftech.webapp.service;

import by.eftech.webapp.model.RearWheels;
import by.eftech.webapp.repository.RearWheelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RearWheelsServiceImpl implements RearWheelsService {

    @Autowired
    private RearWheelsRepository repository;

    @Override
    public RearWheels save(RearWheels rearWheels) {
        return repository.save(rearWheels);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public RearWheels get(int id) {
        return repository.get(id);
    }

    @Override
    public void update(RearWheels rearWheels) {
        repository.save(rearWheels);
    }

    @Override
    public List<RearWheels> getAll() {
        return repository.getAll();
    }
}
