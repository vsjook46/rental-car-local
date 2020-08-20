package pan.edu.welcome_spring.dao.receivedCar.interfaces;

import pan.edu.welcome_spring.model.ReceivedCar;

import java.util.List;

public interface IDaoReceivedCar {
    ReceivedCar create(ReceivedCar workLoad);
    ReceivedCar get(String id);
    ReceivedCar delete(String id);
    ReceivedCar update(ReceivedCar workLoad);
    List<ReceivedCar> getAll();
}
