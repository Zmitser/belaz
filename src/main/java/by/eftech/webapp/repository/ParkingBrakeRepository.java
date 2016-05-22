package by.eftech.webapp.repository;

import by.eftech.webapp.model.ParkingBrake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ParkingBrakeRepository extends JpaRepository<ParkingBrake, Integer> {
}
