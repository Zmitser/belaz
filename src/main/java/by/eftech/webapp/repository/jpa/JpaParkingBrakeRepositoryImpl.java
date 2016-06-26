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
    public List<ParkingBrake> getAll() {
        return em.createNamedQuery(ParkingBrake.ALL_SORTED, ParkingBrake.class).getResultList();
    }
}
