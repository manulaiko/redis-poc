package com.example.simulation.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class SimulationResponseDTO implements Serializable {
    private SimulationRequestDTO loan;
    private double total;
}
