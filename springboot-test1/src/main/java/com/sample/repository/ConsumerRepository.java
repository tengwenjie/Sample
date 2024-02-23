package com.sample.repository;

import com.sample.domain.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerRepository extends JpaRepository<Consumer,Long> {
}
