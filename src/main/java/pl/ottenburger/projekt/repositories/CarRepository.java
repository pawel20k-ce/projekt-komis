package pl.ottenburger.projekt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ottenburger.projekt.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
