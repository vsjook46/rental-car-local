package pan.edu.welcome_spring.service.car.interfaces;

import pan.edu.welcome_spring.model.Car;

import java.util.List;

public interface ICarService {
    Car create (Car car);
    Car get(String id);
    Car delete (String id);

    List<Car> getAll();
}
