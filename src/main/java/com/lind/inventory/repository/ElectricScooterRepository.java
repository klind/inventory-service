package com.lind.inventory.repository;

import com.lind.inventory.model.Bicycle;
import com.lind.inventory.model.ElectricScooter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectricScooterRepository extends MongoRepository<ElectricScooter, String> {


}
