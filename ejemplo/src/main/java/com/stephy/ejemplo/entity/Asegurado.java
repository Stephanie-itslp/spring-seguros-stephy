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
    @Column(name = "AseguradoId")
    private int id;
        
    @Column (nullable = false)
    private String Nombre;
    
    @Column (nullable = false)
    private String ApellidoParterno;

    @Column
    private String ApellidoMaterno;

    @Column
    private String Correo;

    @Column(unique=true, nullable = false)
    private String Rfc;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime FechaAlta;
}
