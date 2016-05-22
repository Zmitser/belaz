package by.eftech.webapp.repository;

import by.eftech.webapp.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {
}
