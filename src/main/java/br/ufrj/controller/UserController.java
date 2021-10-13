package br.ufrj.controller;

import br.ufrj.model.Diet;
import br.ufrj.model.Measures;
import br.ufrj.model.UserData;
import br.ufrj.repository.UserDataRepository;
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

    @Autowired
    private UserDataController userDataController;

    @CrossOrigin
    @PostMapping
    public User createUser(@RequestBody User user){
        UserData userData = new UserData();
        Measures measures = new Measures();
        Diet diet = new Diet();
        userData.setMeasures(measures);
        userData.setDiet(diet);
        user.setUserData(userDataController.createUserData(userData));
        return userRepository.save(user);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public User getUser(@PathVariable(value = "id") Long userId){
        return userRepository.findById(userId).get();
    }

    @CrossOrigin
    @PostMapping("/login")
    public ResponseEntity<User> userLogin(@RequestBody User user) {

        User userLogin = userRepository.loginUser(user.getUsername(), user.getPassword());

        if(userLogin == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok().body(userLogin);
    }

}
