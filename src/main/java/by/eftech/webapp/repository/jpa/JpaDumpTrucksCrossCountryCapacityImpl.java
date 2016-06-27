package by.eftech.webapp.repository.jpa;

import by.eftech.webapp.model.DumpTrucksCrossCountryCapacity;
import by.eftech.webapp.repository.DumpTrucksCrossCountryCapacityRepository;
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
public class JpaDumpTrucksCrossCountryCapacityImpl implements DumpTrucksCrossCountryCapacityRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public DumpTrucksCrossCountryCapacity save(DumpTrucksCrossCountryCapacity brakeType) {
        if (brakeType.newOject()) {
            em.persist(brakeType);
            return brakeType;
        } else {
            return em.merge(brakeType);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(DumpTrucksCrossCountryCapacity.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public DumpTrucksCrossCountryCapacity get(int id) {
        return em.find(DumpTrucksCrossCountryCapacity.class, id);
    }

    @Override
    public List<DumpTrucksCrossCountryCapacity> getAll() {
        return em.createNamedQuery(DumpTrucksCrossCountryCapacity.ALL_SORTED, DumpTrucksCrossCountryCapacity.class).getResultList();
    }

    @Override
    public List<DumpTrucksCrossCountryCapacity> getAllByDate() {
        return em.createNamedQuery(DumpTrucksCrossCountryCapacity.ALL_SORTED_BY_DATE, DumpTrucksCrossCountryCapacity.class).getResultList();
    }

    @Override
    public Iterable<DumpTrucksCrossCountryCapacity> getFilteredList(List<Integer> manufacturer, List<Integer> manufacturerCountry, List<Integer> machineLocation, List<Integer> series, List<Integer> engine, List<Integer> suspension, List<Integer> transmission, List<Integer> wheelArrangement) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<DumpTrucksCrossCountryCapacity> query = cb.createQuery(DumpTrucksCrossCountryCapacity.class);
        Root<DumpTrucksCrossCountryCapacity> truckMiningRoot = query.from(DumpTrucksCrossCountryCapacity.class);
        Path<Integer> manufacturerProperty = truckMiningRoot.get("manufacturer").get("id");
        Path<Integer> manufacturerCountryProperty = truckMiningRoot.get("manufacturerCountry").get("id");
        Path<Integer> machineLocationProperty = truckMiningRoot.get("machineLocation").get("id");
        Path<Integer> seriesProperty = truckMiningRoot.get("model").get("series").get("id");
        Path<Integer> engineProperty = truckMiningRoot.get("engine").get("id");
        Path<Integer> suspensionProperty = truckMiningRoot.get("suspension").get("id");
        Path<Integer> transmissionProperty = truckMiningRoot.get("transmission").get("id");
        Path<Integer> wheelArrangementProperty = truckMiningRoot.get("wheelArrangement").get("id");


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
        if (wheelArrangement != null && wheelArrangement.size() > 0) {
            query.select(truckMiningRoot).where(cb.and(wheelArrangementProperty.in(wheelArrangement)));

        }

        TypedQuery<DumpTrucksCrossCountryCapacity> typedQuery = em.createQuery(query);
        return typedQuery.getResultList();
    }
}
