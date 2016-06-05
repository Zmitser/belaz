package by.eftech.webapp.repository.datajpa;


import by.eftech.webapp.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ProxyModelRepository extends JpaRepository<Model, Integer>{

    @Modifying
    @Transactional
    @Query("DELETE FROM Model a WHERE a.id=:id")
    int delete(@Param("id") int id);

}
