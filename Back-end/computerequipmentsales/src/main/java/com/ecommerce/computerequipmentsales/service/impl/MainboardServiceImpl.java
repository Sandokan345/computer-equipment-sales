package com.ecommerce.computerequipmentsales.service.impl;

import com.ecommerce.computerequipmentsales.dto.MainboardDTO;
import com.ecommerce.computerequipmentsales.service.MainboardService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class MainboardServiceImpl implements MainboardService {
    @Override
    public MainboardDTO save(MainboardDTO mainboardDTO) {
        return null;
    }

    @Override
    public MainboardDTO update(MainboardDTO mainboardDTO) {
        return null;
    }

    @Override
    public List<MainboardDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
