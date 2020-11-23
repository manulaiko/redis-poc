package com.example.hiring.controller;

import com.example.hiring.dto.HiringResponseDTO;
import com.example.hiring.dto.SimulationRequestDTO;
import com.example.hiring.dto.SimulationResponseDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@SessionAttributes("simulation")
public class HiringController {
    @SuppressWarnings("unchecked")
    @PostMapping("/hiring")
    public HiringResponseDTO hiring(@SessionAttribute("simulation") Map<String, Object> sim) {
        var simLoan = (Map<String, Object>) sim.get("loan");

        var loan = SimulationRequestDTO.builder()
                .amount((int) simLoan.get("amount"))
                .years((int) simLoan.get("years"))
                .build();

        var simulation = SimulationResponseDTO.builder()
                .loan(loan)
                .total((double) sim.get("total"))
                .build();

        return HiringResponseDTO.builder()
                .hired(true)
                .simulation(simulation)
                .build();
    }
}
