package com.stephy.ejemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stephy.ejemplo.entity.Poliza;

public interface PolizasRepository extends JpaRepository<Poliza, Integer>{

    
} 