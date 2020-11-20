package com.ecommerce.computerequipmentsales.service.impl;

import com.ecommerce.computerequipmentsales.dto.SSDDTO;
import com.ecommerce.computerequipmentsales.service.SSDService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class SSDServiceImpl implements SSDService {
    @Override
    public SSDDTO save(SSDDTO ssddto) {
        return null;
    }

    @Override
    public SSDDTO update(SSDDTO ssddto) {
        return null;
    }

    @Override
    public List<SSDDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
