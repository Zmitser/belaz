package by.eftech.webapp.repository;


import by.eftech.webapp.model.Suspension;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface SuspensionRepository extends JpaRepository<Suspension, Integer>{
}
