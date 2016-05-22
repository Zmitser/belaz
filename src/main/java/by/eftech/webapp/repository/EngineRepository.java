package by.eftech.webapp.repository;


import by.eftech.webapp.model.Engine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface EngineRepository extends JpaRepository<Engine, Integer>{
}
