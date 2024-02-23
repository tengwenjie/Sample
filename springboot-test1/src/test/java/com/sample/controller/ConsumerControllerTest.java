package com.sample.controller;

import com.sample.domain.Consumer;
import com.sample.domain.ProductMaster;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConsumerControllerTest {

    @Autowired
    private ConsumerController consumerController;

    @Test
    public void test(){
        Consumer consumer = new Consumer();
        List<ProductMaster> productMasterList = new ArrayList<>();
        ProductMaster productMaster = new ProductMaster();
        productMaster.setName("AAAA");
        productMaster.setPrice(100L);
        productMasterList.add(productMaster);

        consumer.setName("teng");
        consumer.setProductMasters(productMasterList);

        consumerController.save(consumer);

    }
}