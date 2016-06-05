package by.eftech.webapp.repository.datajpa;

import by.eftech.webapp.model.MachineLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ProxyMachineLocationRepository extends JpaRepository<MachineLocation, Integer>{

        @Modifying
        @Transactional
        @Query("DELETE FROM MachineLocation m WHERE m.id=:id")
        int delete(@Param("id") int id);

}
