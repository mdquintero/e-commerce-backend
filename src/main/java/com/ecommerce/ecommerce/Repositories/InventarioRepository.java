package com.ecommerce.ecommerce.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.Entities.Inventario;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {

    
}
