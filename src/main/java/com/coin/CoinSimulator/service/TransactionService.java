package com.coin.CoinSimulator.service;

import com.coin.CoinSimulator.exception.ResourceNotFoundException;
import com.coin.CoinSimulator.model.Transaction;
import com.coin.CoinSimulator.model.User;
import com.coin.CoinSimulator.repository.TransactionRepository;
import com.coin.CoinSimulator.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    private static final Logger logger = LoggerFactory.getLogger(TransactionRepository.class);

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
}
