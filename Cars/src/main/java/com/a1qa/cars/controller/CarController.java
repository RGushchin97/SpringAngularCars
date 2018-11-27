package com.a1qa.cars.controller;

import com.a1qa.cars.entity.Car;
import com.a1qa.cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/cars")
public class CarController {

    @Autowired
    private CarRepository repository;

    @GetMapping
    public Iterable<Car> findAll() {
        return repository.findAll();
    }

    @PostMapping(consumes = "application/json")
    public Car createCar(@RequestBody Car car) {
        return repository.save(car);
    }

    @DeleteMapping()
    public void deleteCar(@RequestParam("id") int id) {
        repository.delete(id);
    }

    @GetMapping(path = "/{id}")
    public Car find(@PathVariable("id") int id) {
        return repository.findOne(id);
    }
}
