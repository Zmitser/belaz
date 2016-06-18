package by.eftech.webapp.service;


import by.eftech.webapp.model.FrontWheels;
import by.eftech.webapp.repository.FrontWheelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrontWheelsServiceImpl implements FrontWheelsService {

    @Autowired
    private FrontWheelsRepository repository;

    @Override
    public FrontWheels save(FrontWheels frontWheels) {
        return repository.save(frontWheels);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public FrontWheels get(int id) {
        return repository.get(id);
    }

    @Override
    public void update(FrontWheels frontWheels) {
        repository.save(frontWheels);
    }

    @Override
    public List<FrontWheels> getAll() {
        return repository.getAll();
    }
}
