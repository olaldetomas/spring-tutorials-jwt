package tomas.mongodb.example.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import tomas.mongodb.example.models.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
    List<Tutorial> findByTitleContaining(String title);
    List<Tutorial> findByPublished(boolean published);
}