package pan.edu.welcome_spring.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pan.edu.welcome_spring.service.car.impls.CarServiceImpl;
import pan.edu.welcome_spring.service.client.impls.ClientServiceImpl;
import pan.edu.welcome_spring.service.receivedCar.impls.ReceivedCarServiceImpl;

@Controller
@RequestMapping("web/car")
public class CarWebController {
    @Autowired
    CarServiceImpl carService;

    @RequestMapping("get/list")
    String showAll(Model model){
        model.addAttribute("list",carService.getAll());
        return "carlist";
}
}
