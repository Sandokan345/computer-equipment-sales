package com.ecommerce.computerequipmentsales.dto;

import com.ecommerce.computerequipmentsales.entity.Stock;
import lombok.Data;

@Data
public class LaptopDTO extends BaseEntityDTO{

    private Long id;

    private String processorSerial;

    private String processorModel;

    private String gpuProducer;

    private String gpuModel;

    private String gpuSerial;

    private boolean gpuRamSharing;

    private String gpuRam;

    private String ram;

    private String ramType;

    private String ramSpeed;

    private boolean hdd;

    private String hddCapacity;

    private boolean ssd;

    private String ssdCapacity;

    private String diskRotationSpeed;

    private boolean hdmi;

    private boolean camera;

    private String bluetooth;

    private String wireless;

    private boolean ethernet;

    private boolean touchpad;

    private String screenSize;

    private String screenResolution;

    private String operatingSystem;

    private Stock stock;
}
