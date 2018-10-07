package pl.ottenburger.projekt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ottenburger.projekt.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Integer> {
    List<Car> findByStatus(String status);


}
