package com.hyun2.springboot.data.repository;

import com.hyun2.springboot.data.entity.Producer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducerRepository extends JpaRepository<Producer, Long> {

}
