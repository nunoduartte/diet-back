package br.ufrj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.ufrj.model.User;
import br.ufrj.repository.UserRepository;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }
    
    @PostMapping("/login")
    public ResponseEntity<User> userLogin(@RequestParam(required = false) String username,
    									  @RequestParam(required = false) String email,
    									  @RequestParam(required = false) String password) {
    	
    	User userLogin = userRepository.loginUser(username, email, password);
    	
    	if(userLogin == null)
    		return ResponseEntity.notFound().build();
    	return ResponseEntity.ok().body(userLogin);
    }
}
