package com.harpreet.carDatabase.web;

import com.harpreet.carDatabase.domain.Car;
import com.harpreet.carDatabase.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    CarRepository carRepository;

    @RequestMapping("/cars")
    public Iterable<Car> getCars(){
        return carRepository.findAll();
    }
}
