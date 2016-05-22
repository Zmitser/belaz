package by.eftech.webapp.repository;


import by.eftech.webapp.model.Transmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface TransmissionRepository extends JpaRepository<Transmission, Integer>{
}
