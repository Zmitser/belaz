package by.eftech.webapp.repository;


import by.eftech.webapp.model.Auxiliary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface AuxiliaryRepository extends JpaRepository<Auxiliary, Integer> {
}
