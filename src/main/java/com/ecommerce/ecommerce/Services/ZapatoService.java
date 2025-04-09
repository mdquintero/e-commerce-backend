package com.ecommerce.ecommerce.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.Entities.Zapato;
import com.ecommerce.ecommerce.Repositories.ZapatoRepository;

@Service
public class ZapatoService {
    
    @Autowired
    private ZapatoRepository zapatoRepository;

    public ZapatoService(ZapatoRepository zapatoRepository) {
        this.zapatoRepository = zapatoRepository;
    }

    public List<Zapato> getAllZapatos() {
        return zapatoRepository.findAll();
    }

    public Zapato getZapatoById(Long id){
        return zapatoRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontró el zapato con id: " + id));
    }

    public Zapato saveZaato(Zapato zapato){
        return zapatoRepository.save(zapato);
    }

   
}
