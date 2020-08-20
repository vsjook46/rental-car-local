package pan.edu.welcome_spring.dao.client.interfaces;

import pan.edu.welcome_spring.model.Client;

import java.util.List;

public interface IDaoClient {
    Client create(Client client);
    Client get(String id);
    Client delete(String id);
    Client update(Client client);
    List<Client> getAll();
}
