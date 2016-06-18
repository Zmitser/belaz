package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.TruckMining;
import by.eftech.webapp.repository.TruckMiningRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;
import java.util.List;


@Transactional(readOnly = true)
@Repository
public class JpaTruckMiningRepositoryImpl implements TruckMiningRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    @Override
    public TruckMining save(TruckMining truckMining) {
        if (truckMining.newOject()) {
            em.persist(truckMining);
            return truckMining;
        } else {
            return em.merge(truckMining);
        }
    }


    @Transactional
    @Override
    public boolean delete(int id) {
        return em.createNamedQuery(TruckMining.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public TruckMining get(int id) {
        return em.find(TruckMining.class, id);
    }

    @Override
    public List<TruckMining> getAll() {
        return em.createNamedQuery(TruckMining.ALL_SORTED, TruckMining.class).getResultList();
    }

    @Override
    public Iterable<TruckMining> getFilteredList(List<Integer> manufacturer,
                                                 List<Integer> manufacturerCountry,
                                                 List<Integer> machineLocation,
                                                 List<Integer> series,
                                                 List<Integer> engine,
                                                 List<Integer> suspension,
                                                 List<Integer> transmission,
                                                 List<Integer> brakeType,
                                                 List<Integer> frontWheel,
                                                 List<Integer> rearWheel,
                                                 List<Integer> parkingBrake,
                                                 List<Integer> auxiliary) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<TruckMining> query = cb.createQuery(TruckMining.class);
        Root<TruckMining> truckMiningRoot = query.from(TruckMining.class);
        Path<Integer> manufacturerProperty = truckMiningRoot.get("manufacturer").get("id");
        Path<Integer> manufacturerCountryProperty = truckMiningRoot.get("manufacturerCountry").get("id");
        Path<Integer> machineLocationProperty = truckMiningRoot.get("machineLocation").get("id");
        Path<Integer> seriesProperty = truckMiningRoot.get("model").get("series").get("id");
        Path<Integer> engineProperty = truckMiningRoot.get("engine").get("id");
        Path<Integer> suspensionProperty = truckMiningRoot.get("suspension").get("id");
        Path<Integer> transmissionProperty = truckMiningRoot.get("transmission").get("id");
        Path<Integer> brakeTypeProperty = truckMiningRoot.get("brakeType").get("id");
        Path<Integer> frontWheelProperty = truckMiningRoot.get("frontWheels").get("id");
        Path<Integer> rearWheelProperty = truckMiningRoot.get("rearWheels").get("id");
        Path<Integer> parkingBrakeProperty = truckMiningRoot.get("parkingBrake").get("id");
        Path<Integer> auxiliaryProperty = truckMiningRoot.get("auxiliary").get("id");


        if (manufacturer != null && manufacturer.size() > 0) {
            query.select(truckMiningRoot).where(cb.and(manufacturerProperty.in(manufacturer)));
        }
        if (manufacturerCountry != null && manufacturerCountry.size() > 0) {
           query.select(truckMiningRoot).where(cb.and(manufacturerCountryProperty.in(manufacturerCountry))) ;
        }
        if (machineLocation != null && machineLocation.size() > 0) {
            query.select(truckMiningRoot).where(cb.and(machineLocationProperty.in(machineLocation)));
        }
        if (series != null && series.size() > 0) {
            query.select(truckMiningRoot).where(cb.and(seriesProperty.in(series)));

        }
        if (engine != null && engine.size() > 0) {
            query.select(truckMiningRoot).where(cb.and(engineProperty.in(engine)));

        }
        if (suspension != null && suspension.size() > 0) {
            query.select(truckMiningRoot).where(cb.and(suspensionProperty.in(suspension)));

        }
        if (transmission != null && transmission.size() > 0) {
            query.select(truckMiningRoot).where(cb.and(transmissionProperty.in(transmission)));
        }
        if (brakeType != null && brakeType.size() > 0) {
            query.select(truckMiningRoot).where(cb.and(brakeTypeProperty.in(brakeType)));

        }
        if (frontWheel != null && frontWheel.size() > 0) {
            query.select(truckMiningRoot).where(cb.and(frontWheelProperty.in(frontWheel)));

        }
        if (rearWheel != null && rearWheel.size() > 0) {
            query.select(truckMiningRoot).where(cb.and(rearWheelProperty.in(rearWheel)));

        }

        if (parkingBrake != null && parkingBrake.size() > 0) {
            query.select(truckMiningRoot).where(cb.and(parkingBrakeProperty.in(parkingBrake)));

        }
        if (auxiliary != null && auxiliary.size() > 0) {
            query.select(truckMiningRoot).where( cb.and(auxiliaryProperty.in(auxiliary)));

        }


        TypedQuery<TruckMining> typedQuery = em.createQuery(query);


        return typedQuery.getResultList();
    }


}
