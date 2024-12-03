package com.stephy.ejemplo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.stephy.ejemplo.entity.Poliza;
import com.stephy.ejemplo.service.PolizasService;


@RestController
@RequestMapping("/polizas")
public class PolizasController {
    @Autowired
    PolizasService PolizasService;

    @GetMapping("/")
    public List<Poliza> getAll() {
        return PolizasService.findAll();
    }

    @GetMapping(value = "/id/{PolizaId}")
    public Optional<Poliza> findById(@PathVariable Integer PolizaId) {
        return PolizasService.findById(PolizaId);
    }
    
    @PostMapping("/")
    public Poliza postMethodName(@RequestBody Poliza Poliza) {        
        return PolizasService.save(Poliza);
    }
}
