package by.eftech.webapp.repository;

import by.eftech.webapp.model.ManufacturerCountry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ManufacturerCountryRepository extends JpaRepository<ManufacturerCountry, Integer> {
}
