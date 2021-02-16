package tomas.mongodb.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import tomas.mongodb.example.models.ApplicationUser;
import tomas.mongodb.example.repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/sign-up")
    public void signUp(@RequestBody ApplicationUser user) {

        String userPassword = bCryptPasswordEncoder.encode(user.getPassword());
        
        userRepository.save(new ApplicationUser(user.getUsername(), userPassword));
    }
}
