package com.ecommerce.computerequipmentsales.service.impl;

import com.ecommerce.computerequipmentsales.dto.StockDTO;
import com.ecommerce.computerequipmentsales.service.StockService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StockServiceImpl implements StockService {
    @Override
    public StockDTO save(StockDTO stockDTO) {
        return null;
    }

    @Override
    public StockDTO update(StockDTO stockDTO) {
        return null;
    }

    @Override
    public List<StockDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
