package com.ecommerce.computerequipmentsales.dto;

import com.ecommerce.computerequipmentsales.entity.Stock;
import lombok.Data;

@Data
public class ProcessorDTO extends BaseEntityDTO{

    private Long id;

    private String processorSocketType;

    private String model;

    private String frequencySpeed;

    private int coreAmount;

    private String coreName;

    private String internalGraphic;

    private int threadAmount;

    private boolean cooler;

    private String processorType;

    private Stock stock;
}
