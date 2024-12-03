package com.stephy.ejemplo.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data 
@Entity(name="asegurado")
public class Asegurado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "asegurado_id")
    private int id;
    
    @Column (nullable = false)
    private String nombre;
    
    @Column (nullable = false)
    private String apellido_paterno;

    @Column
    private String apellido_materno;

    @Column
    private String correo;

    @Column(unique=true, nullable = false)
    private String rfc;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime fecha_alta;
}
