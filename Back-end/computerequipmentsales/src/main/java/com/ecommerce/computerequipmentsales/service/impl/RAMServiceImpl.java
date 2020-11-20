package com.ecommerce.computerequipmentsales.service.impl;

import com.ecommerce.computerequipmentsales.dto.RAMDTO;
import com.ecommerce.computerequipmentsales.service.RAMService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class RAMServiceImpl implements RAMService {
    @Override
    public RAMDTO save(RAMDTO ramdto) {
        return null;
    }

    @Override
    public RAMDTO update(RAMDTO ramdto) {
        return null;
    }

    @Override
    public List<RAMDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
