package by.eftech.webapp.repository.datajpa;


import by.eftech.webapp.model.Transmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ProxyTransmissionRepository extends JpaRepository<Transmission, Integer>{

    @Modifying
    @Transactional
    @Query("DELETE FROM Transmission a WHERE a.id=:id")
    int delete(@Param("id") int id);

}
