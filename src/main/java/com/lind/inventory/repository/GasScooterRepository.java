package com.lind.inventory.repository;

import com.lind.inventory.model.ElectricScooter;
import com.lind.inventory.model.GasScooter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GasScooterRepository extends MongoRepository<GasScooter, String> {


}
