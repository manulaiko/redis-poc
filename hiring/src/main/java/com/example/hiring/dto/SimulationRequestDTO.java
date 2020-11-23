package com.example.hiring.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class SimulationRequestDTO implements Serializable {
    private int amount;
    private int years;
}
