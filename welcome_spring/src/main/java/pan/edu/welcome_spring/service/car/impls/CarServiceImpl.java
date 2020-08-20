package pan.edu.welcome_spring.service.car.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pan.edu.welcome_spring.model.Car;
import pan.edu.welcome_spring.model.Client;
import pan.edu.welcome_spring.repository.CarRepository;
import pan.edu.welcome_spring.service.car.interfaces.ICarService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CarServiceImpl implements ICarService{
    @Autowired
    CarRepository carRepository;

    @Override
    public Car create(Car car) {
        car.setCreatedAt(LocalDateTime.now());
        /*car.setUpdateAt(LocalDateTime.now());*/
        return carRepository.save(car);
    }

    @Override
    public Car get(String id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public Car delete(String id) {
        Car car = this.get(id);
        carRepository.deleteById(car.getId());
        return car;
    }


    @Override
    public List<Car> getAll() {
        return carRepository.findAll();
    }
}
