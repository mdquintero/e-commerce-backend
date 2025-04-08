package com.ecommerce.ecommerce.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.Entities.Color;

public interface ColorRepository extends    JpaRepository<Color, Long>{
    
}
