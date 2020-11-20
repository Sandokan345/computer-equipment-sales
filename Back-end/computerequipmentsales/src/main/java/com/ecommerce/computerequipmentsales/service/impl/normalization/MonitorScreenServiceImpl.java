package com.ecommerce.computerequipmentsales.service.impl.normalization;

import com.ecommerce.computerequipmentsales.dto.normalizationDTO.MonitorScreenDTO;
import com.ecommerce.computerequipmentsales.service.normalization.MonitorScreenService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class MonitorScreenServiceImpl implements MonitorScreenService {
    @Override
    public MonitorScreenDTO save(MonitorScreenDTO monitorScreenDTO) {
        return null;
    }

    @Override
    public MonitorScreenDTO update(MonitorScreenDTO monitorScreenDTO) {
        return null;
    }

    @Override
    public List<MonitorScreenDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
