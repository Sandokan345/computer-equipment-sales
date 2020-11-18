package com.ecommerce.computerequipmentsales.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ComputerCase extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "CASE_TYPE")
    private String caseType;

    @NotNull
    @Column(name = "PSU")
    private boolean psu;

    @NotNull
    @Column(name = "PSU_LOCATION")
    private String psuLocation;

    @NotNull
    @Column(name = "PSU_POWER_RATING")
    private String psuPowerRating;

    @NotNull
    @Column(name = "TRANSPARENT_CASE")
    private boolean transparentCase;

    @NotNull
    @Column(name = "AUDIO")
    private boolean audio;

    @NotNull
    @Column(name = "FAN")
    private boolean fan;

    @NotNull
    @Column(name = "FRONT_OUTPUTS")
    private String frontOutputs;

    @NotNull
    @Column(name = "SIZE")
    private String size;

    @NotNull
    @Column(name = "MATERIAL")
    private String material;

    @NotNull
    @Column(name = "MAINBOARD_SUPPORT")
    private String mainboardSupport;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "STOCK_ID")
    private Stock stock;
}
