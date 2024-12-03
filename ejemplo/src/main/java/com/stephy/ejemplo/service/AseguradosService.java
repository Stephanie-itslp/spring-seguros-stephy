package com.stephy.ejemplo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stephy.ejemplo.entity.Asegurado;
import com.stephy.ejemplo.repository.AseguradosRepository;;

@Service
public class AseguradosService {
    @Autowired
    AseguradosRepository AseguradosRepository;
    
    public List<Asegurado> findAll(){
        return AseguradosRepository.findAll();
    }

    /**
     * @param asegurado_id
     * @return
     */
    public Optional<Asegurado> findById(int asegurado_id){
        return AseguradosRepository.findById(asegurado_id);
    }
    
    public Asegurado save(Asegurado m){
        return AseguradosRepository.save(m);
    }
}
