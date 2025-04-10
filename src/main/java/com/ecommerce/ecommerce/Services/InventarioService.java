package com.ecommerce.ecommerce.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.Entities.Inventario;
import com.ecommerce.ecommerce.Repositories.InventarioRepository;

@Service
public class InventarioService {
    
    @Autowired
    private InventarioRepository inventarioRepository;

    public InventarioService(InventarioRepository inventariorepository){
        this.inventarioRepository = inventariorepository;
    }

    public List<Inventario> getAllInventarios(){
        return inventarioRepository.findAll();
    }

    public Inventario getInventarioById(Long id){
        return inventarioRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontró el inventario con id: " + id));
    }

    public Inventario saveInventario(Inventario inventario){
        return inventarioRepository.save(inventario);
    }
}
