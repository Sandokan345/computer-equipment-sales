package com.ecommerce.computerequipmentsales.service.impl;

import com.ecommerce.computerequipmentsales.dto.MonitorDTO;
import com.ecommerce.computerequipmentsales.service.MonitorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class MonitorServiceImpl implements MonitorService {
    @Override
    public MonitorDTO save(MonitorDTO monitorDTO) {
        return null;
    }

    @Override
    public MonitorDTO update(MonitorDTO monitorDTO) {
        return null;
    }

    @Override
    public List<MonitorDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
