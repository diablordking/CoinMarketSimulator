package com.coin.CoinSimulator.service;

import com.coin.CoinSimulator.Security.UserPrincipal;
import com.coin.CoinSimulator.exception.ResourceNotFoundException;
import com.coin.CoinSimulator.model.Balance;
import com.coin.CoinSimulator.model.User;
import com.coin.CoinSimulator.repository.BalanceRepository;
import com.coin.CoinSimulator.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;

@Service
public class BalanceService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BalanceRepository balanceRepository;



    private static final Logger logger = LoggerFactory.getLogger(BalanceService.class);

    public Balance getBalanceCreatedBy(UserPrincipal currentUser) {


        User user = userRepository.findById(currentUser.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "username", currentUser.getId()));

        Balance balance = balanceRepository.findByUser_Id(user.getId());

        if (balance == null) {
            return new Balance(0, user);
        }

        return balance;
    }
}
