package com.ecommerce.ecommerce.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.Entities.Talla;
import com.ecommerce.ecommerce.Repositories.TallaRepository;

@Service
public class TallaService {
    
    @Autowired
    private TallaRepository tallaRepository;

    public TallaService(TallaRepository tallaRepository) {
        this.tallaRepository = tallaRepository;
    }

    public List<Talla> getAllTallas() {
        return tallaRepository.findAll();
    }

}
