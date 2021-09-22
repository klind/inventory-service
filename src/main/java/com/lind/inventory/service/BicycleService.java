package com.lind.inventory.service;

import com.lind.inventory.model.Bicycle;
import com.lind.inventory.repository.BicycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BicycleService {

    @Autowired
    private BicycleRepository bicycleRepository;

    public List<Bicycle> findAll() {
        return bicycleRepository.findAll();
    }

    public Optional<Bicycle> findById(String id) {
        return bicycleRepository.findById(id);
    }

}
