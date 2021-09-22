package com.lind.inventory.repository;

import com.lind.inventory.model.Bicycle;
import com.lind.inventory.model.Vehicle;
import com.lind.inventory.model.enums.VehicleType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BicycleRepository extends MongoRepository<Bicycle, String> {


}
