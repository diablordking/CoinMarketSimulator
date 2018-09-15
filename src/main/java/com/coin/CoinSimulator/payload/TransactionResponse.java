package com.coin.CoinSimulator.payload;

import com.coin.CoinSimulator.model.CoinName;

public class TransactionResponse {
    private Long id;
    private float changer;
    private CoinName type;

    public TransactionResponse(Long id, float changer, CoinName type) {
        this.id = id;
        this.changer = changer;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getChanger() {
        return changer;
    }

    public void setChanger(float changer) {
        this.changer = changer;
    }

    public CoinName setType() {
        return type;
    }

    public void setType(CoinName type) {
        this.type = type;
    }
}
