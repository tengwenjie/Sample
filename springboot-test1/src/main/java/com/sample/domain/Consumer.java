package com.sample.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "consumer")
public class Consumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "consumer_id")
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "consumer")
    @JoinColumn(name = "account_id")
    private Account account;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "consumer_id")
    private List<ProductMaster> productMasters;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<ProductMaster> getProductMasters() {
        return productMasters;
    }

    public void setProductMasters(List<ProductMaster> productMasters) {
        this.productMasters = productMasters;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account=" + account +
                ", productMasters=" + productMasters +
                '}';
    }
}
