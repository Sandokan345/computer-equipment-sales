package com.ecommerce.computerequipmentsales.service.impl.normalization;

import com.ecommerce.computerequipmentsales.dto.normalizationDTO.ComputerCasePSUDTO;
import com.ecommerce.computerequipmentsales.service.normalization.ComputerCasePSUService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ComputerCasePSUServiceImpl implements ComputerCasePSUService {
    @Override
    public ComputerCasePSUDTO save(ComputerCasePSUDTO computerCasePSUDTO) {
        return null;
    }

    @Override
    public ComputerCasePSUDTO update(ComputerCasePSUDTO computerCaseDTO) {
        return null;
    }

    @Override
    public List<ComputerCasePSUDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
