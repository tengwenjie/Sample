package com.sample.repository;

import com.sample.domain.Account;
import com.sample.domain.Consumer;
import com.sample.domain.ProductMaster;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ConsumerRepositoryTest {

    @Autowired
    private ConsumerRepository consumerRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private ProductMasterRepository productMasterRepository;

    @Test
    @Transactional
    public void test(){
        Consumer consumer = new Consumer();
        Account account = new Account();

        account.setCash(300L);
        consumer.setName("teng");
        consumer.setAccount(account);

        consumerRepository.save(consumer);
        consumerRepository.findAll().stream().forEach(x-> System.out.println(x));

        accountRepository.findAll().stream().forEach(x-> System.out.println(x));

    }

    /**
     * mappedBy
     */
    @Test
    public void test2(){
        Consumer consumer = new Consumer();
        Account account = new Account();

        account.setCash(300L);
        consumer.setName("teng");
        consumer.setAccount(account);

        consumerRepository.save(consumer);
//        consumerRepository.deleteById(1L);
        accountRepository.deleteById(1L);
//        accountRepository.findById(1L).ifPresent(x-> System.out.println(x));
    }

    @Test
    @Transactional
    public void test3(){
        Consumer consumer = new Consumer();
        List<ProductMaster> productMasterList = new ArrayList<>();
        ProductMaster productMaster = new ProductMaster();
        productMaster.setName("AAAA");
        productMaster.setPrice(100L);
        productMasterList.add(productMaster);

        consumer.setName("teng");
        consumer.setProductMasters(productMasterList);

        System.out.println(consumer);

        consumerRepository.save(consumer);
        consumerRepository.findAll().stream().forEach(x-> System.out.println(x));
        productMasterRepository.findAll().stream().forEach(x-> System.out.println(x));


    }

    @Test
    @Transactional
    public void test4(){
        Consumer consumer = new Consumer();
        List<ProductMaster> productMasterList = new ArrayList<>();
        ProductMaster productMaster = new ProductMaster();
        ProductMaster productMaster1 = new ProductMaster();
        productMaster.setName("AAAA");
        productMaster.setPrice(100L);
        productMaster1.setName("BBBB");
        productMaster1.setPrice(200L);
        productMasterList.add(productMaster);
        productMasterList.add(productMaster1);

        consumer.setName("teng");
        consumer.setProductMasters(productMasterList);

        consumerRepository.save(consumer);

        consumerRepository.deleteById(1L);
        System.out.println("============");
        consumerRepository.findAll().stream().forEach(x-> System.out.println(x));
        System.out.println("============");
        productMasterRepository.findAll().forEach(x-> System.out.println(x));

    }

    @Test
    @Transactional
    public void test5(){
        Consumer consumer = new Consumer();
        consumer.setName("teng");

        List<ProductMaster> productMasterList = new ArrayList<>();
        ProductMaster productMaster = new ProductMaster();
        ProductMaster productMaster1 = new ProductMaster();
        productMaster.setName("AAAA");
        productMaster.setPrice(100L);
        productMaster.setConsumer(consumer);
        productMaster1.setName("BBBB");
        productMaster1.setPrice(200L);
        productMaster1.setConsumer(consumer);
        productMasterList.add(productMaster);
        productMasterList.add(productMaster1);

        productMasterRepository.saveAll(productMasterList);
        productMasterRepository.findAll().stream().forEach(x-> System.out.println(x));
        System.out.println("============");
        consumerRepository.findAll().stream().forEach(x-> System.out.println(x));

    }

    @Test
    @Transactional
    public void test6(){
        Consumer consumer = new Consumer();
        consumer.setName("teng");

        List<ProductMaster> productMasterList = new ArrayList<>();
        ProductMaster productMaster = new ProductMaster();
        ProductMaster productMaster1 = new ProductMaster();
        productMaster.setName("AAAA");
        productMaster.setPrice(100L);
        productMaster.setConsumer(consumer);
        productMaster1.setName("BBBB");
        productMaster1.setPrice(200L);
        productMaster1.setConsumer(consumer);
        productMasterList.add(productMaster);
        productMasterList.add(productMaster1);

        productMasterRepository.saveAll(productMasterList);
        productMasterRepository.deleteAll();
        System.out.println("============");
        productMasterRepository.findAll().stream().forEach(x-> System.out.println(x));
        System.out.println("============");
        consumerRepository.findAll().stream().forEach(x-> System.out.println(x));

    }

    @Test
    @Transactional
    public void test7(){
        Consumer consumer = new Consumer();
        consumer.setName("teng");

        List<ProductMaster> productMasterList = new ArrayList<>();
        ProductMaster productMaster = new ProductMaster();
        ProductMaster productMaster1 = new ProductMaster();
        productMaster.setName("AAAA");
        productMaster.setPrice(100L);
        productMaster.setConsumer(consumer);
        productMaster1.setName("BBBB");
        productMaster1.setPrice(200L);
        productMaster1.setConsumer(consumer);
        productMasterList.add(productMaster);
        productMasterList.add(productMaster1);

        productMasterRepository.saveAll(productMasterList);
        productMasterRepository.deleteById(1L);
        System.out.println("============");
        productMasterRepository.findAll().stream().forEach(x-> System.out.println(x));
        System.out.println("============");
        consumerRepository.findAll().stream().forEach(x-> System.out.println(x));

    }


    @Test
    @Transactional
    public void test8(){
        Consumer consumer = new Consumer();
        List<ProductMaster> productMasterList = new ArrayList<>();
        ProductMaster productMaster = new ProductMaster();
        ProductMaster productMaster1 = new ProductMaster();
        productMaster.setName("AAAA");
        productMaster.setPrice(100L);
        productMaster1.setName("BBBB");
        productMaster1.setPrice(200L);
        productMasterList.add(productMaster);
        productMasterList.add(productMaster1);

        consumer.setName("teng");
        consumer.setProductMasters(productMasterList);

        consumerRepository.save(consumer);
        productMasterRepository.deleteAll();
        System.out.println("============");
        productMasterRepository.findAll().stream().forEach(x-> System.out.println(x));
        System.out.println("============");
        consumerRepository.findAll().stream().forEach(x-> System.out.println(x));


    }

}