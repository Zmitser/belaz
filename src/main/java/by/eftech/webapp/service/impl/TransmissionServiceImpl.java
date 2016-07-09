package by.eftech.webapp.service.impl;

import by.eftech.webapp.model.Transmission;
import by.eftech.webapp.repository.TransmissionRepository;
import by.eftech.webapp.service.TransmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransmissionServiceImpl implements TransmissionService {

    @Autowired
    private TransmissionRepository repository;


    @Override
    public List<Transmission> getAll() {
        return repository.getAll();
    }
}
