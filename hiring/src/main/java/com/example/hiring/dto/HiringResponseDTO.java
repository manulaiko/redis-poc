package com.example.hiring.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class HiringResponseDTO implements Serializable {
    private SimulationResponseDTO simulation;
    private boolean hired;
}
