package com.doby2333.IED.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PlantDto {
    private Long id;
    private Integer light_freq;
    private Integer light_intense;
    private Integer water_freq;
    private Integer water_intense;
}