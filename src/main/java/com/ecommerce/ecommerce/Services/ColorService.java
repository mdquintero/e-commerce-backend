package com.ecommerce.ecommerce.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.Entities.Color;
import com.ecommerce.ecommerce.Repositories.ColorRepository;

@Service
public class ColorService {

    @Autowired
    private ColorRepository colorRepository;

    public ColorService(ColorRepository colorRepository) {
        this.colorRepository = colorRepository;
    }

    public List<Color> getAllColors() {
        return colorRepository.findAll();
    }
    
}
