package com.ecommerce.computerequipmentsales.dto;

import com.ecommerce.computerequipmentsales.entity.Stock;
import lombok.Data;

@Data
public class SSDDTO extends BaseEntityDTO{

    private Long id;

    private String capacity;

    private String type;

    private String accessInterface;

    private int chip;

    private String maxReadingSpeed;

    private String maxWritingSpeed;

    private Stock stockId;
}
