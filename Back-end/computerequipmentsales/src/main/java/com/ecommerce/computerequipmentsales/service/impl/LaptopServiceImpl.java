package com.ecommerce.computerequipmentsales.service.impl;

import com.ecommerce.computerequipmentsales.dto.LaptopDTO;
import com.ecommerce.computerequipmentsales.service.LaptopService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class LaptopServiceImpl implements LaptopService {
    @Override
    public LaptopDTO save(LaptopDTO laptopDTO) {
        return null;
    }

    @Override
    public LaptopDTO update(LaptopDTO laptopDTO) {
        return null;
    }

    @Override
    public List<LaptopDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
