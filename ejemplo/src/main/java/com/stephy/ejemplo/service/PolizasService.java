package com.stephy.ejemplo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stephy.ejemplo.entity.Poliza;
import com.stephy.ejemplo.repository.PolizasRepository;

@Service
public class PolizasService {
    @Autowired
    PolizasRepository PolizasRepository;
    
    public List<Poliza> findAll(){
        return PolizasRepository.findAll();
    }

    /**
     * @param PolizaId
     * @return
     */
    public Optional<Poliza> findById(int PolizaId){
        return PolizasRepository.findById(PolizaId);
    }
    
    public Poliza save(Poliza m){
        return PolizasRepository.save(m);
    }
}
