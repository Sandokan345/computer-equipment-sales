package com.ecommerce.computerequipmentsales.service.impl;

import com.ecommerce.computerequipmentsales.dto.HDDDTO;
import com.ecommerce.computerequipmentsales.service.HDDService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class HDDServiceImpl implements HDDService {
    @Override
    public HDDDTO save(HDDDTO hdddto) {
        return null;
    }

    @Override
    public HDDDTO update(HDDDTO hdddto) {
        return null;
    }

    @Override
    public List<HDDDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
