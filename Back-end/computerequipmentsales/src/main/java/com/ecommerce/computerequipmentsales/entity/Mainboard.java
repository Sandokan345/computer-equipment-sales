package com.ecommerce.computerequipmentsales.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Mainboard extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "SOCKET")
    private String socket;

    @NotNull
    @Column(name = "CHIPSET")
    private String chipset;

    @NotNull
    @Column(name = "RAM_SLOT_AMOUNT")
    private int ramSlotAmount;

    @NotNull
    @Column(name = "MAX_RAM_SUPPORT")
    private String maxRamSupport;

    @NotNull
    @Column(name = "RAM_TYPE")
    private String ramType;

    @NotNull
    @Column(name = "RAM_FREQUENCY_SPEED")
    private String ramFrequencySpeed;

    @NotNull
    @Column(name = "COMPATIBLE_PROCESSORS")
    private String compatibleProcessors;

    @NotNull
    @Column(name = "SOUND_CHIP")
    private String soundChip;

    @NotNull
    @Column(name = "SOUND_CHANNEL_AMOUNT")
    private String soundChannelAmount;

    @NotNull
    @Column(name = "HDMI")
    private boolean hdmi;

    @NotNull
    @Column(name = "DISPLAY_PORT")
    private boolean displayPort;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "STOCK_ID")
    private Stock stock;
}
