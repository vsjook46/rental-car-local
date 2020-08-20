package pan.edu.welcome_spring.service.client.interfaces;

import pan.edu.welcome_spring.model.Client;

import java.util.List;
public interface IClientService {
    Client create (Client client);
    Client get(String id);
    Client delete (String id);
    Client update (Client client);
    List<Client> getAll();
}
