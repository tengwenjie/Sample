package com.sample.controller;

import com.sample.domain.Consumer;
import com.sample.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
//@Transactional
public class ConsumerController {

    @Autowired
    private ConsumerRepository consumerRepository;

    @GetMapping("/")
    public String findAll(){
        return consumerRepository.findAll().toString();
    }
    @PostMapping("/")
    public String save(@RequestBody Consumer consumer){
        return consumerRepository.save(consumer).toString();
    }
    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Long id){
        consumerRepository.deleteById(id);
        return true;
    }
    @DeleteMapping("/")
    public boolean deleteAll(){
        consumerRepository.deleteAll();
        return true;
    }
}
