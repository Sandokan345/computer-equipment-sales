package com.ecommerce.computerequipmentsales.service.impl.normalization;

import com.ecommerce.computerequipmentsales.dto.normalizationDTO.LaptopScreenDTO;
import com.ecommerce.computerequipmentsales.service.normalization.LaptopScreenService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class LaptopScreenServiceImpl implements LaptopScreenService {
    @Override
    public LaptopScreenDTO save(LaptopScreenDTO laptopScreenDTO) {
        return null;
    }

    @Override
    public LaptopScreenDTO update(LaptopScreenDTO laptopScreenDTO) {
        return null;
    }

    @Override
    public List<LaptopScreenDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
