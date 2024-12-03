package com.stephy.ejemplo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stephy.ejemplo.entity.AseguradoPoliza;
import com.stephy.ejemplo.repository.AseguradosPolizasRepository;


@Service
public class AseguradosPolizasService {
     @Autowired
    AseguradosPolizasRepository AseguradosPolizasRepository;
    
    public List<AseguradoPoliza> findAll1(){
        return AseguradosPolizasRepository.findAll();
    }

    /**
     * @param asegurado_id
     * @return
     */
    public Optional<AseguradoPoliza> findById(int asegurado_id){
        return AseguradosPolizasRepository.findById(asegurado_id);
    }
    
    public AseguradoPoliza save(AseguradoPoliza m){
        return AseguradosPolizasRepository.save(m);
    }
}
