package com.hyun2.springboot.data.repository;

import com.hyun2.springboot.data.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
