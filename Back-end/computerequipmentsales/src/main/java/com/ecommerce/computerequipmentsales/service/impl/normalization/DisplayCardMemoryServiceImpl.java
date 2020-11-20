package com.ecommerce.computerequipmentsales.service.impl.normalization;

import com.ecommerce.computerequipmentsales.dto.normalizationDTO.DisplayCardMemoryDTO;
import com.ecommerce.computerequipmentsales.service.normalization.DisplayCardMemoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DisplayCardMemoryServiceImpl implements DisplayCardMemoryService {
    @Override
    public DisplayCardMemoryDTO save(DisplayCardMemoryDTO displayCardMemoryDTO) {
        return null;
    }

    @Override
    public DisplayCardMemoryDTO update(DisplayCardMemoryDTO displayCardMemoryDTO) {
        return null;
    }

    @Override
    public List<DisplayCardMemoryDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
