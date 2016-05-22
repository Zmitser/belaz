package by.eftech.webapp.repository;


import by.eftech.webapp.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface SeriesRepository extends JpaRepository<Series, Integer>{
}
