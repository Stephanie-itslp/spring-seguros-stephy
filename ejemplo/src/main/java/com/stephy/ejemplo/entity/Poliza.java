package com.stephy.ejemplo.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data 
@Entity(name="poliza")
public class Poliza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "poliza_id")
    private int id;
        
    @Column(unique=true, nullable = false)
    private String poliza_clave;
    
    @Column
    private String producto;

    @Column(precision=10, scale=2)
    private BigDecimal monto;

    @Column
    private String cobertura;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime fecha_inicio;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime fecha_fin;

}
