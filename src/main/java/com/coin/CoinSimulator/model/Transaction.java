package com.coin.CoinSimulator.model;


import com.coin.CoinSimulator.model.Audit.DateAudit;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "Transaction")
public class Transaction extends DateAudit {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Float Changers;

    private CoinName type;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_trans")
    private User users;

    public CoinName getType() {
        return type;
    }

    public void setType(CoinName type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getChange() {
        return Changers;
    }

    public void setChange(Float change) {
        Changers = change;
    }


}
