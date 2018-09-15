package com.coin.CoinSimulator.repository;


import com.coin.CoinSimulator.model.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BalanceRepository extends JpaRepository<Balance,Long> {

    Optional<Balance> findById(Long id);


    @Query(value ="SELECT * FROM balance WHERE balance.user_id = :id",nativeQuery = true)
    Balance findByUser_Id(Long id);


}
