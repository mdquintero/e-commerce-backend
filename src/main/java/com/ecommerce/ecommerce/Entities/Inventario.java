package com.ecommerce.ecommerce.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Inventario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "zapato_id") // foreign key de Zapato 1 a 1
    private Zapato zapato;

    @OneToOne
    @JoinColumn(name = "talla_id") // foreign key de Talla 1 a 1
    private Talla talla;

    @ManyToOne
    @JoinColumn(name = "color_id") // foreign key de Color N a 1
    private Color color;

    private int stock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Zapato getZapato() {
        return zapato;
    }

    public void setZapato(Zapato zapato) {
        this.zapato = zapato;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
}
