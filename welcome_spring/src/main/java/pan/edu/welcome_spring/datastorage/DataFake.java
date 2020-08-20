package pan.edu.welcome_spring.datastorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pan.edu.welcome_spring.model.Car;
import pan.edu.welcome_spring.model.Client;
import pan.edu.welcome_spring.model.ReceivedCar;
import pan.edu.welcome_spring.repository.CarRepository;
import pan.edu.welcome_spring.repository.ClientRepository;
import pan.edu.welcome_spring.repository.ReceivedCarRepository;

import javax.annotation.PostConstruct;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {
    @Autowired
    ClientRepository clientRepository;

    @Autowired
    CarRepository carRepository;

    @Autowired
    ReceivedCarRepository receivedCarRepository;


    private List<Car> cars = new LinkedList<>(Arrays.asList(
            new Car("Audi", 500, "Пикап","02/01/2020","05/02/2020"),
            new Car("RandomCar", 300, "Универсал","02/04/2020","02/06/2020"),
            new Car("Taxiwka", 200, "Седан", "","")
    ));

    private List<Client> clients = new LinkedList<>(Arrays.asList(
            new Client("Ivam", "Inam", "Ivsim", 425),
            new Client("Ivam", "Inam", "Ivsim", 425),
            new Client("Ivam", "Inam", "Ivsim", 425)

    ));

    private List<ReceivedCar> receivedCars = new LinkedList<>(
            Arrays.asList(
                    new ReceivedCar(cars.get(0),clients.get(0),"01/15/2020","02/15/2020"),
                    new ReceivedCar(cars.get(0),clients.get(0),"03/18/2020","04/24/2020"),
                    new ReceivedCar(cars.get(0),clients.get(0),"01/26/2020","05/18/2020")
            )
    );

    @PostConstruct
    public void init(){
        clientRepository.deleteAll();
        clientRepository.saveAll(clients);
        carRepository.deleteAll();
        carRepository.saveAll(cars);
        receivedCarRepository.deleteAll();
        receivedCarRepository.saveAll(receivedCars);
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Car> getGroups() {
        return cars;
    }

    public void setGroups(List<Car> groups) {
        this.cars = cars;
    }
}
