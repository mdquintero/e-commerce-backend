package com.ecommerce.ecommerce.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.Entities.Inventario;
import com.ecommerce.ecommerce.Services.InventarioService;

@RestController
@RequestMapping("/inventario")
public class InventarioController {
    
    @Autowired
    private InventarioService inventarioSerivce;

    public InventarioController(InventarioService inventarioService){
        this.inventarioSerivce = inventarioService;
    }

    @RequestMapping("/")
    public List<Inventario> getAllInventarios(){
        return inventarioSerivce.getAllInventarios();
    }

    @RequestMapping("/{id}")
    public Inventario getInventarioById(Long id){
        return inventarioSerivce.getInventarioById(id);
    }

    @RequestMapping("/guardar")
    public Inventario saveInventario(Inventario inventario){
        return inventarioSerivce.saveInventario(inventario);
    }
}
