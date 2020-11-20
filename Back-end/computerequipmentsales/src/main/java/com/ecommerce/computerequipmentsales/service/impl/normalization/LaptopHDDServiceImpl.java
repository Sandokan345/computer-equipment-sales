package com.ecommerce.computerequipmentsales.service.impl.normalization;

import com.ecommerce.computerequipmentsales.dto.normalizationDTO.LaptopHDDDTO;
import com.ecommerce.computerequipmentsales.service.normalization.LaptopHDDService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class LaptopHDDServiceImpl implements LaptopHDDService {
    @Override
    public LaptopHDDDTO save(LaptopHDDDTO laptopHDDDTO) {
        return null;
    }

    @Override
    public LaptopHDDDTO update(LaptopHDDDTO laptopHDDDTO) {
        return null;
    }

    @Override
    public List<LaptopHDDDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
