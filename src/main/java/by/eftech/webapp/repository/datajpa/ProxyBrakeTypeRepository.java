package by.eftech.webapp.repository.datajpa;


import by.eftech.webapp.model.BrakeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ProxyBrakeTypeRepository extends JpaRepository<BrakeType, Integer> {

    @Modifying
    @Transactional
    @Query("DELETE FROM BrakeType b WHERE b.id=:id")
    int delete(@Param("id") int id);

}
