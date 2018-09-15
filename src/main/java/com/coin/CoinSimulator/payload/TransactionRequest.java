package com.coin.CoinSimulator.payload;

import javax.validation.constraints.NotBlank;

public class TransactionRequest {
    @NotBlank
    private float changer;

    public float getChanger() {
        return changer;
    }

    public void setChanger(float changer) {
        this.changer = changer;
    }
}
