package com.coin.CoinSimulator.controller;


import com.coin.CoinSimulator.Security.CurrentUser;
import com.coin.CoinSimulator.Security.UserPrincipal;
import com.coin.CoinSimulator.model.Balance;
import com.coin.CoinSimulator.repository.BalanceRepository;
import com.coin.CoinSimulator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.coin.CoinSimulator.service.BalanceService;

import java.util.Optional;

@RestController
public class BalanceController {

    @Autowired
    private BalanceRepository balanceRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BalanceService balanceService;

    @RequestMapping("api/balance")
    public Balance getBalance(@CurrentUser UserPrincipal currentUser) {
        return balanceService.getBalanceCreatedBy(currentUser);
    }

    @PutMapping("api/balance")
    public ResponseEntity<Object> updateBalance(@RequestBody Balance balance, @CurrentUser UserPrincipal currentUser) {

        Optional<Balance> balanceOptional = balanceRepository.findById(currentUser.getId());

        if (!balanceOptional.isPresent())
            return ResponseEntity.notFound().build();

        balance.setId(currentUser.getId());

        balanceRepository.save(balance);

        return ResponseEntity.noContent().build();
    }

}
