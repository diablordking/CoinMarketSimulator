package com.coin.CoinSimulator.repository;


import com.coin.CoinSimulator.model.Balance;
import com.coin.CoinSimulator.model.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CoinRepository extends JpaRepository<Coin,Long> {


    Optional<Coin> findById(Long id);

    Coin findByUser_Id(Long id);

}
