package com.coin.CoinSimulator.repository;

import com.coin.CoinSimulator.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    @Override
    Optional<Transaction> findById(Long aLong);

    List<Transaction> findAll();

    @Query(value ="FROM Transaction WHERE Transaction.fk_trans = :id",nativeQuery = true)
    List<Transaction> findByUser_ıd(@Param("id") String aLong);
}
