package com.coin.CoinSimulator.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;



@Entity
@Table(name = "coins")
public class Coin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private CoinName name;

    private float amount;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CoinName getName() {
        return name;
    }

    public void setName(CoinName name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }


    public Coin(CoinName name, float amount, User user) {
        this.name = name;
        this.amount = amount;
        this.user = user;
    }
    public Coin() {

    }
}