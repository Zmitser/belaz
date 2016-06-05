package by.eftech.webapp.repository.datajpa;


import by.eftech.webapp.model.Engine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ProxyEngineRepository extends JpaRepository<Engine, Integer>{


    @Modifying
    @Transactional
    @Query("DELETE FROM Engine e WHERE e.id=:id")
    int delete(@Param("id") int id);

}
