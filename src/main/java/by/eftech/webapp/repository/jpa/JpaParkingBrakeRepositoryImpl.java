package by.eftech.webapp.repository.jpa;


import by.eftech.webapp.model.ParkingBrake;
import by.eftech.webapp.repository.ParkingBrakeRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional(readOnly = true)
@Repository
public class JpaParkingBrakeRepositoryImpl implements ParkingBrakeRepository{


    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public ParkingBrake save(ParkingBrake parkingBrake) {
        if (parkingBrake.newOject()){
            em.persist(parkingBrake);
            return parkingBrake;
        }else {
            return em.merge(parkingBrake);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(ParkingBrake.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public ParkingBrake get(int id) {
        return em.find(ParkingBrake.class, id);
    }

    @Override
    public List<ParkingBrake> getAll() {
        return em.createNamedQuery(ParkingBrake.ALL_SORTED, ParkingBrake.class).getResultList();
    }
}
