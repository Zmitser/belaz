package by.eftech.webapp.repository;

import by.eftech.webapp.model.FrontWheels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface FrontWheelsRepository extends JpaRepository<FrontWheels, Integer> {
}
