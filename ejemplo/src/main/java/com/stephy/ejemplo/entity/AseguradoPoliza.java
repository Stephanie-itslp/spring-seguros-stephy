package com.stephy.ejemplo.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data 
@Entity(name="aseguradopoliza")
public class AseguradoPoliza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "asegurado_poliza_id")
    private int id;

    @ManyToOne
     @JoinColumn(name = "asegurado_id")
    private Asegurado asegurado;

    @ManyToOne
    @JoinColumn(name = "poliza_id")
    private Poliza poliza;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime fecha_registro;

}
