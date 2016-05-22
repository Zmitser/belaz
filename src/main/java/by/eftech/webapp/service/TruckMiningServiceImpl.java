package by.eftech.webapp.service;

import by.eftech.webapp.model.QTruckMining;
import by.eftech.webapp.model.TruckMining;
import by.eftech.webapp.repository.TruckMiningRepository;
import com.mysema.query.types.expr.BooleanExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckMiningServiceImpl implements TruckMiningService {

    @Autowired
    private TruckMiningRepository repository;

    @Override
    public TruckMining save(TruckMining truckMining) {
        return repository.save(truckMining);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public TruckMining get(int id) {
        return repository.findOne(id);
    }

    @Override
    public void update(TruckMining truckMining) {
        repository.save(truckMining);
    }

    @Override
    public List<TruckMining> getAll() {
        return repository.findAll();
    }

    @Override
    public Iterable<TruckMining> findTruckMiningFilteredList(Integer[] manufacturer,
                                                             Integer[] manufacturerCountry,
                                                             Integer[] machineLocation,
                                                             Integer[] series,
                                                             Integer[] engine,
                                                             Integer[] suspension,
                                                             Integer[] transmission,
                                                             Integer[] brakeType,
                                                             Integer[] frontWheel,
                                                             Integer[] rearWheel,
                                                             Integer[] parkingBrake,
                                                             Integer[] auxiliary) {
        QTruckMining mining = QTruckMining.truckMining;
        Iterable<TruckMining> truckMinings;
        BooleanExpression in = mining.isNotNull();
        if (manufacturer != null && manufacturer.length > 0) {
            in = in.and(mining.manufacturer.id.in(manufacturer));
        }
        if (manufacturerCountry != null && manufacturerCountry.length > 0) {
            in = in.and(mining.country.id.in(manufacturerCountry));
        }
        if (machineLocation != null && machineLocation.length > 0) {
            in = in.and(mining.location.id.in(machineLocation));
        }
        if (series != null && series.length > 0) {
            in = in.and(mining.model.series.id.in(series));
        }
        if (engine != null && engine.length > 0) {
            in = in.and(mining.engine.id.in(engine));
        }
        if (suspension != null && suspension.length > 0) {
            in = in.and(mining.suspension.id.in(suspension));
        }
        if (transmission != null && transmission.length > 0) {
            in = in.and(mining.transmission.id.in(transmission));
        }
        if (brakeType != null && brakeType.length > 0) {
            in = in.and(mining.brakeType.id.in(brakeType));
        }
        if (frontWheel != null && frontWheel.length > 0) {
            in = in.and(mining.frontWheels.id.in(frontWheel));
        }
        if (rearWheel != null && rearWheel.length > 0) {
            in = in.and(mining.rearWheels.id.in(rearWheel));
        }

        if (parkingBrake != null && parkingBrake.length > 0) {
            in = in.and(mining.parkingBrake.id.in(parkingBrake));
        }
        if (auxiliary != null && auxiliary.length > 0) {
            in = in.and(mining.auxiliary.id.in(auxiliary));
        }

        truckMinings = repository.findAll(in);
        return truckMinings;

    }

}
