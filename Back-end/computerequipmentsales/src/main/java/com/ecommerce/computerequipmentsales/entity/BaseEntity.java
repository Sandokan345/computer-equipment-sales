package com.ecommerce.computerequipmentsales.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "BRAND")
    private String brand;

    @NotNull
    @Column(name = "PRODUCT_CODE", unique = true)
    private Long productCode;

    @NotNull
    @Column(name = "POINT_SCORING")
    private float pointScoring;

    @NotNull
    @Column(name = "PRICE")
    private float price;
}
