package pan.edu.welcome_spring.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pan.edu.welcome_spring.model.Car;
import pan.edu.welcome_spring.model.ReceivedCar;
import pan.edu.welcome_spring.service.car.impls.CarServiceImpl;
import pan.edu.welcome_spring.service.receivedCar.impls.ReceivedCarServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/receivedcar")
public class ReceivedCarController {

    ReceivedCarServiceImpl receivedCarService;

    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello, from Received Car Controller</h1>";
    }

    @RequestMapping(value = "get/list",method = RequestMethod.GET)
    List<ReceivedCar> getWorkLoadList(){
        return receivedCarService.getAll();
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    ReceivedCar getWorkLoad(@PathVariable("id") String id){
        return receivedCarService.get(id);
    }
}
