package com.example.simulation.controller;

import com.example.simulation.dto.SimulationRequestDTO;
import com.example.simulation.dto.SimulationResponseDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SimulationController {
    @PostMapping("/simulate")
    public SimulationResponseDTO simulate(@RequestBody SimulationRequestDTO request, HttpSession session) {
        var simulation = SimulationResponseDTO.builder()
                .loan(request)
                .total(request.getAmount() + (request.getAmount() * (request.getYears() / 100d)))
                .build();

        session.setAttribute("simulation", simulation);

        return simulation;
    }
}
