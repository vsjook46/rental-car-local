package pan.edu.welcome_spring.dao.car.interfaces;

import pan.edu.welcome_spring.model.Car;

import java.util.List;

public interface IDaoCar {
    Car create(Car car);
    Car get(String id);
    Car delete(String id);
    Car update(Car car);
    List<Car> getAll();
}
