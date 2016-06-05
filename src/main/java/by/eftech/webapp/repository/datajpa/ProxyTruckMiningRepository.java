package by.eftech.webapp.repository.datajpa;


import by.eftech.webapp.model.TruckMining;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ProxyTruckMiningRepository extends JpaRepository<TruckMining, Integer>, QueryDslPredicateExecutor<TruckMining> {

    @Modifying
    @Transactional
    @Query("DELETE FROM TruckMining a WHERE a.id=:id")
    int delete(@Param("id") int id);

}