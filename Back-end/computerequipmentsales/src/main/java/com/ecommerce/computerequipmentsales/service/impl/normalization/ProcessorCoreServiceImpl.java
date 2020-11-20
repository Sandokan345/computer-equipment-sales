package com.ecommerce.computerequipmentsales.service.impl.normalization;

import com.ecommerce.computerequipmentsales.dto.normalizationDTO.ProcessorCoreDTO;
import com.ecommerce.computerequipmentsales.service.normalization.ProcessorCoreService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProcessorCoreServiceImpl implements ProcessorCoreService {
    @Override
    public ProcessorCoreDTO save(ProcessorCoreDTO processorCoreDTO) {
        return null;
    }

    @Override
    public ProcessorCoreDTO update(ProcessorCoreDTO processorCoreDTO) {
        return null;
    }

    @Override
    public List<ProcessorCoreDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
