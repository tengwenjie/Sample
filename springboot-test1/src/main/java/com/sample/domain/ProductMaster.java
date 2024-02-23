package com.sample.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "productMaster")
public class ProductMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long price;

    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "consumer_id")
    private Consumer consumer;

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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public String toString() {
        return "ProductMaster{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", consumer=" + consumer +
                '}';
    }
}
