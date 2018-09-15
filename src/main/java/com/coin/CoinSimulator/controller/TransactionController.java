package com.coin.CoinSimulator.controller;


import com.coin.CoinSimulator.exception.ResourceNotFoundException;
import com.coin.CoinSimulator.model.Transaction;
import com.coin.CoinSimulator.model.User;
import com.coin.CoinSimulator.repository.TransactionRepository;
import com.coin.CoinSimulator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/transaction")
public class TransactionController {

    public List getTransactionByUsername (String username) {


        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new ResourceNotFoundException("User", "username", username));

        List<Transaction> transaction = new ArrayList<>();


        transactionRepository.findByUser_ıd(user.getId().toString()).forEach(transaction::add);

        if (transaction == null) {
            return null;
        }

        return transaction;

    }

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TransactionRepository transactionRepository;


    @PostMapping({"user_id"})
    List<Transaction> getAllTransaction(@PathVariable String id )  {
        return getTransactionByUsername(id);
    }
}
