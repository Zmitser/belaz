package by.eftech.webapp.service;

import by.eftech.webapp.model.WheelArrangement;
import by.eftech.webapp.repository.VideoRepository;
import by.eftech.webapp.repository.WheelArrangementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WheelArrangementServiceImpl implements WheelArrangementService {

    @Autowired
    private WheelArrangementRepository repository;


    @Override
    public WheelArrangement save(WheelArrangement truckMining) {
        return repository.save(truckMining);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public WheelArrangement get(int id) {
        return repository.get(id);
    }

    @Override
    public void update(WheelArrangement truckMining) {
        repository.save(truckMining);
    }

    @Override
    public List<WheelArrangement> getAll() {
        return repository.getAll();
    }
}
