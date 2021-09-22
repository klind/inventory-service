package com.lind.inventory.service;

import com.lind.inventory.model.Bicycle;
import com.lind.inventory.model.ElectricScooter;
import com.lind.inventory.repository.ElectricScooterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ElectricScooterService {

    @Autowired
    private ElectricScooterRepository electricScooterRepository;

    public List<ElectricScooter> findAll() {
        return electricScooterRepository.findAll();
    }

    public Optional<ElectricScooter> findById(String id) {
        return electricScooterRepository.findById(id);
    }
}
