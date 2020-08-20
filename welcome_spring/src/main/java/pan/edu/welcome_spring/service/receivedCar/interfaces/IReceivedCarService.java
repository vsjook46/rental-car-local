package pan.edu.welcome_spring.service.receivedCar.interfaces;
import pan.edu.welcome_spring.model.ReceivedCar;

import java.util.List;

public interface IReceivedCarService {
    ReceivedCar create (ReceivedCar receivedCar);
    ReceivedCar get(String id);
    ReceivedCar delete (String id);
    ReceivedCar update (ReceivedCar receivedCar);
    List<ReceivedCar> getAll();
}
