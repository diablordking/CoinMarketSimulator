package com.coin.CoinSimulator.payload;


import org.hibernate.validator.constraints.NotBlank;

public class BalanceRequest {

    @NotBlank
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
