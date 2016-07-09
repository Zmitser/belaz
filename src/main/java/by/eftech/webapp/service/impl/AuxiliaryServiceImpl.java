package by.eftech.webapp.service.impl;

import by.eftech.webapp.model.Auxiliary;
import by.eftech.webapp.repository.AuxiliaryRepository;
import by.eftech.webapp.service.AuxiliaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuxiliaryServiceImpl implements AuxiliaryService {

    @Autowired
    private AuxiliaryRepository repository;

    @Override
    public List<Auxiliary> getAll() {
        return repository.getAll();
    }
}
