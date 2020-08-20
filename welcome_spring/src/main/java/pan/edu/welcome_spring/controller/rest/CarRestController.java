package pan.edu.welcome_spring.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pan.edu.welcome_spring.model.Car;
import pan.edu.welcome_spring.model.Client;
import pan.edu.welcome_spring.service.car.impls.CarServiceImpl;
import pan.edu.welcome_spring.service.client.impls.ClientServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarRestController {
    @Autowired
    CarServiceImpl carService;

    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello, from Car Controller</h1>";
    }

    @RequestMapping(value = "get/list",method = RequestMethod.GET)
    List<Car> getGroupList(){
        return carService.getAll();
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    Car getGroup(@PathVariable("id") String id){
        return carService.get(id);
    }
}
