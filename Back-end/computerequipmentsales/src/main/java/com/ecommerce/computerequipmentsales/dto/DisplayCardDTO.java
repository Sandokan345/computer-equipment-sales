package com.ecommerce.computerequipmentsales.dto;

import com.ecommerce.computerequipmentsales.entity.Stock;
import com.ecommerce.computerequipmentsales.entity.normalization.DisplayCardGPU;
import com.ecommerce.computerequipmentsales.entity.normalization.DisplayCardMemory;
import lombok.Data;

@Data
public class DisplayCardDTO extends BaseEntityDTO{

    private Long id;

    private String producer;

    private String gpuSerial;

    private String gpuModel;

    private String maxCoreSpeed;

    private int cudaAmount;

    private String openGL;

    private String directX;

    private String memoryType;

    private String memorySpeed;

    private String memoryCapacity;

    private String memoryInterface;

    private String hdmi;

    private String displayPort;

    private String maxResolution;

    private boolean sliSupport;

    private String coolingFan;

    private int slot;

    private boolean hdcpReady;

    private DisplayCardGPU displayCardGPUId;

    private DisplayCardMemory displayCardMemory;

    private Stock stockId;
}
