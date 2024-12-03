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

import com.stephy.ejemplo.entity.Asegurado;
import com.stephy.ejemplo.service.AseguradosService;



@RestController
@RequestMapping("/asegurados")
public class AseguradosController {
    @Autowired
    AseguradosService AseguradosService;

    @GetMapping("/")
    public List<Asegurado> getAll() {
        return AseguradosService.findAll();
    }

    @GetMapping(value = "/id/{AseguradoId}")
    public Optional<Asegurado> findById(@PathVariable Integer AseguradoId) {
        return AseguradosService.findById(AseguradoId);
    }
    
    @PostMapping("/")
    public Asegurado postMethodName(@RequestBody Asegurado Asegurado) {        
        return AseguradosService.save(Asegurado);
    }

}
