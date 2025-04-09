package com.ecommerce.ecommerce.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.Entities.TipoCalzado;
import com.ecommerce.ecommerce.Repositories.TipoCalzadoRepository;

@Service
public class TipoCalzadoService {

    @Autowired
    private TipoCalzadoRepository tipoCalzadoRepository;
    
    public TipoCalzadoService(TipoCalzadoRepository tipoCalzadoRepository) {
        this.tipoCalzadoRepository = tipoCalzadoRepository;
    }

    public List<TipoCalzado> getAllTiposCalzado() {
        return tipoCalzadoRepository.findAll();
    }
}
