package com.ecommerce.computerequipmentsales.dto;

import lombok.Data;


@Data
public class BaseEntityDTO {

    private Long id;

    private String brand;

    private String productCode;

    private float pointScoring;

    private float price;
}
