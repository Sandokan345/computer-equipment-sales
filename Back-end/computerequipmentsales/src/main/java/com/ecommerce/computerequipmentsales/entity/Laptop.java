package com.ecommerce.computerequipmentsales.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Laptop extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "PROCESSOR_SERIAL")
    private String processorSerial;

    @NotNull
    @Column(name = "PROCESSOR_MODEL")
    private String processorModel;

    @NotNull
    @Column(name = "GPU_PRODUCER")
    private String gpuProducer;

    @NotNull
    @Column(name = "GPU_MODEL")
    private String gpuModel;

    @NotNull
    @Column(name = "GPU_SERIAL")
    private String gpuSerial;

    @NotNull
    @Column(name = "GPU_RAM_SHARING")
    private boolean gpuRamSharing;

    @NotNull
    @Column(name = "GPU_RAM")
    private String gpuRam;

    @NotNull
    @Column(name = "RAM")
    private String ram;

    @NotNull
    @Column(name = "RAM_TYPE")
    private String ramType;

    @NotNull
    @Column(name = "RAM_SPEED")
    private String ramSpeed;

    @NotNull
    @Column(name = "HDD")
    private boolean hdd;

    @NotNull
    @Column(name = "HDD_CAPACITY")
    private String hddCapacity;

    @NotNull
    @Column(name = "SSD")
    private boolean ssd;

    @NotNull
    @Column(name = "SSD_CAPACITY")
    private String ssdCapacity;

    @NotNull
    @Column(name = "DISK_ROTATION_SPEED")
    private String diskRotationSpeed;

    @NotNull
    @Column(name = "HDMI")
    private boolean hdmi;

    @NotNull
    @Column(name = "CAMERA")
    private boolean camera;

    @NotNull
    @Column(name = "BLUETOOTH")
    private String bluetooth;

    @NotNull
    @Column(name = "WIRELESS")
    private String wireless;

    @NotNull
    @Column(name = "ETHERNET")
    private boolean ethernet;

    @NotNull
    @Column(name = "TOUCHPAD")
    private boolean touchpad;

    @NotNull
    @Column(name = "SCREEN_SIZE")
    private String screenSize;

    @NotNull
    @Column(name = "SCREEN_RESOLUTION")
    private String screenResolution;

    @NotNull
    @Column(name = "OPERATING_SYSTEM")
    private String operatingSystem;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "STOCK_ID")
    private Stock stock;
}
