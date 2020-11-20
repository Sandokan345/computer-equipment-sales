package com.ecommerce.computerequipmentsales.service.impl.normalization;

import com.ecommerce.computerequipmentsales.dto.normalizationDTO.LaptopRAMDTO;
import com.ecommerce.computerequipmentsales.service.normalization.LaptopRAMService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class LaptopRAMServiceImpl implements LaptopRAMService {
    @Override
    public LaptopRAMDTO save(LaptopRAMDTO laptopRAMDTO) {
        return null;
    }

    @Override
    public LaptopRAMDTO update(LaptopRAMDTO laptopRAMDTO) {
        return null;
    }

    @Override
    public List<LaptopRAMDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
