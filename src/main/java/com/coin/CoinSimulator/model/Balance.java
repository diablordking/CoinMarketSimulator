package com.coin.CoinSimulator.model;


import javax.persistence.*;

@Entity
@Table(name = "Balance")
public class Balance {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float balance = 1000;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Balance( float balance, User user) {

        this.balance = balance;
        this.user = user;
    }

    public Balance() {
    }

}
