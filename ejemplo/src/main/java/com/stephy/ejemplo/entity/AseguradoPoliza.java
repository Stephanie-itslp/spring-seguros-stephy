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
    @Column(name = "AseguradoPolizaId")
    private int id;

    @ManyToOne
     @JoinColumn(name = "AseguradoId", nullable = false)
    private Asegurado Asegurado;

    @ManyToOne
    @JoinColumn(name = "PolizaId", nullable = false)
    private Poliza Poliza;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime FechaRegistro;

}
