package br.ufrj.controller;

import br.ufrj.model.Diet;
import br.ufrj.model.UserData;
import br.ufrj.repository.DietRepository;
import br.ufrj.repository.MeasuresRepository;
import br.ufrj.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userData")
public class UserDataController {
    @Autowired
    private UserDataRepository userDataRepository;

    @Autowired
    private MeasuresRepository measuresRepository;

    @Autowired
    private DietRepository dietRepository;

    @CrossOrigin()
    @PostMapping
    public UserData createUserData(@RequestBody UserData userData){
        measuresRepository.save(userData.getMeasures());
        dietRepository.save(userData.getDiet());
        return userDataRepository.save(userData);
    }
}
