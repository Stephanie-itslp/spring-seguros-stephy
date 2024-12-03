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

/* 
@RestController
@RequestMapping("/asegurados")
public class AseguradosController {

    @GetMapping("/hola")
    public String hola() {
        return "Hola desde Spring Boot!";
    }
}*/


@RestController
@RequestMapping("/asegurados")
public class AseguradosController {
    @Autowired
    AseguradosService AseguradosService;

    @GetMapping("/")
    public List<Asegurado> getAll() {
        return AseguradosService.findAll();
    }

    @GetMapping(value = "/id/{asegurado_id}")
    public Optional<Asegurado> findById(@PathVariable Integer asegurado_id) {
        return AseguradosService.findById(asegurado_id);
    }
    
    @PostMapping("/")
    public Asegurado postMethodName(@RequestBody Asegurado asegurado) {        
        return AseguradosService.save(asegurado);
    }

}
