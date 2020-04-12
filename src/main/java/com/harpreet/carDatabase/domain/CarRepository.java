package com.harpreet.carDatabase.domain;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {

    List<Car> findByBrandOrderByYearAsc(String brand);
}
