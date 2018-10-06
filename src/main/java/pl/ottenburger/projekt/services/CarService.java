package pl.ottenburger.projekt.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ottenburger.projekt.model.Car;
import pl.ottenburger.projekt.repositories.CarRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car getCar(Integer id) {
        return carRepository.findById(id).get();
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public void saveCarImage(byte[] bytes, Car car) throws IOException {
        if (car.getId() == null) {
            throw new RuntimeException("Nie można zapisać obrazka.");
        }
        Files.write(Paths.get("./images/" + car.getId() + ".jpg"), bytes, StandardOpenOption.CREATE_NEW);
    }
}



