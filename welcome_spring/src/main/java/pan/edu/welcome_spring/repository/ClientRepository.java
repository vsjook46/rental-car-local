package pan.edu.welcome_spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pan.edu.welcome_spring.model.Client;
public interface ClientRepository extends MongoRepository<Client, String> {
}
