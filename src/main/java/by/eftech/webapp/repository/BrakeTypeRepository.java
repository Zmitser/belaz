package by.eftech.webapp.repository;


import by.eftech.webapp.model.BrakeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface BrakeTypeRepository extends JpaRepository<BrakeType, Integer> {
}