package by.eftech.webapp.service.impl;

import by.eftech.webapp.model.WheelArrangement;
import by.eftech.webapp.repository.WheelArrangementRepository;
import by.eftech.webapp.service.WheelArrangementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WheelArrangementServiceImpl implements WheelArrangementService {

    @Autowired
    private WheelArrangementRepository repository;

    @Override
    public List<WheelArrangement> getAll() {
        return repository.getAll();
    }
}
