package com.ecommerce.computerequipmentsales.dto;

import com.ecommerce.computerequipmentsales.entity.Stock;
import lombok.Data;

@Data
public class ComputerCaseDTO extends BaseEntityDTO{

    private Long id;

    private String caseType;

    private boolean psu;

    private String psuLocation;

    private String psuPowerRating;

    private boolean transparentCase;

    private boolean audio;

    private boolean fan;

    private String frontOutputs;

    private String size;

    private String material;

    private String mainboardSupport;

    private Stock stock;
}
