package com.lind.inventory.service;

import com.lind.inventory.model.GasScooter;
import com.lind.inventory.repository.GasScooterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class GasScooterService {

    @Autowired
    private GasScooterRepository gasScooterRepository;

    public List<GasScooter> findAll() {
        return gasScooterRepository.findAll();
    }

    public Optional<GasScooter> findById(String id) {
        return gasScooterRepository.findById(id);
    }
}
