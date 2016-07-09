package by.eftech.webapp.service.impl;

import by.eftech.webapp.model.Suspension;
import by.eftech.webapp.repository.SuspensionRepository;
import by.eftech.webapp.service.SuspensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuspensionServiceImpl implements SuspensionService {

    @Autowired
    private SuspensionRepository repository;


    @Override
    public List<Suspension> getAll() {
        return repository.getAll();
    }
}
