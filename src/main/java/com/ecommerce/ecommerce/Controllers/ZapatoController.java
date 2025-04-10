package com.ecommerce.ecommerce.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.Entities.Zapato;
import com.ecommerce.ecommerce.Services.ZapatoService;

@RestController
@RequestMapping("/zapatos")
public class ZapatoController {

    @Autowired
    private ZapatoService zapatoService;

    public ZapatoController(ZapatoService zapatoService) {
        this.zapatoService = zapatoService;
    }

    @GetMapping("/")
    public List<Zapato> getAllZapatos() {
        return zapatoService.getAllZapatos();
    }

    @GetMapping("/{id}")
    public Zapato getZapatoById(Long id) {
        return zapatoService.getZapatoById(id);
    }

    @PostMapping("/guardar")
    public Zapato saveZapato(Zapato zapato) {
        return zapatoService.saveZaato(zapato);
    }
    
}
