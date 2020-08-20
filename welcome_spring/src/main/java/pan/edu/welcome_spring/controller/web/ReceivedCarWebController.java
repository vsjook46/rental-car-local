package pan.edu.welcome_spring.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pan.edu.welcome_spring.service.client.impls.ClientServiceImpl;
import pan.edu.welcome_spring.service.receivedCar.impls.ReceivedCarServiceImpl;
import pan.edu.welcome_spring.service.receivedCar.impls.ReceivedCarServiceImpl;

@Controller
@RequestMapping("/web/receivedcar")
public class ReceivedCarWebController {

    ReceivedCarServiceImpl receivedCarService;

    @RequestMapping("/get/list")
    String showAll(Model model){
        model.addAttribute("list",receivedCarService.getAll());
        return "receivedCarlist";

}
}
