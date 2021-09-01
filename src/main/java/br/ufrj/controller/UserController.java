package br.ufrj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.ufrj.model.User;
import br.ufrj.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @CrossOrigin()
    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @CrossOrigin()
    @PostMapping("/login")
    public ResponseEntity<User> userLogin(@RequestBody User user) {

        User userLogin = userRepository.loginUser(user.getUsername(), user.getPassword());

        if(userLogin == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok().body(userLogin);
    }

}
