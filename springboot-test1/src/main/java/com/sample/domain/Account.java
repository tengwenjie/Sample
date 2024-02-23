package com.sample.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
//@Data
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long id;
    private Long cash;
    @OneToOne
    @JoinColumn(name = "consumer_id")
    private Consumer consumer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCash() {
        return cash;
    }

    public void setCash(Long cash) {
        this.cash = cash;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", cash=" + cash +
                ", consumer=" + consumer +
                '}';
    }
}
