package by.eftech.webapp.repository;


import by.eftech.webapp.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface PhotoRepository extends JpaRepository<Photo, Integer> {
}
