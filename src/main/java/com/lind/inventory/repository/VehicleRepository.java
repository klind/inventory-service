package com.lind.inventory.repository;

import com.lind.inventory.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle, String> {

    public Vehicle findByOutOfService(boolean outOfService);

}
