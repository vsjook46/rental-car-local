package pan.edu.welcome_spring.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import pan.edu.welcome_spring.model.Client;
import pan.edu.welcome_spring.datastorage.DataFake;
import pan.edu.welcome_spring.model.Client;
import pan.edu.welcome_spring.service.client.impls.ClientServiceImpl;
import pan.edu.welcome_spring.service.client.impls.ClientServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientRestController {


    ClientServiceImpl clientService;

    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello, from Client Controller</h1>";
    }

    @RequestMapping(value = "get/list",method = RequestMethod.GET)
    List<Client> getTeacherList(){
        return clientService.getAll();
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    Client getClient(@PathVariable("id") String id){
        return clientService.get(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    Client deleteClient(@PathVariable("id") String id){
        return clientService.delete(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Client createClient(@RequestBody Client client){
        return clientService.create(client);
    }


}
