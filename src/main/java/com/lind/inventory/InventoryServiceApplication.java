package com.lind.inventory;

import com.lind.inventory.model.Bicycle;
import com.lind.inventory.model.GasScooter;
import com.lind.inventory.model.enums.BicycleSize;
import com.lind.inventory.model.Customer;
import com.lind.inventory.model.Vehicle;
import com.lind.inventory.model.enums.EngineSize;
import com.lind.inventory.repository.BicycleRepository;
import com.lind.inventory.repository.CustomerRepository;
import com.lind.inventory.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryServiceApplication implements CommandLineRunner {
	@Autowired
	private VehicleRepository vehicleRepository;

	@Autowired
	// Spring Data MongoDB dynamically creates a proxy and injects it
	private CustomerRepository repository;

	@Autowired
	private BicycleRepository bicycleRepository;

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*vehicleRepository.deleteAll();

		Vehicle vehicle = GasScooter.builder().engineSize(EngineSize.CC_125).outOfService(false).brand("Vespa").color("red").rented(false).build();
		Vehicle bike = Bicycle.builder().brand("KTM").size(BicycleSize.SMALL).color("blue").rented(false).outOfService(false).build();
		Bicycle bike2 = Bicycle.builder().brand("KTM").size(BicycleSize.SMALL).color("blue").rented(false).outOfService(false).build();

		vehicleRepository.save(vehicle);
		vehicleRepository.save(bike);
		bicycleRepository.save(bike2);

		repository.deleteAll();*/

/*
		// save a couple of customers
		repository.save(new Customer("Alice", "Smith"));
		repository.save(new Customer("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}
*/

	}
}
