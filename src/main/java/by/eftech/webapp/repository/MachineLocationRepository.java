package by.eftech.webapp.repository;

import by.eftech.webapp.model.MachineLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface MachineLocationRepository extends JpaRepository<MachineLocation, Integer> {
}
