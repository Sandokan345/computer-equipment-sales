package com.ecommerce.computerequipmentsales.service.impl.normalization;

import com.ecommerce.computerequipmentsales.dto.normalizationDTO.LaptopSSDDTO;
import com.ecommerce.computerequipmentsales.service.normalization.LaptopSSDService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class LaptopSSDServiceImpl implements LaptopSSDService {
    @Override
    public LaptopSSDDTO save(LaptopSSDDTO laptopSSDDTO) {
        return null;
    }

    @Override
    public LaptopSSDDTO update(LaptopSSDDTO laptopSSDDTO) {
        return null;
    }

    @Override
    public List<LaptopSSDDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
