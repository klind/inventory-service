package com.lind.inventory.controller;

import com.lind.inventory.model.Bicycle;
import com.lind.inventory.model.Vehicle;
import com.lind.inventory.service.BicycleService;
import com.lind.inventory.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class BicycleController {

    @Autowired
    private BicycleService bicycleService;

    @GetMapping("/bicycles")
    List<Bicycle> findAll() {
        return bicycleService.findAll();
    }
    

}
