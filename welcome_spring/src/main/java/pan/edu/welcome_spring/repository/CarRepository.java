package pan.edu.welcome_spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pan.edu.welcome_spring.model.Car;

public interface CarRepository extends MongoRepository<Car, String> {
}
