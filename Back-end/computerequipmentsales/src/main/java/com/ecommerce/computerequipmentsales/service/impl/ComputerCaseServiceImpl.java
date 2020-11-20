package com.ecommerce.computerequipmentsales.service.impl;

import com.ecommerce.computerequipmentsales.dto.ComputerCaseDTO;
import com.ecommerce.computerequipmentsales.service.ComputerCaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ComputerCaseServiceImpl implements ComputerCaseService {
    @Override
    public ComputerCaseDTO save(ComputerCaseDTO computerCaseDTO) {
        return null;
    }

    @Override
    public ComputerCaseDTO update(ComputerCaseDTO computerCaseDTO) {
        return null;
    }

    @Override
    public List<ComputerCaseDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
