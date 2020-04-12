package com.harpreet.carDatabase;

import com.harpreet.carDatabase.domain.Car;
import com.harpreet.carDatabase.domain.Owner;
import com.harpreet.carDatabase.domain.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import com.harpreet.carDatabase.domain.CarRepository;


@SpringBootApplication
public class carDatabaseApplication {
	private static final Logger logger = LoggerFactory.getLogger(carDatabaseApplication.class);

	@Autowired
	private CarRepository carRepository;

	@Autowired
	private OwnerRepository ownerRepository;

	public static void main(String[] args) {

		SpringApplication.run(carDatabaseApplication.class, args);
		logger.info("Hello Spring Boot");
	}
	@Bean
	CommandLineRunner runner(){
		return args -> {

			Owner rocket = new Owner("rocket", "singh");
			Owner spock = new Owner("spock", "singh");

			ownerRepository.save(rocket);
			ownerRepository.save(spock);

			carRepository.save(new Car("BMW", "328i", "black",
					"4avw731", 1998, 32000, spock ));
			carRepository.save(new Car("Lexus", "330", "white",
					"4Avl730", 2004, 33000, spock));
			carRepository.save(new Car("Nissan", "leaf", "blue",
					"4nis430", 2014, 35000, rocket));


		};
	}

}
