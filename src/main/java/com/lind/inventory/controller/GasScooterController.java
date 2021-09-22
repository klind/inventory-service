package com.lind.inventory.controller;

import com.lind.inventory.model.Bicycle;
import com.lind.inventory.model.GasScooter;
import com.lind.inventory.repository.GasScooterRepository;
import com.lind.inventory.service.BicycleService;
import com.lind.inventory.service.GasScooterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GasScooterController {

    @Autowired
    private GasScooterService gasScooterService;

    @GetMapping("/gasscooters")
    List<GasScooter> findAll() {
        return gasScooterService.findAll();
    }

}
