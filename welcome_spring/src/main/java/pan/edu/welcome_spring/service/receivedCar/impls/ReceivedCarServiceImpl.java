package pan.edu.welcome_spring.service.receivedCar.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pan.edu.welcome_spring.model.Client;
import pan.edu.welcome_spring.model.ReceivedCar;
import pan.edu.welcome_spring.repository.ReceivedCarRepository;
import pan.edu.welcome_spring.service.receivedCar.interfaces.IReceivedCarService;

import java.time.LocalDateTime;
import java.util.List;

public class ReceivedCarServiceImpl implements IReceivedCarService{
    @Autowired
    ReceivedCarRepository receivedCarRepository;

    @Override
    public ReceivedCar create(ReceivedCar receivedCar) {
        receivedCar.setCreatedAt(LocalDateTime.now());
        receivedCar.setUpdateAt(LocalDateTime.now());
        return receivedCarRepository.save(receivedCar);
    }

    @Override
    public ReceivedCar get(String id) {
        return receivedCarRepository.findById(id).orElse(null);
    }

    @Override
    public ReceivedCar delete(String id) {
        ReceivedCar workLoad = this.get(id);
        receivedCarRepository.deleteById(workLoad.getId());
        return workLoad;
    }

    @Override
    public ReceivedCar update(ReceivedCar receivedCar) {
        receivedCar.setUpdateAt(LocalDateTime.now());
        return receivedCarRepository.save(receivedCar);
    }

    @Override
    public List<ReceivedCar> getAll() {
        return receivedCarRepository.findAll();
    }
}
