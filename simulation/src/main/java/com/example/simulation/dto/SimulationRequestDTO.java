package com.example.simulation.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SimulationRequestDTO implements Serializable {
    private int amount;
    private int years;
}
