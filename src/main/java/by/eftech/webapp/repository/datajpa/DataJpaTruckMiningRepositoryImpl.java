package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.QTruckMining;
import by.eftech.webapp.model.TruckMining;
import by.eftech.webapp.repository.TruckMiningRepository;
import com.mysema.query.types.expr.BooleanExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaTruckMiningRepositoryImpl implements TruckMiningRepository {


    @Autowired
    private ProxyTruckMiningRepository repository;

    @Override
    public TruckMining save(TruckMining truckMining) {
        return repository.save(truckMining);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    @Override
    public TruckMining get(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<TruckMining> getAll() {
        return repository.findAll();
    }

    @Override
    public Iterable<TruckMining> getFilteredList(List<Integer> manufacturer, List<Integer> manufacturerCountry, List<Integer> machineLocation, List<Integer> series, List<Integer> engine, List<Integer> suspension, List<Integer> transmission, List<Integer> brakeType, List<Integer> frontWheel, List<Integer> rearWheel, List<Integer> parkingBrake, List<Integer> auxiliary) {
        QTruckMining mining = QTruckMining.truckMining;
        Iterable<TruckMining> truckMinings;
        BooleanExpression in = mining.isNotNull();
        if (manufacturer != null && manufacturer.size() > 0) {
            in = in.and(mining.manufacturer.id.in(manufacturer));
        }
        if (manufacturerCountry != null && manufacturerCountry.size() > 0) {
            in = in.and(mining.manufacturerCountry.id.in(manufacturerCountry));
        }
        if (machineLocation != null && machineLocation.size() > 0) {
            in = in.and(mining.machineLocation.id.in(machineLocation));
        }
        if (series != null && series.size() > 0) {
            in = in.and(mining.model.series.id.in(series));
        }
        if (engine != null && engine.size() > 0) {
            in = in.and(mining.engine.id.in(engine));
        }
        if (suspension != null && suspension.size() > 0) {
            in = in.and(mining.suspension.id.in(suspension));
        }
        if (transmission != null && transmission.size() > 0) {
            in = in.and(mining.transmission.id.in(transmission));
        }
        if (brakeType != null && brakeType.size() > 0) {
            in = in.and(mining.brakeType.id.in(brakeType));
        }
        if (frontWheel != null && frontWheel.size() > 0) {
            in = in.and(mining.frontWheels.id.in(frontWheel));
        }
        if (rearWheel != null && rearWheel.size() > 0) {
            in = in.and(mining.rearWheels.id.in(rearWheel));
        }

        if (parkingBrake != null && parkingBrake.size() > 0) {
            in = in.and(mining.parkingBrake.id.in(parkingBrake));
        }
        if (auxiliary != null && auxiliary.size() > 0) {
            in = in.and(mining.auxiliary.id.in(auxiliary));
        }

        truckMinings = repository.findAll(in);
        return truckMinings;

    }


}
