package com.ecommerce.computerequipmentsales.dto;

import com.ecommerce.computerequipmentsales.entity.Stock;
import lombok.Data;

@Data
public class HDDDTO extends BaseEntityDTO{

    private Long id;

    private String accessType;

    private String cacheMemory;

    private String diskSize;

    private String diskType;

    private String rotationSpeed;

    private String thickness;

    private String capacity;

    private Stock stockId;
}
