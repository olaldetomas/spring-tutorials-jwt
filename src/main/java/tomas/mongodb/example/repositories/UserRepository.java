package tomas.mongodb.example.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tomas.mongodb.example.models.ApplicationUser;

public interface UserRepository extends MongoRepository<ApplicationUser, String>{
    ApplicationUser findByUsernameContaining(String username);
}
