package com.ecommerce.computerequipmentsales.service.impl.normalization;

import com.ecommerce.computerequipmentsales.dto.normalizationDTO.LaptopProcessorDTO;
import com.ecommerce.computerequipmentsales.service.normalization.LaptopProcessorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class LaptopProcessorServiceImpl implements LaptopProcessorService {
    @Override
    public LaptopProcessorDTO save(LaptopProcessorDTO laptopProcessorDTO) {
        return null;
    }

    @Override
    public LaptopProcessorDTO update(LaptopProcessorDTO laptopProcessorDTO) {
        return null;
    }

    @Override
    public List<LaptopProcessorDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
