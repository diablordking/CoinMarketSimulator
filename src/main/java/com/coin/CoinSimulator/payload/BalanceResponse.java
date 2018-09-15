package com.coin.CoinSimulator.payload;

public class BalanceResponse {
    private long id;
    private float balance;


    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BalanceResponse(long id, float balance) {
        this.id = id;
        this.balance = balance;
    }

}
