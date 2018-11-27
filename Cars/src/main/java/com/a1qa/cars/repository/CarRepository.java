package com.a1qa.cars.repository;

import com.a1qa.cars.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/api/cars")
public interface CarRepository extends JpaRepository<Car, Integer> {

}
