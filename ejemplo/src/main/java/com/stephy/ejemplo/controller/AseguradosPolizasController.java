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

import com.stephy.ejemplo.entity.AseguradoPoliza;
import com.stephy.ejemplo.service.AseguradosPolizasService;


@RestController
@RequestMapping("/aseguradospolizas")
public class AseguradosPolizasController {
    @Autowired
    AseguradosPolizasService AseguradosPolizasService;

    @GetMapping("/")
    public List<AseguradoPoliza> getAll() {
        return AseguradosPolizasService.findAll1();
    }

    @GetMapping(value = "/id/{asegurado_id}")
    public Optional<AseguradoPoliza> findById(@PathVariable Integer asegurado_id) {
        return AseguradosPolizasService.findById(asegurado_id);
    }

    
    @PostMapping("/")
    public AseguradoPoliza postMethodName(@RequestBody AseguradoPoliza AseguradoPoliza) {        
        return AseguradosPolizasService.save(AseguradoPoliza);
    }
}
