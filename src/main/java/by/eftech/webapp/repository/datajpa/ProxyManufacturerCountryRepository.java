package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.ManufacturerCountry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ProxyManufacturerCountryRepository extends JpaRepository<ManufacturerCountry, Integer> {

    @Modifying
    @Transactional
    @Query("DELETE FROM ManufacturerCountry m WHERE m.id=:id")
    int delete(@Param("id") int id);

}
