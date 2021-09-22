package com.lind.inventory.controller;

import com.lind.inventory.model.Bicycle;
import com.lind.inventory.model.ElectricScooter;
import com.lind.inventory.service.BicycleService;
import com.lind.inventory.service.ElectricScooterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ElectricScooterController {

    @Autowired
    private ElectricScooterService electricScooterService;

    @GetMapping("/electricscooters")
    List<ElectricScooter> findAll() {
        return electricScooterService.findAll();
    }
}
