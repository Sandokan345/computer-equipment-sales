package com.ecommerce.computerequipmentsales.service.impl.normalization;

import com.ecommerce.computerequipmentsales.dto.normalizationDTO.LaptopGPUDTO;
import com.ecommerce.computerequipmentsales.service.normalization.LaptopGPUService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class LaptopGPUServiceImpl implements LaptopGPUService {
    @Override
    public LaptopGPUDTO save(LaptopGPUDTO laptopGPUDTO) {
        return null;
    }

    @Override
    public LaptopGPUDTO update(LaptopGPUDTO laptopGPUDTO) {
        return null;
    }

    @Override
    public List<LaptopGPUDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
