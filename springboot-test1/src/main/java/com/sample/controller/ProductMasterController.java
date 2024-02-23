package com.sample.controller;

import com.sample.domain.Consumer;
import com.sample.domain.ProductMaster;
import com.sample.repository.ConsumerRepository;
import com.sample.repository.ProductMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productMaster")
//@Transactional
public class ProductMasterController {
    @Autowired
    private ProductMasterRepository productMasterRepository;

    @GetMapping("/")
    public String findAll(){
        return productMasterRepository.findAll().toString();
    }
    @PostMapping("/")
    public String save(@RequestBody List<ProductMaster> productMasters){
        return productMasterRepository.saveAll(productMasters).toString();
    }
    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Long id){
        productMasterRepository.deleteById(id);
        return true;
    }
    @DeleteMapping("/")
    public boolean deleteAll(){
        productMasterRepository.deleteAll();
        return true;
    }
}
