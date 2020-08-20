package pan.edu.welcome_spring.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pan.edu.welcome_spring.form.ClientForm;
import pan.edu.welcome_spring.model.Client;
import pan.edu.welcome_spring.service.client.impls.ClientServiceImpl;

import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web/client")
public class ClientWebController {

    ClientServiceImpl clientService;

    @RequestMapping("/get/list")
    String showAll(Model model) {
        model.addAttribute("list", clientService.getAll());
        return "clientlist";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteClient(@PathVariable("id") String id, Model model) {
        clientService.delete(id);
        model.addAttribute("list", clientService.getAll());
        return "redirect:/web/teacher/get/list";
    }

    @RequestMapping(value = "/reloadDB", method = RequestMethod.GET)
    String reloadDataBase() {
        clientService.reloadDataBase();
        return "redirect:/web/client/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createClient(Model model){
        ClientForm clientForm = new ClientForm();
        model.addAttribute("clientForm", clientForm);
        return "addClient";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createClient(Model model, @ModelAttribute("clientForm") ClientForm clientForm){
        Client client = new Client();
        client.setName(clientForm.getName());
        client.setSurName(clientForm.getSurName());
        client.setAddress(clientForm.getAddress());
        client.setPhoneNumber(clientForm.getPhoneNumber());
        clientService.create(client);

        model.addAttribute("clients",clientService.getAll());
        return "redirect:/web/client/get/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateClient(@PathVariable("id") String id, Model model){
        Client client = clientService.get(id);
        ClientForm clientForm = new ClientForm(
                client.getId(),
                client.getName(),
                client.getSurName(),
                client.getAddress(),
                client.getPhoneNumber()
        );
        model.addAttribute("clientForm", clientForm);
        return "updateClient";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateTeacher(Model model, @PathVariable("id") String id, @ModelAttribute("clientForm") ClientForm clientForm){
        Client client = new Client();
        client.setId(id);
        client.setName(clientForm.getName());
        client.setSurName(clientForm.getSurName());
        client.setAddress(clientForm.getAddress());
        client.setPhoneNumber(clientForm.getPhoneNumber());
        clientService.update(client);

        model.addAttribute("clients",clientService.getAll());
        return "redirect:/web/client/get/list";
    }

}
