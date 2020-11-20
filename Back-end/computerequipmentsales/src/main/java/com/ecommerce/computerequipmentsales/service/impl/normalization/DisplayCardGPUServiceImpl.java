package com.ecommerce.computerequipmentsales.service.impl.normalization;

import com.ecommerce.computerequipmentsales.dto.normalizationDTO.DisplayCardGPUDTO;
import com.ecommerce.computerequipmentsales.service.normalization.DisplayCardGPUService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DisplayCardGPUServiceImpl implements DisplayCardGPUService {
    @Override
    public DisplayCardGPUDTO save(DisplayCardGPUDTO displayCardGPUDTO) {
        return null;
    }

    @Override
    public DisplayCardGPUDTO update(DisplayCardGPUDTO displayCardGPUDTO) {
        return null;
    }

    @Override
    public List<DisplayCardGPUDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
