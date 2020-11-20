package com.ecommerce.computerequipmentsales.service.impl;

import com.ecommerce.computerequipmentsales.dto.DisplayCardDTO;
import com.ecommerce.computerequipmentsales.service.DisplayCardService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DisplayCardServiceImpl implements DisplayCardService {
    @Override
    public DisplayCardDTO save(DisplayCardDTO displayCardDTO) {
        return null;
    }

    @Override
    public DisplayCardDTO update(DisplayCardDTO displayCardDTO) {
        return null;
    }

    @Override
    public List<DisplayCardDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
