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
    @Column(name = "PolizaId")
    private int id;
        
    @Column(unique=true, nullable = false)
    private String PolizaClave;
    
    @Column
    private String Producto;

    @Column(precision=10, scale=2)
    private BigDecimal Monto;

    @Column
    private String Cobertura;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime FechaInicio;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime FechaFin;

}
