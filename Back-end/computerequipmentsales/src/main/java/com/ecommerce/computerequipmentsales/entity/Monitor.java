package com.ecommerce.computerequipmentsales.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Monitor extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "SCREEN_SIZE")
    private String screenSize;

    @NotNull
    @Column(name = "RESOLUTION")
    private String resolution;

    @NotNull
    @Column(name = "REFRESH_SPEED")
    private String refreshSpeed;

    @NotNull
    @Column(name = "HDR")
    private boolean hdr;

    @NotNull
    @Column(name = "REACTION_TIME")
    private String reactionTime;

    @NotNull
    @Column(name = "OUTPUTS")
    private String outputs;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "STOCK_ID")
    private Stock stock;
}
