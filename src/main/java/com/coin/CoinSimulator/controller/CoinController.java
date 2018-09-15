package com.coin.CoinSimulator.controller;


import com.coin.CoinSimulator.repository.CoinRepository;
import com.coin.CoinSimulator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoinController {

    @Autowired
    private CoinRepository coinRepository;

    @Autowired
    private UserRepository userRepository;




}
