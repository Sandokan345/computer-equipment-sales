package com.ecommerce.computerequipmentsales.service.impl;

import com.ecommerce.computerequipmentsales.dto.ProcessorDTO;
import com.ecommerce.computerequipmentsales.service.ProcessorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProcessorServiceImpl implements ProcessorService {
    @Override
    public ProcessorDTO save(ProcessorDTO processorDTO) {
        return null;
    }

    @Override
    public ProcessorDTO update(ProcessorDTO processorDTO) {
        return null;
    }

    @Override
    public List<ProcessorDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
