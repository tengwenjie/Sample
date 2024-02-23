package com.sample.repository;

import com.sample.domain.ProductMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMasterRepository extends JpaRepository<ProductMaster,Long> {

}
