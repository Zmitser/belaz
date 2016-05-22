package by.eftech.webapp.repository;


import by.eftech.webapp.model.TruckMining;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;


public interface TruckMiningRepository extends JpaRepository<TruckMining, Integer>, QueryDslPredicateExecutor<TruckMining> {

}