package com.ecommerce.computerequipmentsales.service.impl.normalization;

import com.ecommerce.computerequipmentsales.dto.normalizationDTO.MainboardRAMDTO;
import com.ecommerce.computerequipmentsales.service.normalization.MainboardRAMService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class MainboardRAMServiceImpl implements MainboardRAMService {
    @Override
    public MainboardRAMDTO save(MainboardRAMDTO mainboardRAMDTO) {
        return null;
    }

    @Override
    public MainboardRAMDTO update(MainboardRAMDTO mainboardRAMDTO) {
        return null;
    }

    @Override
    public List<MainboardRAMDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
